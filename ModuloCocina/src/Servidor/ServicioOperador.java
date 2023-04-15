package Servidor;

import Estructuras.Colas.ColasArray;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicioOperador extends UnicastRemoteObject implements IOperador{

    private static final long serialVersionUID = 1L;
    protected ServicioOperador() throws RemoteException {
    }


    @Override
    public boolean registrarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) {
        return false;
    }

    @Override
    public boolean actualizarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) {
        return false;
    }

    @Override
    public boolean ingresarPedido(String producto, String codigo, String cantidad) {
        return false;
    }

    @Override
    public boolean actualizarPedido(String producto, String codigo, String cantidad) {
        return false;
    }

    @Override
    public ColasArray[] pedidosFrecuentesRestaurante() {
        return new ColasArray[0];
    }

    @Override
    public ColasArray[] pedidosFrecuentesCliente(String telefono) {
        return new ColasArray[0];
    }

    @Override
    public String busquedaPedido(String pedidoABuscar) {
        return null;
    }

    @Override
    public String busquedaCliente(String clienteABuscar) {
        return null;
    }

    @Override
    public String generarFactura() {
        return null;
    }
}
