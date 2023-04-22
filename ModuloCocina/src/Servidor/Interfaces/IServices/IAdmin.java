package Servidor.Interfaces.IServices;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAdmin extends Remote {
    boolean resgitrarRepartidor(String nombre,String usuario, String contraseña) throws RemoteException;
    boolean registrarOperador(String nombre,String usuario, String contraseña) throws RemoteException;
    boolean activarCocina(boolean estado) throws RemoteException;

}
