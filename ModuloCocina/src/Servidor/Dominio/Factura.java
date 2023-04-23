package Servidor.Dominio;

public class Factura {
    Pedido pedido;
    Cliente cliente;

    public Factura(Pedido pedido, Cliente cliente) {
        this.pedido = pedido;
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura {" +
                "pedido=" + pedido.getProductoNombre() +" - "+ pedido.getCantidad() +
                ", cliente=" + cliente.getNombreCliente() +" - "+ cliente.getTelefono()+" - "+cliente.getDireccionCliente() +" - "+ cliente.getTipoCuenta() +
                '}';
    }
}
