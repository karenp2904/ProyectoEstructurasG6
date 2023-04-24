package Servidor.Modelos;

import Servidor.Interfaces.IController.IControllerRegistro;

public class ModeloRegistro implements IControllerRegistro {
    @Override
    public boolean registroUsuario(String nombre, String contraseña) {
        return false;
    }

    @Override
    public boolean validarUsuario(String modulo, String nombre, String contraseña) {
        return false;
    }
}
