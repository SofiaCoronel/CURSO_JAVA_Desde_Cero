package ClasePracticaPrimerPrcialLab2.P3_Personal;

abstract class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private double sueldo;

    public Persona(String nombre, String apellido, int dni, double sueldo){

    }

    public double getSueldoBasico() {
        return sueldo;
    }

    public void setSueldoBasico(double sueldo) {
        this.sueldo = sueldo;
    }

    public abstract void subirSueldo(double incremento);

    public abstract void verSueldo(double sueldo);

    public String getNombre(){
        return nombre;
    }

    public int getDni(){
        return dni;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "\nDni: " + getDni() + "\nSueldo Basico: "+ getSueldoBasico();
    }
}
