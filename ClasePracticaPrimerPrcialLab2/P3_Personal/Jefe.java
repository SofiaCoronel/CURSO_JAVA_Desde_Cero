package ClasePracticaPrimerPrcialLab2.P3_Personal;

public class Jefe extends Persona{

    private double porcentaje;

    public Jefe(String apellido, String nombre, double sueldo, double porcentaje){
        super(nombre, apellido, sueldo);
        this.porcentaje = porcentaje;
    }

    @Override
    public void subirSueldo(double incremento){

        double monto = super.getSueldoBasico() + incremento
                + super.getSueldoBasico() * porcentaje;

        super.setSueldoBasico(monto);
    }

    @Override
    double verSueldo() {
        double monto = super.getSueldoBasico() + super.getSueldoBasico() * porcentaje;
        return monto;
    }

    @Override
    public String toString(){
        return super.toString() + "Porcentaje: " + this.porcentaje;
    }

}
