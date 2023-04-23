package Servidor.Servicios;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Modelo.ControllerCocina;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IServices.ICocina;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceCocina extends UnicastRemoteObject implements ICocina {

    private ControllerCocina controllerCocina;
    private static final long serialVersionUID = 1L;

    protected ServiceCocina(ControllerCocina controllerCocina) throws RemoteException {
        this.controllerCocina=controllerCocina;
    }

    @Override
    public PriorityQueue pantallaDePedidos(Pedido pedido, int prioridad) throws RemoteException {
        return controllerCocina.pantallaDePedidos(pedido,prioridad);
    }

    @Override
    public int clasificarPedidoPrioridad(Factura factura) throws RemoteException {
        return controllerCocina.clasificarPedidoPrioridad(factura);
    }

    @Override
    public boolean entregarPedido(PriorityQueue queue) throws RemoteException {
        return controllerCocina.entregarPedido(queue);
    }
}
