package Servidor.Controladores;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerCocina;

import java.io.Serializable;

public class ControllerCocina implements IControllerCocina, Serializable {
    @Override
    public PriorityQueue pantallaDePedidos(Pedido pedido,int prioridad) {
        return null;
    }

    @Override
    public int clasificarPedidoPrioridad(Pedido pedido) {
        return 0;
    }

    @Override
    public Pedido entregarPedido(PriorityQueue queue) {
        return null;
    }
}
