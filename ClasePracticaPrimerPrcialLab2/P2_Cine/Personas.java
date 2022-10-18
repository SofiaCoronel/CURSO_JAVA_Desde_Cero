package ClasePracticaPrimerPrcialLab2.P2_Cine;

public abstract class Personas implements Informaciones{
    private String nombre;
    private int dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


}
