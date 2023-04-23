package Servidor.Modelo;

import Servidor.Interfaces.IController.IControllerRegistro;

import java.io.Serializable;

public class ControllerRegistro implements IControllerRegistro, Serializable {
    @Override
    public boolean registroUsuario(String nombre, String contraseña) {
        return false;
    }

    @Override
    public boolean validarUsuario(String modulo, String nombre, String contraseña) {
        return false;
    }
}
