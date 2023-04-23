package Servidor.Controladores;

import Estructuras.Colas.ColasList;
import Servidor.Dominio.Factura;
import Servidor.Interfaces.IController.IControllerRepartidor;
import Servidor.Modelos.ModeloRepartidor;

import java.io.Serializable;

public class ControllerRepartidor implements IControllerRepartidor , Serializable {

    private ModeloRepartidor modeloRepartidor;
    @Override
    public ColasList imprimirRuta() {
        return modeloRepartidor.imprimirRuta();
    }

    @Override
    public boolean recibirPedido(Factura factura) {
        return modeloRepartidor.recibirPedido(factura);
    }

    @Override
    public boolean estadoPedido(Boolean estado) {
        return modeloRepartidor.estadoPedido(estado);
    }

    @Override
    public boolean disponibilidadRepartidor() {
        return modeloRepartidor.disponibilidadRepartidor();
    }
}
