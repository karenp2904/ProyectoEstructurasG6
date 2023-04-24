package Servidor.Dominio;

public class Usuario {
    private String nombre;
    private String password;

    //Constructores
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.password = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String contrasena) {
        this.password = contrasena;
    }
/*
    //Metodo para validar los datos ingresados
    //Devolverá true si es el usuario, de lo contrario devolverá false
    public boolean validarUsuario(String nombre, String contrasena){
        return this.nombre.equals(nombre) && this.password.equals(contrasena);
    }

 */

}
