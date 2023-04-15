package Servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
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

    public boolean deployService() {
        boolean ack = false;
        if (ip == null | port == null | serviceName == null) return ack;
        try {
            System.setProperty( "java.rmi.server.hostname", ip);
            IRegistro service = new Service();
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

}
