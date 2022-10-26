package Graficos.Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {
    public static void main(String[] args) {

        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame{

    public MarcoBotones() {
        setTitle("Botones y Eventos");
        setBounds(400,200,500,300);

        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }
}

class LaminaBotones extends JPanel{

    JButton botonAzul = new JButton("Azul");    // construimos un boton
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones(){
        add(botonAzul);     // agregamos los botones
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo amarillo = new ColorFondo(Color.yellow);   // instanciamos los colores
        ColorFondo azul = new ColorFondo(Color.blue);
        ColorFondo rojo = new ColorFondo(Color.red);


        botonAzul.addActionListener(azul);  // el boton va a desencadenar un evento
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);
    }

    private class ColorFondo implements ActionListener{

        public ColorFondo(Color c){
            colorDeFondo = c;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }

        private Color colorDeFondo;

    }
}


