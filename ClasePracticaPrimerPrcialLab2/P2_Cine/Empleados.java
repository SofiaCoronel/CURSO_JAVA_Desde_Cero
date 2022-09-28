package ClasePracticaPrimerPrcialLab2.P2_Cine;

public class Empleados extends Personas {
    private double sueldo;

    public Empleados(String nombre, int dni){
        super.setDni(dni);
        super.setNombre(nombre);
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;

    }
    public String toString(){

        return "Nombre: " + super.getNombre()+ "\n" + "DNI: " + super.getDni() +
                "\n" + "Tipo: " + this.getTipo() + "Sueldo: $" + this.sueldo + "\n" +
                "------------------------------";
    }

    public String getTipo(){
        return "Empleado";
    }
}
