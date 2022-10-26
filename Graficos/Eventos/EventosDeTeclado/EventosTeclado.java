package Graficos.Eventos.EventosDeTeclado;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventosTeclado {
    public static void main(String[] args) {

        MarcoConTeclado mimarco = new MarcoConTeclado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclado extends JFrame{
    public MarcoConTeclado(){
        setVisible(true);
        setBounds(700,300,600,450);

        EventoDeTeclado tecla = new EventoDeTeclado();  // instanciamos la clase oyente
        addKeyListener(tecla);
    }
}

class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {  // la tecla ha bajado y subido
        char letra = e.getKeyChar();
        System.out.println(letra);   // imprime la letra presionada
    }

    @Override
    public void keyPressed(KeyEvent e) {    // presiona la tecla
        // int codigo = e.getKeyCode();
        // System.out.println(codigo);    // imprime el codigo de la tecla
    }

    @Override
    public void keyReleased(KeyEvent e) {   // la tecla se levanta

    }
}