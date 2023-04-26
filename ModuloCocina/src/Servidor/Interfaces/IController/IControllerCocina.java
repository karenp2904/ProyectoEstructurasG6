package Servidor.Interfaces.IController;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;

public interface IControllerCocina {

    Factura extraerPedido(); //devuelve la informacion del pedido
    PriorityQueue pantallaDePedidos();
    int clasificarPedidoPrioridad(Factura factura);
    boolean entregarPedido(PriorityQueue queue);
    int entregarNumeroFogon(Pedido pedido);
}
