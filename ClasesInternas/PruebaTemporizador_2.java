package ClasesInternas;

import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;


public class PruebaTemporizador_2 {
    public static void main(String[] args) {

        Reloj mi_reloj = new Reloj(3000, true);
        mi_reloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa 'Aceptar' para detener");
        System.exit(0);
    }
}

class Reloj{
    public Reloj(int intervalo, boolean sonido){

        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha(){

        ActionListener oyente = new DameLaHora2();

        Timer mi_temporizador = new Timer(intervalo, oyente);

        mi_temporizador.start();
    }

    private int intervalo;
    private boolean sonido;

    // creamos la CLASE INTERNA
    private class DameLaHora2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();

            System.out.println("Te muestro la hora cada 3 segundos: \n" + ahora);

            if (sonido == true){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
