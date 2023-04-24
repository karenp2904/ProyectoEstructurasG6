package Servidor.Controladores;

import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerOperador;
import Servidor.Modelos.ModeloOperador;

import java.io.Serializable;

public class ControllerOperador implements IControllerOperador, Serializable {

    private ModeloOperador modeloOperador;

    @Override
    public boolean registrarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) {
        return modeloOperador.registrarCliente(nombre,direccion,telefono,tipoDeCuenta);
    }

    @Override
    public boolean actualizarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) {
        return modeloOperador.actualizarCliente(nombre,direccion,telefono,tipoDeCuenta);
    }

    @Override
    public boolean ingresarPedido(String producto, String codigo, String cantidad) {
        return modeloOperador.ingresarPedido(producto,codigo,cantidad);
    }

    @Override
    public boolean actualizarPedido(String producto, String codigo, String cantidad) {
        return modeloOperador.actualizarPedido(producto,codigo,cantidad);
    }

    @Override
    public ColasArray[] pedidosFrecuentesCliente(String telefono) {
        return modeloOperador.pedidosFrecuentesCliente(telefono);
    }

    @Override
    public String busquedaPedido(String pedidoABuscar) {
        return modeloOperador.busquedaPedido(pedidoABuscar);
    }

    @Override
    public Cliente busquedaCliente(String clienteTelefonoABuscar) {
        return modeloOperador.busquedaCliente(clienteTelefonoABuscar);
    }

    @Override
    public Factura generarFactura(Pedido pedido, Cliente cliente) {
        return modeloOperador.generarFactura(pedido,cliente);
    }

}
