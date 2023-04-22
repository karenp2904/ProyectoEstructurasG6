package Servidor.Servicios;

import Estructuras.Colas.ColasArray;
import Servidor.Controladores.ControllerOperador;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IServices.IOperador;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceOperador extends UnicastRemoteObject implements IOperador {

    private static final long serialVersionUID = 1L;

    private ControllerOperador controllerOperador;

    protected ServiceOperador(ControllerOperador controllerOperador) throws RemoteException {
        this.controllerOperador=controllerOperador;
    }


    @Override
    public boolean registrarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) {
        return controllerOperador.registrarCliente(nombre,direccion,telefono,tipoDeCuenta);
    }

    @Override
    public boolean actualizarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) {
        return controllerOperador.actualizarCliente(nombre,direccion,telefono,tipoDeCuenta);
    }

    @Override
    public boolean ingresarPedido(String producto, String codigo, String cantidad) {
        return controllerOperador.ingresarPedido(producto,codigo,cantidad);
    }

    @Override
    public boolean actualizarPedido(String producto, String codigo, String cantidad) {
        return controllerOperador.actualizarPedido(producto,codigo,cantidad);
    }

    @Override
    public ColasArray[] pedidosFrecuentesCliente(String telefono) {
        return controllerOperador.pedidosFrecuentesCliente(telefono);
    }

    @Override
    public String busquedaPedido(String pedidoABuscar) {
        return controllerOperador.busquedaPedido(pedidoABuscar);
    }

    @Override
    public Cliente busquedaCliente(String clienteABuscar) {
        return controllerOperador.busquedaCliente(clienteABuscar);
    }

}
