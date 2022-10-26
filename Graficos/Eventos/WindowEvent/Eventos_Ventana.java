package Graficos.Eventos.WindowEvent;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Eventos_Ventana {
    public static void main(String[] args) {

        MarcoVentana mimarco = new MarcoVentana();
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(100,300,500,350);
        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        MarcoVentana mimarco2 = new MarcoVentana();
        mimarco2.setTitle("Ventana 2");
        mimarco2.setBounds(600,300,500,350);
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){

        setVisible(true);

        MiVentana oyente_ventana = new MiVentana();
        addWindowListener(oyente_ventana);
    }
}

class MiVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
}
