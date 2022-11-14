package Graficos.Ejemplos.CarritoCompras.modelo;

public class Cliente {
    private int codigoCliente;
    private String nombre;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String nombre) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
