package Servidor.Controladores;

import Servidor.Interfaces.IController.IControllerAdmin;
import Servidor.Modelos.ModeloAdmin;

import java.io.Serializable;

public class ControllerAdmin implements IControllerAdmin, Serializable {

    private ModeloAdmin modeloAdmin;
    @Override
    public boolean resgitrarRepartidor(String nombre, String usuario, String contraseña) {
        return modeloAdmin.registrarOperador(nombre,usuario,contraseña);
    }

    @Override
    public boolean registrarOperador(String nombre, String usuario, String contraseña) {
        return modeloAdmin.resgitrarRepartidor(nombre,usuario,contraseña);
    }

    @Override
    public boolean activarCocina(boolean estado) {
        return modeloAdmin.activarCocina(estado);
    }
}
