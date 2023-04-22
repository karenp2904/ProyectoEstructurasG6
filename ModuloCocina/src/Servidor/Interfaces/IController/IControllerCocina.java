package Servidor.Interfaces.IController;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;

public interface IControllerCocina {
    PriorityQueue pantallaDePedidos(Pedido pedido,int prioridad);
    int clasificarPedidoPrioridad(Pedido pedido);
    Pedido entregarPedido(PriorityQueue queue);
}
