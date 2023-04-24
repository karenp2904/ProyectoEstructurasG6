package Servidor.Interfaces.IController;

public interface IControllerRegistro {
    boolean registroUsuario(String nombre, String contraseña); //para añadir un nuevo usuario
    boolean validarUsuario(String modulo,String nombre, String contraseña);//para el login del modulo
}
