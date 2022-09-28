package Colecciones.Iteradores;

public class Cliente {

    public Cliente(String nombre, String num_cuenta, double saldo){
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private String num_cuenta;
    private double saldo;
}
