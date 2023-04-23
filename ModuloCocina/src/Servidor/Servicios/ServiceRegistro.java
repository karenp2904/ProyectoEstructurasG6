package Servidor.Servicios;

import Servidor.Modelo.ControllerRegistro;
import Servidor.Interfaces.IServices.IRegistro;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceRegistro extends UnicastRemoteObject implements IRegistro {
    private static final long serialVersionUID = 1L;

    private ControllerRegistro controllerRegistro;

    public ServiceRegistro(ControllerRegistro controllerRegistro) throws RemoteException {
        this.controllerRegistro=controllerRegistro;
    }

    @Override
    public boolean registroUsuario(String nombre, String contraseña) {
        return controllerRegistro.registroUsuario(nombre,contraseña);
    }

    @Override
    public boolean validarUsuario(String modulo, String nombre, String contraseña) {
        return controllerRegistro.validarUsuario(modulo,nombre,contraseña);
    }
}
