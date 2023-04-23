package Servidor.Modelo;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerCocina;

import java.io.Serializable;

public class ControllerCocina implements IControllerCocina, Serializable {


    @Override
    public Factura extraerPedido() {//extraer del archivo el pedido pero manejando el archivo de facturas


        //este objeto es temporal mientras se devuelven los archivos, llenar esos espacios cuando se tenga la info
        Factura fact= new Factura(new Pedido("Papas", "14","56"), new Cliente("berta", "pereza", "73773737", "premium"));
        pantallaDePedidos(fact.getPedido(),clasificarPedidoPrioridad(fact));
        return null;
    }

    @Override
    public PriorityQueue pantallaDePedidos(Pedido pedido,int prioridad) {
        return null;
    }

    @Override
    public int clasificarPedidoPrioridad(Factura factura) {
        int tiempoCoccion=Integer.parseInt(factura.getPedido().getCodigo());// se convierte para comparar
        boolean clientePremium=false;
        if(factura.getCliente().getTipoCuenta().toLowerCase().equals("premium")){ // se evalua el tipo de cliente
            clientePremium=true;
        }
        if(tiempoCoccion<10 && clientePremium==false){ // comida rapida
            //opciones puesto 3 o 4
            //verificar la cantidad de elementos que tiene el puesto 3 y 4 y encolar en el menor
        }else if( tiempoCoccion<10 && clientePremium==true) {
            //opcion 2
        }else if(tiempoCoccion>=10){// coccion lenta
            //opcion 1
            if(clientePremium){
                //encolarlo primero
            }else{
                //se agrega a la cola
            }
        }
        return 0;
    }

    @Override
    public boolean entregarPedido(PriorityQueue queue) {
        return false;
    }
}
