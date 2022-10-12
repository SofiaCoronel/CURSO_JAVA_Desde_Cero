package ClasePracticaPrimerPrcialLab2.P2_Cine;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Espectadores[] espectadores = new Espectadores[3];

        Empleados [] misEmpleados = new Empleados[3];

        for (int i=0; i<espectadores.length - 1; i++) {
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

                    espectadores[i] = new Espectadores(nombre, dni, fila, silla);

                    Salas sala1 = new Salas(100, "Sala 1");    // cargamos la sala y el nombre
                    sala1.setPeli("Barbie y las 12 princesas bailarinas");  // cargamos la pelicula

                    sala1.setEspectadores(espectadores);
                    System.out.println(sala1.getEspectadores());

                } catch (Exception e) {
                    System.out.println("Ocurrio un error al ingresar los datos");
                }
            }

        for (int j = 0; j < misEmpleados.length - 1; j++) {
            try {
                misEmpleados[0] = new Empleados("juan", 76234524, 85000);
                misEmpleados[1] = new Empleados("sandra", 98346253, 92000);

                for (Empleados e : misEmpleados) {
                    System.out.println(e.toString());
                }
            }catch (Exception e){
                System.out.println("Ha ocurrido un error");
            }

        }
    }
}
