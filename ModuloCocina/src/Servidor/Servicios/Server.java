package Servidor.Servicios;

import Servidor.Controladores.*;
import Servidor.Interfaces.IServices.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable {
    private String ip;
    private String port;
    private String url;
    private String serviceName;
    private Remote service;

    public Server(String ip, String port, String serviceName, Remote service)  {
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.service = service;
        this.url = "//" + ip + ":" + port + "/" + serviceName;
    }

    @Override
    public void run() {
        this.deployService();
    }

    public boolean deployService() {
        boolean successful = false;
        if (ip == null || port == null || serviceName == null)
            return successful;
        try {
            System.setProperty("java.rmi.server.hostname", ip);
            LocateRegistry.createRegistry(Integer.parseInt(port));
            Naming.rebind(url, service);
            Logger.getLogger(this.getClass().getSimpleName()).log(Level.INFO, "Service is running on {0}", url);
            successful = true;
        } catch (RemoteException | MalformedURLException e) {
            Logger.getLogger(this.getClass().getSimpleName()).log(Level.WARNING, e.getMessage(), e);
        }
        return successful;
    }
/*
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
//
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

 */

}
