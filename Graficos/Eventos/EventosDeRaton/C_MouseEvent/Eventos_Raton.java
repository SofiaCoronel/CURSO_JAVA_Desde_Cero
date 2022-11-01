package Graficos.Eventos.EventosDeRaton.C_MouseEvent;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Eventos_Raton {
    public static void main(String[] args) {

        MarcoRaton mimarco = new MarcoRaton();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame{
    public MarcoRaton(){

        setVisible(true);
        setBounds(600,350,600,450);

        EventosDeRaton evento_raton = new EventosDeRaton();
        addMouseListener(evento_raton);   // ponemos a nuestro marco a la escucha

        EventosDeRaton2 evento_raton2 = new EventosDeRaton2();
        addMouseMotionListener(evento_raton2);

    }
}

class EventosDeRaton extends MouseAdapter{
    /* public void mouseClicked(MouseEvent e) {

        // nos muestra las coordenadas en donde hicimos clic
        System.out.println("Coordenada X: " + e.getX() + "\nCoordenada Y: " + e.getY() + "\n-----------------");

        // imprime cuantos clics se hicieron
        System.out.println(e.getClickCount());


    } */

    public void mousePressed(MouseEvent e) {    // reconoce el que boton apretamos
        // System.out.println(e.getModifiersEx());

        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Haz pulsado el boton izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Haz pulsado la rueda del raton");
        }else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Haz pulsado el boton derecho");
        }
    }
}

class EventosDeRaton2 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando el mouse");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el mouse");
    }
}

