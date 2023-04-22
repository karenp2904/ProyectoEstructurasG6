package Servidor.Controladores;

import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerOperador;

import java.io.Serializable;

public class ControllerOperador implements IControllerOperador, Serializable {

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
    public ColasArray[] pedidosFrecuentesCliente(String telefono) {
        return new ColasArray[0];
    }

    @Override
    public String busquedaPedido(String pedidoABuscar) {
        return null;
    }

    @Override
    public Cliente busquedaCliente(String clienteTelefonoABuscar) {
        return null;
    }

    @Override
    public Factura generarFactura(Pedido pedido, Cliente cliente) {
        return null;
    }

}
