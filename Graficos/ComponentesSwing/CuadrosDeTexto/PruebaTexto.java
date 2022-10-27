package Graficos.ComponentesSwing.CuadrosDeTexto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTexto {
    public static void main(String[] args) {

        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto(){

        setBounds(600,200,450,350);
        LaminaTexto milamina = new LaminaTexto();
        add(milamina);
        setVisible(true);

    }
}

class LaminaTexto extends JPanel{
    public LaminaTexto(){

        campo1 = new JTextField(20);  // colocamos una etiqueta
        add(campo1);

        JButton miboton = new JButton("Comprobar");  // creamos el boton
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);    // ponemos nuestro boton a la escucha de nuestro evento
        add(miboton);
    }

    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());
        }
    }

    private JTextField campo1;

}
