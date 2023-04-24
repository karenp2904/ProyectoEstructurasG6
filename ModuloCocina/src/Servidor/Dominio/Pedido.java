package Servidor.Dominio;

public class Pedido {

    String productoNombre;
    String codigo; //tiempo de ccoion
    String cantidad;

    public Pedido(String productoNombre, String codigo, String cantidad) {
        this.productoNombre = productoNombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
