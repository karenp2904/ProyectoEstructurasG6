package Servidor.Controladores;

import Servidor.Interfaces.IController.IControllerAdmin;

import java.io.Serializable;

public class ControllerAdmin implements IControllerAdmin, Serializable {

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
