package Graficos.GUI;

import javax.swing.*;
import java.awt.*;

public class Pantalla {
    public static void main(String[] args) {

                Ventana marco = new Ventana();
                marco.setSize(500,300);
                marco.setVisible(true);
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class Ventana extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton verNombreButton;
    private JButton guardarButton;

    public Ventana(){

        add(textField1, BorderLayout.CENTER);
    }
}
