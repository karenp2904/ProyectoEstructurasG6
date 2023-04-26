package Servidor.Controladores;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerCocina;
import Servidor.Modelos.ModeloCocina;

import java.io.Serializable;

public class ControllerCocina implements IControllerCocina, Serializable {

    private ModeloCocina modeloCocina;

    @Override
    public Factura extraerPedido() {//extraer del archivo el pedido pero manejando el archivo de facturas
        return modeloCocina.extraerPedido();
    }

    @Override
    public PriorityQueue pantallaDePedidos() {
        return modeloCocina.pantallaDePedidos();
    }

    @Override
    public int clasificarPedidoPrioridad(Factura factura) {
        return modeloCocina.clasificarPedidoPrioridad(factura) ;
    }

    @Override
    public boolean entregarPedido(PriorityQueue queue) {
        return modeloCocina.entregarPedido(queue);
    }

    @Override
    public int entregarNumeroFogon(Pedido pedido) {
        return modeloCocina.entregarNumeroFogon(pedido);
    }
}
