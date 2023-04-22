package Servidor.Controladores;

import Estructuras.Colas.ColasList;
import Servidor.Dominio.Factura;
import Servidor.Interfaces.IController.IControllerRepartidor;

import java.io.Serializable;

public class ControllerRepartidor implements IControllerRepartidor , Serializable {
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
