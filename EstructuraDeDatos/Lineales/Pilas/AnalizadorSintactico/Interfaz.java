package EstructuraDeDatos.Lineales.Pilas.AnalizadorSintactico;

import javax.swing.*;
import java.awt.*;

public class Interfaz {

    private javax.swing.JTextField txt_expresion;
    private JPanel panel1;
    private javax.swing.JButton validarExpresionButton;


    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

     */


    public boolean ValidarExpresion() {

        Pila pila = new Pila();
        String cadena = txt_expresion.getText();

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.Insertar(cadena.charAt(i));

            } else {
                if (cadena.charAt(i) == ')') {
                    if (pila.extraer() != '(') {
                        return false;
                    }
                } else {
                    if (cadena.charAt(i) == ']') {
                        if (pila.extraer() != '[') {
                            return false;
                        }
                    } else {
                        if (cadena.charAt(i) == '}') {
                            if (pila.extraer() != '{') {
                                return false;
                            }
                        }

                    }
                }
            }
        }
        return pila.PilaVacia();
    }

}
