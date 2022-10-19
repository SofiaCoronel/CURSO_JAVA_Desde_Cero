package ClasePracticaPrimerPrcialLab2.P3_Personal;

abstract class Persona {

    private String nombre;
    private String apellido;
    private double sueldo;

    public Persona(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public double getSueldoBasico() {
        return sueldo;
    }

    public void setSueldoBasico(double sueldo) {
        this.sueldo = sueldo;
    }

    abstract void subirSueldo(double incremento);
    abstract double verSueldo();

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nApellido: "+ this.apellido + "\nSueldo Basico: "+ this.sueldo;
    }
}
