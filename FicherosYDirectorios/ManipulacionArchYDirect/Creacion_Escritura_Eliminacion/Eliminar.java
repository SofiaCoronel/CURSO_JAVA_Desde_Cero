package FicherosYDirectorios.ManipulacionArchYDirect.Creacion_Escritura_Eliminacion;

import java.io.File;

public class Eliminar {
    public static void main(String[] args) {
        File ruta2 = new File("C:" + File.separator + "Excepciones" + File.separator + "prueba_texto.txt");

        ruta2.delete();
    }
}
