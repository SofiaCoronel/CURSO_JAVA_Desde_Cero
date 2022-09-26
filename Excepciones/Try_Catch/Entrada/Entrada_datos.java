package Excepciones.Try_Catch.Entrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_datos {
    public static void main(String[] args) {
        System.out.println("Que desea hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);

        int decision = entrada.nextInt();

        if (decision == 1){
            pedirDatos();
        } else{
            System.out.println("Adios");
            System.exit(0);
        }
        entrada.close();
    }

    static void pedirDatos() throws InputMismatchException {    // InputMismatchException es el tipo de excepcion que se produjo
                                                                // Si el codigo falla, creamos un objeto a traves del throws

        try {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce tu nombre por favor");

            String nombre_usuario = entrada.nextLine();

            System.out.println("Introduce tu edad por favor");

            int edad = entrada.nextInt();

            System.out.println("Hola " + nombre_usuario + ". El anio que viene tendras " + (edad + 1) + " anios");

            entrada.close();

        } catch (InputMismatchException e){   // Si falla el codigo lo capturamos en la e
                                              // Tambien podemos colocar solamente (Exception e)

            System.out.println("Datos invalidos");
        }

        System.out.println("Hemos termianndo");
    }
}
