package Graficos.Ejemplos.CarritoCompras.modelo;

public class Venta {
    private int codigoVenta;
    private int codigoCliente;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(int codigoVenta, int codigoCliente) {
        this.codigoVenta = codigoVenta;
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
