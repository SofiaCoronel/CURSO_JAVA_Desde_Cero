package ClasePracticaPrimerPrcialLab2.P1_Facultad;

public class Estudiante extends Persona{
    public Estudiante(String nombre, String apellido, int legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }

    @Override
    public String toString(){
        return "Estudiante: "+super.toString();
    }

    public void modificarDatos(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(legajo));
    }
}
