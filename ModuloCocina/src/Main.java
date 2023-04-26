import Servidor.Controladores.*;
import Servidor.Servicios.*;
import Shared.Environment;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, String> properties = Environment.getInstance().getVariables();

            ServiceAdmin serviceAdmin = new ServiceAdmin(new ControllerAdmin());
            Server modAdmin = new Server(properties.get("IP"), properties.get("PORT0"), properties.get("SERVICE0"), serviceAdmin);

            ServiceCocina serviceCocina = new ServiceCocina(new ControllerCocina());
            Server modCocina = new Server(properties.get("IP"), properties.get("PORT1"), properties.get("SERVICE1"), serviceCocina);

            ServiceOperador serviceOperador = new ServiceOperador(new ControllerOperador());
            Server modOperador = new Server(properties.get("IP"), properties.get("PORT2"), properties.get("SERVICE2"), serviceOperador);

            ServiceRegistro serviceRegistro = new ServiceRegistro(new ControllerRegistro());
            Server modRegistgro = new Server(properties.get("IP"), properties.get("PORT3"), properties.get("SERVICE3"), serviceRegistro);

            ServiceRepartidor serviceRepartidor = new ServiceRepartidor(new ControllerRepartidor());
            Server modRepartidor = new Server(properties.get("IP"), properties.get("PORT4"), properties.get("SERVICE4"), serviceRepartidor);

            Thread[] threadList = {new Thread(modRegistgro), new Thread(modAdmin), new Thread(modOperador), new Thread(modCocina), new Thread(modRepartidor)};

            for (Thread thread : threadList) { //hilos
                thread.start();
            }
            Logger.getLogger("Server").log(Level.INFO, "Server is running...");
        } catch (Exception e) {
            Logger.getLogger("Server").log(Level.WARNING, e.getMessage(), e);
        }
    }

}
