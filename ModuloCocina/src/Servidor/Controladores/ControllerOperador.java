package Servidor.Controladores;

import Estructuras.Colas.ColasArray;
import Servidor.Dominio.Cliente;
import Servidor.Dominio.Factura;
import Servidor.Dominio.Pedido;
import Servidor.Interfaces.IController.IControllerOperador;
import Servidor.Modelos.ModeloOperador;
import Servidor.Servicios.ServiceOperador;


import java.io.Serializable;

public class ControllerOperador implements IControllerOperador, Serializable {

    private String archivoJSON = "datos.json";
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
    public ColasArray pedidosFrecuentesCliente(String telefono) {
        return modeloOperador.pedidosFrecuentesCliente(telefono);
    }

    @Override
    public ColasArray busquedaPedido(String pedidoABuscar) {
        return modeloOperador.busquedaPedido(pedidoABuscar);
    }

    @Override
    public ColasArray busquedaCliente(String clienteTelefonoABuscar) {
        return modeloOperador.busquedaCliente(clienteTelefonoABuscar);
    }

    @Override
    public Factura generarFactura(Pedido pedido, Cliente cliente) {
        return modeloOperador.generarFactura(pedido,cliente);
    }

    //Json part

    public void guardarDatos() {
        // Obtener los datos del modelo
        ModeloOperador datos = modeloOperador.obtenerDatos();
    
        // Escribir los datos en un archivo JSON
        boolean exito = ServiceOperador.writeObject(archivoJSON, datos);
    
        if (!exito) {
            System.err.println("Error al guardar los datos en el archivo JSON.");
        }

    }
    
}
