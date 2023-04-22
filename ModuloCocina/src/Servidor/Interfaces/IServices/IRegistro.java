package Servidor.Interfaces.IServices;

import java.rmi.Remote;

public interface IRegistro extends Remote {
    boolean registroUsuario(String nombre, String contraseña); //para añadir un nuevo usuario
    boolean validarUsuario(String modulo,String nombre, String contraseña);//para el login del modulo

}
