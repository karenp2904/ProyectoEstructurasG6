package Servidor.Controladores;

import Servidor.Interfaces.IController.IControllerRegistro;
import Servidor.Modelos.ModeloRegistro;

import java.io.Serializable;

public class ControllerRegistro implements IControllerRegistro, Serializable {

    private ModeloRegistro modeloRegistro;
    @Override
    public boolean registroUsuario(String nombre, String contraseña) {
        return modeloRegistro.registroUsuario(nombre,contraseña);
    }

    @Override
    public boolean validarUsuario(String modulo, String nombre, String contraseña) {
        return modeloRegistro.validarUsuario(modulo,nombre,contraseña);
    }
}
