package Graficos.Eventos.EventosDeRaton.C_MouseAdapter;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

    }
}

/* -- PRIMER MANERA DE HACERLO (sin tener que implementar todos los metodos) -- */
class EventosDeRaton extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
    }
}

/*  -- SEGUNDA MANERA DE HACERLO --
class EventosDeRaton implements MouseListener{    // clase oyente

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Haz hecho clic");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");

    }
}
 */