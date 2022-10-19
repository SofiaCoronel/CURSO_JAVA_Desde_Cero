package ClasePracticaPrimerPrcialLab2.P3_Personal;

import java.util.Scanner;

public class Interaccion {
    public static void main(String[] args) {
        Personas personas = new Personas();
        int opcion = 99;
        Scanner entrada = new Scanner(System.in);

        try {
            while (opcion != 0){
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Ingrese el apellido:");
                        String apellido = entrada.next();
                        System.out.println("Ingrese el salario basico:");
                        double salario = entrada.nextDouble();
                        System.out.println("Es Empleado o Jefe?:");
                        String tipo = entrada.next();

                        if (tipo.equals("empleado")){
                            Empleado empleado = new Empleado(nombre, apellido, salario);
                            personas.addPersonas(empleado);
                        } else {
                            System.out.println("Ingrese el porcentaje: ");
                            double porcentaje = entrada.nextDouble();

                            Jefe jefe = new Jefe(apellido, nombre, salario, porcentaje);
                            personas.addPersonas(jefe);
                        }
                        break;
                    case 2:
                        personas.listarPersonas();
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre: ");
                        String nombreAumentar = entrada.next();
                        System.out.println("Ingrese el monto a aumentar: ");
                        double monto = entrada.nextDouble();
                        personas.aumentarSalario(nombreAumentar, monto);
                        break;
                    case 4:
                        System.out.println("Ingrese el nombre: ");
                        String nombreVerSueldo = entrada.next();
                        personas.verSueldo(nombreVerSueldo);
                        break;
                    case 99:
                        opcion = 99;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida.");
                }
                System.out.println("\n-------------------------------\n"
                + "1. Crear una Persona\n"
                + "2. Listar Personas\n"
                + "3. Subir sueldo\n"
                + "4. Ver sueldo\n"
                + "0. Salir\n"
                + "Ingrese una opcion");

                opcion = entrada.nextInt();
            }
        }catch (Exception e){
            System.out.println("Error al ingresar los datos");
            opcion = 99;
        }
    }
}
