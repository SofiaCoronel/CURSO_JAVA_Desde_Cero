package Graficos.Eventos.EventosDeFoco.Verif_Email;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocoEvento {
    public static void main(String[] args) {
        MarcoFoco mimarco = new MarcoFoco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame{
    public MarcoFoco(){

        setVisible(true);
        setBounds(300,300,600,450);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        setLayout(null);     // invalidamos el layout

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120,10,150,20);   // creamos los cuadros de texto
        cuadro2.setBounds(120,50,150,20);

        add(cuadro1);   // agregamos los cuadros
        add(cuadro2);

        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);

    }

    private class LanzaFocos implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
        }

        @Override
        public void focusLost(FocusEvent e) {

            String email = cuadro1.getText();

            boolean comprobacion = false;

            for (int i=0; i < email.length(); i++){

                if (email.charAt(i) == '@') {    // evalua caracter a caracter

                    comprobacion = true;
                }
            }
            if (comprobacion){
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto");
            }
        }
    }

    JTextField cuadro1;
    JTextField cuadro2;

}
