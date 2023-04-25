package ControladorOperador;

import Estructuras.Colas.ColasArray;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClienteOperador  implements Serializable {
    private IOperador service;
    private IRegistro serviceUsuario;
    private String ip;
    private String port;
    private String serviceName;
    private String url;

    public ClienteOperador(String ip, String port, String serviceName) {
        this.service = null;
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }

    
    public boolean registrarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.registrarCliente(nombre,direccion,telefono,tipoDeCuenta);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean actualizarCliente(String nombre, String direccion, String telefono, String tipoDeCuenta) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.actualizarCliente(nombre,direccion,telefono,tipoDeCuenta);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean ingresarPedido(String producto, String codigo, String cantidad) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.ingresarPedido(producto,codigo,cantidad);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean actualizarPedido(String producto, String codigo, String cantidad) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.actualizarPedido(producto,codigo,cantidad);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }
    }



    public ColasArray pedidosFrecuentesCliente(String telefono) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.pedidosFrecuentesCliente(telefono);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ColasArray busquedaPedido(String pedidoABuscar) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.busquedaPedido(pedidoABuscar);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return null;
        }
    }


    public ColasArray busquedaCliente(String clienteTelefonoABuscar) throws RemoteException {
        try{
            service = (IOperador) Naming.lookup(url);
            return service.busquedaPedido(clienteTelefonoABuscar);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return null;
        }
    }


    public boolean validarUsuario(String modulo, String nombre, String contraseña) throws RemoteException {
        try{
            serviceUsuario = (IRegistro) Naming.lookup(url);
            return serviceUsuario.validarUsuario(modulo,nombre,contraseña);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
