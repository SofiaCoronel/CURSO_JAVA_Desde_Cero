package ClasePracticaPrimerPrcialLab2.P1_Facultad;

import java.util.LinkedList;

public class Carrera {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<Materia>();
    }

    public void agregarMaterias(Materia materia){
        coleccionMaterias.add(materia);
    }

    /*
    public boolean eliminarMateria(Materia materia){
        boolean encontro = false;
        for (Materia materias: coleccionMaterias){
            if (materias.){
                coleccionCarreras.remove(carrera);
                encontro = true;
                break;
            }
        }
        return encontro;
    }
    */

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
