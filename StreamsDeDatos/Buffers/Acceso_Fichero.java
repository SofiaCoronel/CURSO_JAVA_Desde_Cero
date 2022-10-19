package StreamsDeDatos.Buffers;

import java.io.BufferedReader;
import java.io.FileReader;

public class Acceso_Fichero {
    public static void main(String[] args) {

        Leer_Fichero accediendo = new Leer_Fichero();
        accediendo.leer();
    }
}

class Leer_Fichero{
    public void leer(){
        try {
            FileReader entrada = new FileReader("C://prueba_fichero.txt");

            BufferedReader miBuffer = new BufferedReader(entrada);  // almacenamos el fichero en el buffer

            String linea = "";

            while (linea != null){

                linea = miBuffer.readLine();    // almacena la primera linea que encuentre en el buffer

                System.out.print(linea);
            }
            entrada.close();    // cerramos el flujo de datos

        } catch (Exception e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}