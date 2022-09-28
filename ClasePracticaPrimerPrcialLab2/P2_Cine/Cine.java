package ClasePracticaPrimerPrcialLab2.P2_Cine;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Espectadores[] espectadores = new Espectadores[3];

        for (int i=0; i<espectadores.length; i++) {
            Scanner entrada = new Scanner(System.in);

            try {
                System.out.println("Nombre: ");
                String nombre = entrada.next();

                System.out.println("DNI: ");
                int dni = entrada.nextInt();

                System.out.println("Fila: ");
                String fila = entrada.next();

                System.out.println("Silla: ");
                int silla = entrada.nextInt();

                espectadores[i] = new Espectadores(nombre,dni,fila,silla);



            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
