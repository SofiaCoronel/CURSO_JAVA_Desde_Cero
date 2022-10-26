package Graficos.Frame.DibujandoEnFrame;

import javax.swing.*;
import java.awt.*;

public class PruebaDibujo {
    public static void main(String[] args) {

        MarcoConDibujos mi_marco = new MarcoConDibujos();
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {
        setTitle("prueba de dibujo");
        setSize(400,400);

        LaminaConFiguras mi_lamina = new LaminaConFiguras();
        add(mi_lamina);
    }

}

class LaminaConFiguras extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(80,80,200,200);  // dibujamos un cuadrado

        g.drawLine(100,100,300,200);    // dibujamos una linea
    }
}