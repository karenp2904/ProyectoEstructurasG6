package Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceRegistro extends UnicastRemoteObject implements IRegistro{
    private static final long serialVersionUID = 1L;

    protected ServiceRegistro() throws RemoteException {
    }

    @Override
    public boolean registroUsuario(String nombre, String contraseña) {
        return false;
    }

    @Override
    public boolean validarUsuario(String modulo, String nombre, String contraseña) {
        return false;
    }
}
