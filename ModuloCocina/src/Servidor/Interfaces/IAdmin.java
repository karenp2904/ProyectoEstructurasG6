package Servidor.Interfaces;

import java.rmi.Remote;

public interface IAdmin extends Remote {
    boolean resgitrarRepartidor(String nombre,String usuario, String contraseña);
    boolean registrarOperador(String nombre,String usuario, String contraseña);
    boolean activarCocina(boolean estado);

}
