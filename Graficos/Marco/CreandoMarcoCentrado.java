package Graficos.Marco;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {
    public static void main(String[] args) {

        MarcoCentrado mi_marco = new MarcoCentrado();

        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mi_marco.setVisible(true);   // hacemos visible el marco
    }
}
class MarcoCentrado extends JFrame{

    public MarcoCentrado(){

        Toolkit mipantalla = Toolkit.getDefaultToolkit();   // almacenamos el sistema nativo de ventanas

        Dimension tamanioPantalla = mipantalla.getScreenSize();   // almacenamos la resolucion de mi pantalla

        int alturaPantalla = tamanioPantalla.height;    // obtenemos el alto de la pantalla
        int anchoPantalla = tamanioPantalla.width;      // obtenemos el ancho de la pantalla

        // establecemos la posicion del marco
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Marco Centrado");    // titulo

        // establecemos un icono
        Image miIcono = mipantalla.getImage("src/Graficos/icono.jpg");
        setIconImage(miIcono);
    }
}
