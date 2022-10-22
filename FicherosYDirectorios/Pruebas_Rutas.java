package FicherosYDirectorios;
import java.io.*;

public class Pruebas_Rutas {
    public static void main(String[] args) {

        File archivo = new File("ejemplo_archivo");   // toma como ruta por defecto, la carpeta del proyecto
        System.out.println(archivo.getAbsolutePath());  // imprime la ruta del archivo
        System.out.println(archivo.exists());   // ver si el archivo existe (BOOLEAN)


        File acrhivo2 = new File("src");    // colocamos una carpeta que si existe
        System.out.println(acrhivo2.getAbsolutePath());
        System.out.println(acrhivo2.exists());


    }
}
