package ControladorOperador;

import com.sun.jdi.request.ExceptionRequest;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRegistro extends Remote {

    boolean validarUsuario(String modulo,String nombre, String contraseña) throws RemoteException;//para el login del modulo

}
