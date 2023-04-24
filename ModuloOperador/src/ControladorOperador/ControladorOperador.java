package ControladorOperador;

import VistaOperador.VistaOperador;
import VistaOperador.VistaOperadorDatos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.Scanner;

public class ControladorOperador {
    public static void main(String[] args) throws RemoteException {
        Properties properties= new Properties();
        try {
            properties.load(new FileInputStream(new File("client.properties")));
            ClienteOperador client = new ClienteOperador(
                    (String) properties.get("IP"),
                    (String) properties.get("PORT"),
                    (String) properties.get("SERVICENAME"));
            Scanner sc= new Scanner(System.in);
            System.out.println("BIENVENIDO AL CAJERO By Karen");
            VistaOperador vistaOperador= new VistaOperador();
            VistaOperadorDatos vistaOperadorDatos=new VistaOperadorDatos();

            client.registrarCliente(vistaOperadorDatos.ingresarNombre(), vistaOperadorDatos.ingresarDireccion(), vistaOperadorDatos.ingresarTelefono(), vistaOperadorDatos.ingresarTipoCliente());





        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("RMI Client");
    }


}
