package Excepciones.Try_Catch;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Leer_imagen {
    public static void main(String[] args) {
        MarcoImagen mimarco = new MarcoImagen();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("Marco con Imagen");

        setBounds(750, 300,300, 200);

        LaminaConImagen miLamina = new LaminaConImagen();

        add(miLamina);
    }
}

class LaminaConImagen extends JFrame{
    public LaminaConImagen(){

        // Error Comprobado-
        // TRY CATCH

        try{
            imagen = ImageIO.read(new File("src/Excepciones/bangtan.jpg"));

        }catch (IOException e){
            System.out.println("La imagen no se encuentra.");
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        // Error No Comprobado-

        if (imagen == null) {
            g.drawString("no podemos cargar la imagen", 10, 10);
        } else {

            int anchuraImagen = imagen.getWidth(this);

            int alturaImagen = imagen.getHeight(this);

            g.drawImage(imagen, 0, 0, null);

            for (int i = 0; i < 300; i++) {
                for (int j = 0; j < 200; j++) {

                    if (i + j > 0) {
                        g.copyArea(0, 0, anchuraImagen,
                                alturaImagen, anchuraImagen * i, alturaImagen * j);
                    }
                }
            }
        }
    }
    private Image imagen;
}
