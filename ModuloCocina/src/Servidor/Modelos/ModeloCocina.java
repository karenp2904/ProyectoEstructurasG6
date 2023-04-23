package Servidor.Modelos;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerCocina;

public class ModeloCocina implements IControllerCocina {
    @Override
    public Factura extraerPedido() {
        return null;
    }

    @Override
    public PriorityQueue pantallaDePedidos(Pedido pedido, int prioridad) {
        return null;
    }

    @Override
    public int clasificarPedidoPrioridad(Factura factura) {
        return 0;
    }

    @Override
    public boolean entregarPedido(PriorityQueue queue) {
        return false;
    }
}
