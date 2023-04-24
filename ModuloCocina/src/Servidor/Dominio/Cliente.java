package Servidor.Dominio;

public class Cliente {
    private String nombreCliente = "";
    private String direccionCliente = "";
    private String telefono;
    public String tipoCuenta;

/*
    //Atributo especial
      public enum tiposDeCuenta{
        PREMIUM, NORMAL
    }
 */

    //Constructor
    public Cliente(String nombreCliente, String direccionCliente, String telefono, String tipoCuenta) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefono = telefono;
        this.tipoCuenta = tipoCuenta;
    }

    //Getters and setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public boolean toJSON() {
        return false;
    }
}
