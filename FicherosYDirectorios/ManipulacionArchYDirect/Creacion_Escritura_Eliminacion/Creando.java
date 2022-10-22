package FicherosYDirectorios.ManipulacionArchYDirect.Creacion_Escritura_Eliminacion;
import java.io.*;

public class Creando {
    public static void main(String[] args) {

        // creamos una nueva carpeta en el directorio
        File ruta = new File("C:" + File.separator + "Excepciones" + File.separator + "nuevo_directorio");
        ruta.mkdir();

        // creamos un nuevo archivo
        File ruta2 = new File("C:" + File.separator + "Excepciones" + File.separator + "prueba_texto.txt");

        String archivo_destino = ruta2.getAbsolutePath();   // almacenamos la ruta de la carpeta

        try {
            ruta2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // creamos un nuevo archivo y escribimos en su interior
        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir(archivo_destino);    // le indicamos la ruta en donde quiero guardar el nuevo archivo

    }
}

// creamos un nuevo archivo y escribimos en su interior
class Escribiendo{

    public void escribir(String ruta_archivo){
        String frase = "Esto es un ejemplo";    // frase que ira dentro del archivo

        try {

            FileWriter escritura = new FileWriter(ruta_archivo);   // vamos a escrbir en el archivo que le estamos indicando

            for (int i=0; i < frase.length(); i++){

                escritura.write(frase.charAt(i));
            }
            escritura.close();

        }catch (IOException e){

        }

    }
}
