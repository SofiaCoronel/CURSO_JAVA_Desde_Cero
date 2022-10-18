package StreamsDeDatos.AccesoFicheros.Lectura;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Acceso_Fichero {
    public static void main(String[] args) {

        Leer_Fichero accediendo = new Leer_Fichero();
        accediendo.lee();
    }
}

class Leer_Fichero {
    public void lee(){
        try {
            FileReader entrada = new FileReader("C:/Users/Usuario/IdeaProjects/CURSO JAVA Desde Cero/src/StreamsDeDatos/prueba_ficheros.txt");

            int c = entrada.read();  // almacenamos en la variable c el primer caracter

            while (c != -1){    // mientras no haya llegado al final del fichero

                c = entrada.read();

                char letra = (char) c;   // casting

                System.out.print(letra);

            }

        } catch (Exception e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
