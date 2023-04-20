package Servidor.Servicios;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Interfaces.ICocina;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceCocina extends UnicastRemoteObject implements ICocina {

    private static final long serialVersionUID = 1L;
    protected ServiceCocina() throws RemoteException {
    }

    @Override
    public PriorityQueue pantallaDePedidos() {
        return null;
    }
}
