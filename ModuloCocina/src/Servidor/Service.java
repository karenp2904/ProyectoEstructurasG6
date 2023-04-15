package Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Service extends UnicastRemoteObject implements IRegistro{
    protected Service() throws RemoteException {
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
