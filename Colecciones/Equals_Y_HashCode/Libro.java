package Colecciones.Equals_Y_HashCode;

public class Libro {
    public Libro(String titulo, String autor, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getDatos(){
        return "El titulo es: "+ titulo + ". El autor es: "+ autor + ". Y el ISBN es: ";
    }

    private String titulo;
    private String autor;
    private int ISBN;
}
