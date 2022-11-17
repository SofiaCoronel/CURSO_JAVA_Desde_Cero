package FicherosYDirectorios.ManipulacionArchYDirect;
import java.io.*;

public class Separadores {
    public static void main(String[] args) {

        File ruta = new File("C:" + File.separator + "Excepciones");    // el sistema coloca el separador compatible
        System.out.println(ruta.getAbsolutePath());

        // almacenamos dentro de un ARRAY lo que hay dentro de la ruta especificada
        String[] nombres_archivo = ruta.list();

        // recorremos el array
        for (int i=0; i < nombres_archivo.length; i++){
            System.out.println(nombres_archivo[i]);     // listamos los archivos que tiene la carpeta

            File f = new File(ruta.getAbsolutePath(), nombres_archivo[i]);

            if (f.isDirectory()){
                String[] archivos_subcarpeta = f.list();

                for (int j=0; j < archivos_subcarpeta.length; j++){
                    System.out.println(archivos_subcarpeta[j]);     // imprime lo que hay dentro de las subcarpetas
                }
            }
        }
    }

}
