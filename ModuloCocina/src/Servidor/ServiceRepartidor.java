package Servidor;

import Estructuras.Colas.ColasList;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceRepartidor extends UnicastRemoteObject implements IRepartidor{

    private static final long serialVersionUID = 1L;
    protected ServiceRepartidor() throws RemoteException {
    }

    @Override
    public ColasList imprimirRuta() {
        return null;
    }

    @Override
    public boolean recibirPedido(Factura factura) {
        return false;
    }

    @Override
    public boolean estadoPedido() {
        return false;
    }

    @Override
    public boolean disponibilidadRepartidor() {
        return false;
    }
}
