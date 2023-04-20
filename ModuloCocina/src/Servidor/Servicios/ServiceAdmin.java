package Servidor.Servicios;

import Servidor.Interfaces.IAdmin;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceAdmin extends UnicastRemoteObject implements IAdmin {

    private static final long serialVersionUID = 1L;
    protected ServiceAdmin() throws RemoteException {
    }

    @Override
    public boolean resgitrarRepartidor(String nombre, String usuario, String contraseña) {
        return false;
    }

    @Override
    public boolean registrarOperador(String nombre, String usuario, String contraseña) {
        return false;
    }

    @Override
    public boolean activarCocina(boolean estado) {
        return false;
    }
}
