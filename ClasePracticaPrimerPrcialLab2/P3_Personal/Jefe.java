package ClasePracticaPrimerPrcialLab2.P3_Personal;

public class Jefe extends Empleado{

    private double porcentaje;

    public Jefe(String apellido, String nombre , int dni, double sueldo){
        super(nombre, apellido, dni, sueldo);
    }

    public void subirSueldo(double incremento){
        porcentaje = incremento;
    }
    public double verSueldo(){
        double sueldo_jefe = super.verSueldo();
        return sueldo_jefe + porcentaje;
    }

    public String toString(){
        return "Nombre: " + dameNombre() + "\nSueldo: " + verSueldo();
    }
}
