package Servidor.Interfaces.IServices;

import java.rmi.Remote;

public interface IRegistro extends Remote {

    boolean validarUsuario(String modulo,String nombre, String contraseña);//para el login del modulo

}
