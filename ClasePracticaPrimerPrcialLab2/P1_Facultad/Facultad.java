package ClasePracticaPrimerPrcialLab2.P1_Facultad;

import java.util.LinkedList;

public class Facultad {
    private String nombre;
    private LinkedList<Carrera> coleccionCarreras;
    private LinkedList<Estudiante> coleccionEstudiantes;


    public Facultad(String nombre){
        this.nombre = nombre;
        this.coleccionCarreras = new LinkedList<Carrera>();
    }
    public void agregarCarrera(Carrera carreraNueva){
        this.coleccionCarreras.add(carreraNueva);
    }
    public boolean eliminarCarrera(String nombreCarrera){
        boolean encontro = false;
        for (Carrera carrera: coleccionCarreras){
            if (carrera.getNombre().equals(nombreCarrera)){
                coleccionCarreras.remove(carrera);
                encontro = true;
                break;
            }
        }
        return encontro;
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

}
