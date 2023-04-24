package ModeloCocina;

public class JSON { import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.net.HttpURLConnection;
    import java.net.URL;
    
    public class JSONReader {
    
        public static void main(String[] args) {
    
            try {
                URL url = new URL("ruta/al/archivo.json");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
    
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
    
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                con.disconnect();
    
                String json = content.toString();
                System.out.println(json);
                
                // Aquí puedes hacer lo que quieras con los datos del archivo JSON
    
            } catch (Exception e) {
                System.out.println("Error al leer el archivo JSON: " + e.getMessage());
            }
        }
    }
    }