package ClasePracticaPrimerPrcialLab2.P2_Cine;

public class Empleados extends Personas implements Informaciones {
    private double sueldo;

    public Empleados(String nombre, int dni, double sueldo){
        super.setDni(dni);
        super.setNombre(nombre);
        this.setSueldo(sueldo);

    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;

    }


    public String toString(){

        return "Nombre: " + super.getNombre()+ "\n" + "DNI: " + super.getDni() +
                "\n" + "Tipo: " + this.getName() + "Sueldo: $" + this.sueldo + "\n" +
                "------------------------------";
    }

    public String getName(){
        return "Empleado";
    }
}
