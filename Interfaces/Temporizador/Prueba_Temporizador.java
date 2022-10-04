package Interfaces.Temporizador;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class Prueba_Temporizador {
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();

        Timer mi_temporizador = new Timer(5000, oyente);    // cada 5 segundos vamos a ejecutar una accion

        mi_temporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa 'Aceptar' para detener");
    }
}

class DameLaHora implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date();
        System.out.println("Te muestro la hora cada 5 segundos: \n" + ahora);

    }
}
