package Servidor.Interfaces.IServices;

import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IOperador extends Remote {

    boolean registrarCliente(String nombre, String direccion, String telefono,String tipoDeCuenta) throws RemoteException;//registro de clientes
    boolean actualizarCliente(String nombre, String direccion, String telefono,String tipoDeCuenta ) throws RemoteException;//actualizar el cliente
    boolean ingresarPedido(String producto, String codigo, String cantidad) throws RemoteException;//ingresar un pedido
    boolean actualizarPedido(String producto, String codigo, String cantidad) throws RemoteException;//actualizar un pedido
    ColasArray pedidosFrecuentesCliente(String telefono) throws RemoteException;//pedidos mas solicitados por el cliente
    ColasArray busquedaPedido(String pedidoABuscar) throws RemoteException; //busqueda de pedido
    ColasArray busquedaCliente(String clienteTelefonoABuscar) throws RemoteException; //busqueda de cliente










}
