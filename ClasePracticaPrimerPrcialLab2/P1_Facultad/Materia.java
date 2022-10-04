package ClasePracticaPrimerPrcialLab2.P1_Facultad;

import java.util.LinkedList;

public class Materia {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }
    public void agregarEstudiante(Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }
    public void eliminarEstudiante(int legajo){
        boolean encontro = false;
        for (Estudiante estudiante: coleccionEstudiantes){
            if (estudiante.getLegajo() == legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
                break;
            }if (encontro){
                System.out.println("El estudiante ha sido eliminado.");
            } else {
                System.out.println("Estudiante no encontrado.");
            }
        }
    }


    @Override
    public String toString(){
        return "INFORMACION DE LA MATERIA" + "\nMateria: "+ nombre +
                "\nTitular: " + titular + "\n";
    }
    public void listarEstudiantes(){
        System.out.println("Lista de Estudiantes");
        for (Estudiante estudiante: coleccionEstudiantes){
            System.out.println(estudiante.toString());
        }
    }

}
