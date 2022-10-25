package Graficos.Interface_Swing;

import javax.swing.*;

public class Swing {
    public static void main(String[] args){

        miMarco marco1 = new miMarco();  // instanciamos el obj

    }
}

class miMarco extends JFrame {  // heredamos de la clase JFrame
    public miMarco(){   // constructor

        // setSize(200,200);   // tamaño del marco

        // setLocation(600,300);   // establecemos la posicion donde queremos colocar el marco

        setBounds(600,300,400,400);  // establece la ubicacion y el tamaño del marco

        setVisible(true);    // hacemos visible la ventana

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // cuando se cierre la ventana, el programa termina

        setResizable(false);    // no permite que el tamaño de la ventana se pueda redimensionar

        // setExtendedState(Frame.MAXIMIZED_BOTH);   // la ventana se abre a pantalla completa

        setTitle("Mi ventana");

    }
}