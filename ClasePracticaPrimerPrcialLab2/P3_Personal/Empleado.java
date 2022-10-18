package ClasePracticaPrimerPrcialLab2.P3_Personal;

public class Empleado extends Persona{

    private String nombre;
    private String apellido;
    private double sueldo;

    public Empleado(String nombre, String apellido, double sueldo){
        super(nombre, apellido, sueldo);
    }

    @Override
    public void subirSueldo(double incremento) {
        double monto = super.getSueldoBasico() + incremento;
        super.setSueldoBasico(monto);
    }

    @Override
    double verSueldo(){
        return super.getSueldoBasico();
    }
}
