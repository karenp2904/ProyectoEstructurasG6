package Servidor.Servicios;

import Servidor.Controladores.*;
import Servidor.Interfaces.IServices.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server implements Runnable {
    public String ip;
    public String port;
    public String serviceName;
    public String url;

    public Server(String ip, String port, String serviceName) {
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "//" + ip + ":" + port + "/" + serviceName;
    }

    public boolean deployServiceRegistro() {
        boolean ack = false;
        if (ip == null | port == null | serviceName == null) return ack;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            IRegistro service = new ServiceRegistro(new ControllerRegistro());
            LocateRegistry.createRegistry(Integer.parseInt(port));
            Naming.rebind(url, service);
            ack = true;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return ack;
        }
    }

    public boolean deployServiceAdmin() {
        boolean ack = false;
        if (ip == null | port == null | serviceName == null) return ack;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            IAdmin service = new ServiceAdmin(new ControllerAdmin());
            LocateRegistry.createRegistry(Integer.parseInt(port));
            Naming.rebind(url, service);
            ack = true;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return ack;
        }
    }

    public boolean deployServiceCocina() {
        boolean ack = false;
        if (ip == null | port == null | serviceName == null) return ack;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            ICocina service = new ServiceCocina(new ControllerCocina());
            LocateRegistry.createRegistry(Integer.parseInt(port));
            Naming.rebind(url, service);
            ack = true;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return ack;
        }
    }

    public boolean deployServiceOperador() {
        boolean ack = false;
        if (ip == null | port == null | serviceName == null) return ack;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            IOperador service = new ServiceOperador(new ControllerOperador());
            LocateRegistry.createRegistry(Integer.parseInt(port));
            Naming.rebind(url, service);
            ack = true;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return ack;
        }
    }

    public boolean deployServiceRepartidor() {
        boolean ack = false;
        if (ip == null | port == null | serviceName == null) return ack;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            IRepartidor service = new ServiceRepartidor(new ControllerRepartidor());
            LocateRegistry.createRegistry(Integer.parseInt(port));
            Naming.rebind(url, service);
            ack = true;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            return ack;
        }
    }

    @Override
    public void run() {
        this.deployServiceAdmin();
    }
}
