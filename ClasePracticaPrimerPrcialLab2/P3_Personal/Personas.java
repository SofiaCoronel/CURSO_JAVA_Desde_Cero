package ClasePracticaPrimerPrcialLab2.P3_Personal;

import java.util.LinkedList;

public class Personas {
    private LinkedList<Persona> personas;

    public Personas() {
        this.personas = new LinkedList<>();
    }

    public void listarPersonas(){
        String listado = "\nLista de personas:\n";
        this.personas.forEach(persona -> System.out.println(persona.toString()));
    }

    public void addPersonas(Persona persona){
        this.personas.add(persona);
    }

    public void buscarPersona(String nombreBuscar){
        for (Persona persona : this.personas){
            if (persona.getNombre() == nombreBuscar){
                System.out.println("Persona encontrada: " + persona.toString());
                break;
            }
        }
    }

    public void verSueldo(String verSueldo){
        for (Persona persona : this.personas){
            System.out.println("Sueldo = " + persona.verSueldo());
        }
    }

    public void aumentarSalario(String nombreAumentar, double incremento){
        for (Persona persona : this.personas){
            if (persona.getNombre() == nombreAumentar){
                persona.subirSueldo(incremento);
                break;
            }
        }
    }
}

