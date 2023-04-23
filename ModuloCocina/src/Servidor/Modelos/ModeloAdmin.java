package Servidor.Modelos;

import Servidor.Interfaces.IController.IControllerAdmin;

public class ModeloAdmin implements IControllerAdmin {
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
