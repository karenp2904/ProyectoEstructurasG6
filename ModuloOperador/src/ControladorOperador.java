import Estructuras.Colas.ColasArray;
import VistaOperador.VistaOperador;
import VistaOperador.VistaPrincipalOpera;
import VistaOperador.VistaOperadorDatos;
import ControladorOperador.ClienteOperador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.Scanner;

public class ControladorOperador {
    public static void main(String[] args) throws RemoteException {
        Properties properties= new Properties();
        try {
            properties.load(new FileInputStream(new File("ModuloOperador/src/client.properties")));
            ClienteOperador client = new ClienteOperador(
                    (String) properties.get("IP"),
                    (String) properties.get("PORT"),
                    (String) properties.get("SERVICENAME"));
            Scanner sc= new Scanner(System.in);
            System.out.println("BIENVENIDO AL CAJERO By Karen");
            VistaPrincipalOpera vista= new VistaPrincipalOpera();
            vista.setVisible(true);
            VistaOperador vistaOperador= new VistaOperador();
            vistaOperador.setVisible(false);
            VistaOperadorDatos vistaOperadorDatos=new VistaOperadorDatos();
            vistaOperadorDatos.setVisible(false);

            //Aqui se conectan los datos que otorga la barra de busqueda del cliente por numero de telefono
            ColasArray cola=  client.busquedaCliente(vistaOperador.buscarCliente());
            //aparece en la vista los datos del cliente
            vistaOperador.setNombreCliente(cola.dequeue().toString());
            vistaOperador.setDireccionCliente(cola.dequeue().toString());
            vistaOperador.setTelefonoCliente(cola.dequeue().toString());
            vistaOperador.setTipoCliente(cola.dequeue().toString());
            //segun el numero de telefono registrado se muestran los pedidos frecuentes del cliente
            vistaOperador.setPedidosCliente(client.pedidosFrecuentesCliente(vistaOperador.buscarCliente()));

            //para el ingreso de pedido y del nuevo cliente
            client.registrarCliente(vistaOperadorDatos.ingresarNombre(), vistaOperadorDatos.ingresarDireccion(), vistaOperadorDatos.ingresarTelefono(), vistaOperadorDatos.ingresarTipoCliente());
            client.actualizarCliente(vistaOperadorDatos.ingresarNombre(), vistaOperadorDatos.ingresarDireccion(), vistaOperadorDatos.ingresarTelefono(), vistaOperadorDatos.ingresarTipoCliente());
            client.ingresarPedido(vistaOperadorDatos.ingresarProducto(),vistaOperadorDatos.ingresarCodido(), vistaOperadorDatos.ingresarCantidad());
            client.actualizarPedido(vistaOperadorDatos.ingresarProducto(),vistaOperadorDatos.ingresarCodido(), vistaOperadorDatos.ingresarCantidad());

            //para buscar un pedido
            client.busquedaPedido(vistaOperadorDatos.buscarPedido());


        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("RMI Client");
    }


}
