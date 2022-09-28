package ClasePracticaPrimerPrcialLab2.P3_Personal;

public class Empleado {

    private String nombre;
    private String apellido;
    private int dni;
    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo){
        this.nombre = nombre;
    }

    public Empleado(String nom) {
        nombre = nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public void subirSueldo(double incremento) {
        double aumento = sueldo * incremento / 100;
        sueldo += aumento;
    }

    public double verSueldo(){
        return sueldo;
    }
}
