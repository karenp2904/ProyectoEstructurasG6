package Servidor.Servicios;

import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Interfaces.IOperador;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceOperador extends UnicastRemoteObject implements IOperador {

    private static final long serialVersionUID = 1L;
    protected ServiceOperador() throws RemoteException {
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
    public Cliente busquedaCliente(String clienteABuscar) {
        return null;
    }

    @Override
    public Factura generarFactura() {
        return null;
    }
}
