package ClasePracticaPrimerPrcialLab2.P2_Cine;

public class Salas {
    private int capacidad;
    private String peli;
    private String nombre;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre){
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public void setPeli(String peli) {
        this.peli = peli;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        if (espectadores.length > this.capacidad){
            System.out.println("NO QUEDAN LUGARES DISPONIBLES");
        }else {
            this.espectadores = espectadores;
        }
    }

    public String getEspectadores(){
        try{
            String listaEspectadores = "Lista de Espectadores: \n";
            for (Espectadores espectador : this.espectadores){
                listaEspectadores = listaEspectadores + espectador.toString();
            }
            return listaEspectadores;
        }catch (Exception e){
            return "No hay espectadores cargados";
        }
    }

    public String toString(){
        return "Sala: [Capacidad: " + capacidad +
                       " - Pelicula: " + peli +
                       " - Nombre: " + nombre;
    }
}
