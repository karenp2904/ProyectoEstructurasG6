package Servidor.Interfaces;

import Estructuras.APriorityQueue.PriorityQueue;

import java.rmi.Remote;

public interface ICocina extends Remote {

    PriorityQueue pantallaDePedidos();

}
