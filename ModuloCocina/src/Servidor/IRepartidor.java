package Servidor;

import Estructuras.Colas.ColasArray;
import Estructuras.Colas.ColasList;

import java.rmi.Remote;

public interface IRepartidor extends Remote {

    ColasList imprimirRuta();
    boolean recibirPedido(Factura factura);
    boolean estadoPedido();
    boolean disponibilidadRepartidor();

}
