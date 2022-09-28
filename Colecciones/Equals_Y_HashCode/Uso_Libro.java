package Colecciones.Equals_Y_HashCode;

public class Uso_Libro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Curso Java", "sofia", 25);
        Libro libro2 = new Libro("Curso Java", "sofia", 25);

        if (libro1.equals(libro2)){
            System.out.println("Es el mismo libro");
        }else{
            System.out.println("No es el mismo libro");
        }
    }
}
