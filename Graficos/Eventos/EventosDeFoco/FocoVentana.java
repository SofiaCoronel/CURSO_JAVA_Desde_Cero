package Graficos.Eventos.EventosDeFoco;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FocoVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {

        FocoVentana miventana = new FocoVentana();
        miventana.iniciar();
    }

    public void iniciar(){
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();

        marco1.setVisible(true);
        marco2.setVisible(true);

        marco1.setBounds(100,100,600,350);
        marco2.setBounds(700,100,600,350);

        marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);

    }

    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco1){
            marco1.setTitle("Tengo el foco");
        }else {
            marco2.setTitle("Tengo el foco");
        }
    }

    public void windowLostFocus(WindowEvent e) {
        if (e.getSource() == marco1){
            marco1.setTitle("He perdido el foco");
        }else {
            marco2.setTitle("He perdido el foco");
        }

    }

    FocoVentana marco1;
    FocoVentana marco2;
}
