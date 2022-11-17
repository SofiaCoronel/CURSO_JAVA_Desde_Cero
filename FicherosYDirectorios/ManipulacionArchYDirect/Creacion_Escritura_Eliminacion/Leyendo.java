package FicherosYDirectorios.ManipulacionArchYDirect.Creacion_Escritura_Eliminacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Leyendo {
    public static void main(String[] args) {

        String contenido_ficherotxt = "";
        int c;

        try {

            FileReader fr = new FileReader("C:" + File.separator + "Excepciones" + File.separator + "nuevo_directorio" + File.separator + "prueba_texto.txt");

            while ((c = fr.read()) != -1){
                contenido_ficherotxt += (char) c;   // CASTING

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("El contenido del fichero es: " + contenido_ficherotxt);

    }
}
