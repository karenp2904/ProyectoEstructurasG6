package Servidor.Interfaces.IController;

import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;

public interface IControllerOperador {
    boolean registrarCliente(String nombre, String direccion, String telefono,String tipoDeCuenta);//registro de clientes
    boolean actualizarCliente(String nombre, String direccion, String telefono,String tipoDeCuenta );//actualizar el cliente
    boolean ingresarPedido(String producto, String codigo, String cantidad);//ingresar un pedido
    boolean actualizarPedido(String producto, String codigo, String cantidad);//actualizar un pedido
    ColasArray[] pedidosFrecuentesCliente(String telefono);//pedidos mas solicitados por el cliente
    String busquedaPedido(String pedidoABuscar); //busqueda de pedido
    Cliente busquedaCliente(String clienteTelefonoABuscar); //busqueda de cliente
    Factura generarFactura(Pedido pedido, Cliente cliente);
}
