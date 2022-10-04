package ClasePracticaPrimerPrcialLab2.P3_Personal;

public class Empleado extends Persona{

    private String nombre;
    private String apellido;
    private int dni;
    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo){
        super(nombre, apellido, dni, sueldo);
    }

    public String dameNombre(){
        return nombre;
    }

    public void subirSueldo(double incremento) {
        double aumento = sueldo * incremento / 100;
        sueldo += aumento;
    }

    @Override
    public void verSueldo(double sueldo) {
        System.out.println(sueldo);
    }
}
