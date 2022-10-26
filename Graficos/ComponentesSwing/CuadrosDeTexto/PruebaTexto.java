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

        JLabel texto1 = new JLabel("Email: ");  // colocamos una etiqueta
        add(texto1);

        campo1 = new JTextField(20);   // instanciamos un cuadro de texto
        add(campo1);    // lo incluimos a la lamina

        JButton miboton = new JButton("Comprobar");  // creamos el boton
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);    // ponemos nuestro boton a la escucha de nuestro evento
        add(miboton);
    }

    private class DameTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            // validar la direccion de email
            int correcto = 0;
            String email = campo1.getText().trim();

            for (int i=0; i < email.length(); i++){     // recorrer el String caracter a caracter
                if (email.charAt(i) == '@'){    // verifica si el email ingresado tiene un solo arroba

                    correcto ++;
                }
            }

            if (correcto != 1){
                System.out.println("Incorrecto");
            }else {
                System.out.println("Correcto");
            }

        }
    }

    private JTextField campo1;

}
