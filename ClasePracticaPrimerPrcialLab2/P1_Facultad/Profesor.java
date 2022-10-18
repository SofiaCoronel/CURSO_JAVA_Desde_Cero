package ClasePracticaPrimerPrcialLab2.P1_Facultad;

public class Profesor extends Persona{
    public Profesor(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(legajo));
    }

    @Override
    public String toString(){
        return "Profesor: "+super.toString();
    }

    public void modificarDatos(String nombre, String apellido, String legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);

        try {
            super.setLegajo(Integer.parseInt(legajo));
        }catch (Exception e){
            System.out.println("Ha ocurrido un error! Los datos ingresados son invalidos");
        }
    }

}
