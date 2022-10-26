package Graficos.Eventos.CambiosDeEstado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambioEstado {
    public static void main(String[] args) {
        
        MarcoEstado mimarco = new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class MarcoEstado extends JFrame{

    public MarcoEstado(){
        setVisible(true);
        setBounds(300,300,500,350);

        CambiaEstado nuevo_esatdo = new CambiaEstado();
        addWindowStateListener(nuevo_esatdo);

    }
}
class CambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {

        System.out.println("La ventana ha cambiado de estado");

        // System.out.println(e.getNewState());    // imprime el nuevo estado de la ventana

        if (e.getNewState() == Frame.MAXIMIZED_BOTH){   // 6 - detectamos el cambio de estado e imprimimos en pantalla el cambio de estado
            System.out.println("La ventana esta en pantalla completa");
        }else if (e.getNewState() == Frame.NORMAL){     // 0
            System.out.println("La ventana esta normal");
        }else if (e.getNewState() == Frame.ICONIFIED){  // 1
            System.out.println("La ventana esta minimizada");
        }
    }
}