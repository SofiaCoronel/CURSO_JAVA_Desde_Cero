package Graficos.GUI;

import javax.swing.*;

public class Pantalla {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame marco = new Ventana();
                marco.setSize(500,300);
                marco.setVisible(true);
                marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
