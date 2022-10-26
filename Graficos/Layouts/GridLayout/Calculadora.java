package Graficos.Layouts.GridLayout;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {

        MarcoCalculadora mimarco = new MarcoCalculadora();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame{
    public MarcoCalculadora(){

        setTitle("Calculadora");
        setBounds(500,300,450,300);

        LaminaCalculadora milamina = new LaminaCalculadora();
        add(milamina);
    }
}

class LaminaCalculadora extends JPanel{
    public LaminaCalculadora(){

        setLayout(new BorderLayout());

        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);    // deshabilitamos el boton
        add(pantalla, BorderLayout.NORTH);

        JPanel milamina2 = new JPanel();
        milamina2.setLayout(new GridLayout(4,4));

        JButton boton1 = new JButton("1");
        milamina2.add(boton1);
        JButton boton2 = new JButton("2");
        milamina2.add(boton2);
        JButton boton3 = new JButton("3");
        milamina2.add(boton3);
        JButton boton4 = new JButton("4");
        milamina2.add(boton4);


        add(milamina2, BorderLayout.CENTER);
    }
}