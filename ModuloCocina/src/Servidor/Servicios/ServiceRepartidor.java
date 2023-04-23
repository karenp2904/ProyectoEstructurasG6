package Servidor.Servicios;

import Estructuras.Colas.ColasList;
import Servidor.Controladores.ControllerRepartidor;
import Servidor.Dominio.Factura;
import Servidor.Interfaces.IServices.IRepartidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceRepartidor extends UnicastRemoteObject implements IRepartidor {

    private static final long serialVersionUID = 1L;

    private ControllerRepartidor controllerRepartidor;

    public ServiceRepartidor(ControllerRepartidor controllerRepartidor) throws RemoteException {
        this.controllerRepartidor=controllerRepartidor;
    }

    @Override
    public ColasList imprimirRuta() {
        return controllerRepartidor.imprimirRuta();
    }

    @Override
    public boolean recibirPedido(Factura factura) {
        return controllerRepartidor.recibirPedido(factura);
    }

    @Override
    public boolean estadoPedido(Boolean estado) {
        return controllerRepartidor.estadoPedido(estado);
    }

    @Override
    public boolean disponibilidadRepartidor() {
        return controllerRepartidor.disponibilidadRepartidor();
    }
}
