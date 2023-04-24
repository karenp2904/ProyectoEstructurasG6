package ControladorOperador;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import ModeloOperador.ModeloOperador;
import Servidor.Servicios.ServiceOperador;
import VistaOperador.MainOperador;

public class ControladorOperador {
    
    public void guardarDatos() {
        // Obtener los datos del modelo
        ModeloOperador datos = MainOperador.obtenerDatos();
    
        // Escribir los datos en un archivo JSON
        boolean exito = ServiceOperador.writeObject(archivoJSON, datos);
    
        if (!exito) {
            System.err.println("Error al guardar los datos en el archivo JSON.");
        }

    }

}
