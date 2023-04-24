package Servidor.Interfaces.IController;

import Estructuras.Colas.ColasList;
import Servidor.Dominio.Factura;

public interface IControllerRepartidor {

    ColasList imprimirRuta();
    boolean recibirPedido(Factura factura);
    boolean estadoPedido(Boolean estado);
    boolean disponibilidadRepartidor();
}
