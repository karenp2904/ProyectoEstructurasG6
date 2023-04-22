package Servidor.Interfaces.IServices;

import Estructuras.Colas.ColasList;
import Servidor.Dominio.Factura;

import java.rmi.Remote;

public interface IRepartidor extends Remote {

    ColasList imprimirRuta();
    boolean recibirPedido(Factura factura);
    boolean estadoPedido(Boolean estado);
    boolean disponibilidadRepartidor();

}
