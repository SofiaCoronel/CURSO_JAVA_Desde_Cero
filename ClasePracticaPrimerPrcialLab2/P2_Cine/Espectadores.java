package ClasePracticaPrimerPrcialLab2.P2_Cine;

public class Espectadores extends Personas implements Informaciones{
    private String fila;
    private int silla;

    public Espectadores(String nombre, int dni, String fila, int silla){
        super.setNombre(nombre);
        super.setDni(dni);
        this.fila = fila;
        this.silla = silla;
    }

    public String getName(){
        return "Espectador";
    }

    public String getButaca(){
        return this.fila + " - " + this.silla;
    }

    public String toString(){
        return "Nombre: " + super.getNombre() + "\n" + "DNI: " + super.getDni() +
                "\n" + "Tipo: " + this.getName() + "\n" + "Butaca: " + this.getButaca() +
                "\n" + "-----------------------------------";
    }
}
