package Servidor.Interfaces.IServices;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Pedido;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICocina extends Remote {

    PriorityQueue pantallaDePedidos(Pedido pedido,int prioridad) throws RemoteException;
    int clasificarPedidoPrioridad(Pedido pedido) throws RemoteException;
    Pedido entregarPedido(PriorityQueue queue) throws RemoteException;

}
