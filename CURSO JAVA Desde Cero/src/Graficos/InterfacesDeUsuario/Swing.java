package Graficos.InterfacesDeUsuario;

import javax.swing.*;

public class Swing {
    public static void main(String[] args){

        miMarco marco1 = new miMarco();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame {  //HEREDAMOS DE LA CLASE JFRAME
    public miMarco(){   //CONSTRUCTOR

        setSize(500,300);   //TAMAÑO DEL MARCO

    }
}