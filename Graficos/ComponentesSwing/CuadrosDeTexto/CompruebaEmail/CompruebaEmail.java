package Graficos.ComponentesSwing.CuadrosDeTexto.CompruebaEmail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompruebaEmail {
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

        setLayout(new BorderLayout());
        JPanel milamina2 = new JPanel();    // agregamos una nueva lamina
        milamina2.setLayout(new FlowLayout());

        resultado = new JLabel("", JLabel.CENTER);  // el texto del resultado aparece en el centro

        JLabel texto1 = new JLabel("Email: ");  // colocamos una etiqueta
        milamina2.add(texto1);

        campo1 = new JTextField(20);   // instanciamos un cuadro de texto
        milamina2.add(campo1);    // lo incluimos a la lamina

        add(resultado, BorderLayout.CENTER);    // colocamos el resultado en el centro

        JButton miboton = new JButton("Comprobar");  // creamos el boton
        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);    // ponemos nuestro boton a la escucha de nuestro evento
        milamina2.add(miboton);

        add(milamina2, BorderLayout.NORTH);    // colocamos la lamina 2 en la zona norte

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
                resultado.setText("Incorrecto");
            }else {
                resultado.setText("Correcto");
            }

        }
    }

    private JTextField campo1;
    private JLabel resultado;
}
