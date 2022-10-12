package Excepciones.Throw;

import javax.swing.*;
import java.io.EOFException;

public class Comprueba_email {
    public static void main(String[] args) {

        String el_mail = JOptionPane.showInputDialog("Introduce tu e-mail: ");

        try {
            examina_mail(el_mail);
        }catch (EOFException e){
            System.out.println("La direccion de email ingresada no es correcta.");
        }
    }

    static void examina_mail(String mail) throws EOFException {
        int arroba = 0;
        boolean punto = false;
        

        // lanzamos manualmente un error si el email ingresado tiene 3 o menos caracteres
        if (mail.length() <= 3) {

            throw new EOFException();

        } else {

            for (int i = 0; i < mail.length(); i++) {

                if (mail.charAt(i) == '@') {
                    arroba++;
                }

                if (mail.charAt(i) == '.') {
                    punto = true;
                }
            }
            if (arroba == 1 && punto == true) {
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }
        }
    }
}
