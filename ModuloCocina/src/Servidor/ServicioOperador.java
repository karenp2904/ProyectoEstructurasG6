package Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicioOperador extends UnicastRemoteObject implements IOperador{

    private static final long serialVersionUID = 1L;
    protected ServicioOperador() throws RemoteException {
    }


}
