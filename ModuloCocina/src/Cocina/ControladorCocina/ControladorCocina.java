package Cocina.ControladorCocina;

import Cocina.VistaCocina.VistaCocina;
import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Controladores.ControllerCocina;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IServices.ICocina;
import Servidor.Servicios.ServiceCocina;


import java.rmi.RemoteException;

public class ControladorCocina {
    VistaCocina vistaCocina=new VistaCocina();
    ServiceCocina serviceCocina=new ServiceCocina(new ControllerCocina());

    public ControladorCocina() throws RemoteException {
        metodos();
    }
//metodo para la conexion
    public void metodos() throws RemoteException {
        while (!serviceCocina.pantallaDePedidos().isEmpty()){
            Pedido pedido= (Pedido) serviceCocina.pantallaDePedidos().extract();
            vistaCocina.editarColaDeDespacho(pedido, serviceCocina.entregarNumeroFogon(pedido));;
        }
    }


}
