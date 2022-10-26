package Graficos.Layouts.FlowLayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayouts {
    public static void main(String[] args) {

        Marco_Layout mimarco = new Marco_Layout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class Marco_Layout extends JFrame{
    public Marco_Layout(){

        setTitle("Prueba Acciones");
        setBounds(600,350,600,300);

        Panel_Layout lamina = new Panel_Layout();
        add(lamina);
    }
}

class Panel_Layout extends JPanel{
    public Panel_Layout(){

        // alineamos los elementos
        setLayout(new FlowLayout(FlowLayout.CENTER,75,100));    // establecemos una separacion horizontal y vertical respecto al borde

        add(new JButton("Amarillo"), BorderLayout.NORTH);   // creamos tres botones y establecemos la posicion
        add(new JButton("Rojo"), BorderLayout.SOUTH);
        add(new JButton("Azul"), BorderLayout.WEST);

    }
}
