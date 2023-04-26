package Servidor.Modelos;

import Estructuras.APriorityQueue.PriorityQueue;
import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerCocina;

public class ModeloCocina implements IControllerCocina {

    PriorityQueue colaDespacho=new PriorityQueue(5);
    ColasArray numFogon=new ColasArray();
    @Override
    public Factura extraerPedido() {
        //este objeto es temporal mientras se devuelven los archivos, llenar esos espacios cuando se tenga la info
        Factura fact= new Factura(new Pedido("Papas", "14","56"), new Cliente("berta", "pereza", "73773737", "premium"));
        guardarPedidos(fact.getPedido(),clasificarPedidoPrioridad(fact));
        return null;
    }

    @Override
    public PriorityQueue pantallaDePedidos() {
        return colaDespacho; // aqui se muestra la pantalla en la vista y se extrae
    }

    private PriorityQueue guardarPedidos(Pedido pedido, int prioridad) {
        colaDespacho.insert(pedido,prioridad);
        return colaDespacho;//aqui se guarda en el archivo
    }


    public int entregarNumeroFogon(Pedido pedido) {
        return colaDespacho.searchPriority(pedido);
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
