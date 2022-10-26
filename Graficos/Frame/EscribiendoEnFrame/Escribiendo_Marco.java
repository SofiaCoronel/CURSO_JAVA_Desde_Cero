package Graficos.Frame.EscribiendoEnFrame;

import javax.swing.*;
import java.awt.*;

public class Escribiendo_Marco {
    public static void main(String[] args) {

        MarcoConTexto mi_marco = new MarcoConTexto();

        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){

        setVisible(true);   // hacemos visible el marco

        setSize(600,450);
        setLocation(400,200);

        setTitle("Primer texto");

        Lamina mi_lamina = new Lamina();
        add(mi_lamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.drawString("Aprendiendo Swing",100,100);

    }
}
