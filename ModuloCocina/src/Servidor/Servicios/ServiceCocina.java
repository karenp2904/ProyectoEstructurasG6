package Servidor.Servicios;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Controladores.ControllerCocina;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IServices.ICocina;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceCocina extends UnicastRemoteObject implements ICocina {

    private ControllerCocina controllerCocina; //instancia
    private static final long serialVersionUID = 1L;

    public ServiceCocina(ControllerCocina controllerCocina) throws RemoteException {
        this.controllerCocina=controllerCocina; //controlador
    }


    @Override
    public PriorityQueue pantallaDePedidos() throws RemoteException {
        return controllerCocina.pantallaDePedidos() ;
    }



    @Override
    public int clasificarPedidoPrioridad(Factura factura) throws RemoteException {
        return controllerCocina.clasificarPedidoPrioridad(factura);
    }

    @Override
    public boolean entregarPedido(PriorityQueue queue) throws RemoteException {
        return controllerCocina.entregarPedido(queue);
    }

    @Override
    public int entregarNumeroFogon(Pedido pedido) throws RemoteException {
        return controllerCocina.entregarNumeroFogon(pedido);
    }
}
