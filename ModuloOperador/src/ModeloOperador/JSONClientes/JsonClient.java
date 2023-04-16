package ModeloOperador.JSONClientes;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Servidor.Cliente;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonClient {
    public class Restaurante {
        private List<Cliente> clientes;
        private String archivoJSON;

        public Restaurante(String archivoJSON) {
            this.archivoJSON = archivoJSON;
            clientes = new ArrayList<>();
            cargarClientes();
        }

        private void cargarClientes() {
            try {
                String contenido = Files.readString(Paths.get(archivoJSON));
                JSONObject restauranteJSON = new JSONObject(contenido);
                JSONArray clientesJSON = restauranteJSON.getJSONArray("clientes");
                for (int i = 0; i < clientesJSON.length(); i++) {
                    JSONObject clienteJSON = clientesJSON.getJSONObject(i);

                    String nombre = clienteJSON.getString("nombre");
                    String Direccion = clienteJSON.getString("Direccion");
                    String Telefono = clienteJSON.getString("Telefono");

                    JSONArray pedidosJSON = clienteJSON.getJSONArray("Pedidos");

                    List<String> pedidos = new ArrayList<>();
                    for (int j = 0; j < pedidosJSON.length(); j++) {
                        pedidos.add(pedidosJSON.getString(j));
                    }
                    int total = clienteJSON.getInt("total");
                    Cliente cliente = new Cliente(nombre, Direccion, Telefono, pedidos.toString());
                    clientes.add(cliente);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void guardarClientes() {
            JSONArray clientesJSON = new JSONArray();
            for (Cliente cliente : clientes) {
                clientesJSON.put(cliente.toJSON());
            }
            JSONObject restauranteJSON = new JSONObject();
            restauranteJSON.put("clientes", clientesJSON);
            try (FileWriter file = new FileWriter(archivoJSON)) {
                file.write(restauranteJSON.toString());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void agregarCliente(String nombre, List<String> platos, int total) {
            Cliente cliente = new Cliente(nombre, platos, total);
            clientes.add(cliente);
            guardarClientes();
        }

        public List<Cliente> getClientes() {
            return clientes;
        }
    }



}
