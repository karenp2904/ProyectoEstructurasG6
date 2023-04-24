package Servidor.Modelos;

import Estructuras.Colas.ColasList;
import Servidor.Dominio.Factura;
import Servidor.Interfaces.IController.IControllerRepartidor;

public class ModeloRepartidor implements IControllerRepartidor {
    @Override
    public ColasList imprimirRuta() {
        return null;
    }

    @Override
    public boolean recibirPedido(Factura factura) {
        return false;
    }

    @Override
    public boolean estadoPedido(Boolean estado) {
        return false;
    }

    @Override
    public boolean disponibilidadRepartidor() {
        return false;
    }
}
