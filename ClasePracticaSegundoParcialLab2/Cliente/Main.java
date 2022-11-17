package ClasePracticaSegundoParcialLab2.Cliente;

import ClasePracticaPrimerPrcialLab2.P1_Facultad.Estudiante;
import ClasePracticaSegundoParcialLab2.Cliente.Admin_Clientes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Admin_Clientes adminClientes = new Admin_Clientes();

        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        try {
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C://Excepciones//cliente.dat"));
            escribiendo_fichero.writeObject(adminClientes);
            escribiendo_fichero.close();
        }catch (Exception e) {

        }

            do {
                System.out.println("\n--------------------------\n" +
                        "Bienvenido\n" +
                        "Elija una opcion:\n");
                System.out.println("    1) Crear Cliente");
                System.out.println("    2) Listar Clientes");
                System.out.println("    3) Buscar y Listar datos");
                System.out.println("    4) Buscar y Eliminar Cliente");
                System.out.println("    5) Agregar Activo a Cliente");
                System.out.println("    6) Salir");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        // agregar cliente
                        System.out.println("\n1) Crear Cliente");
                            adminClientes.agregarCliente();
                    break;

                    case 2:
                        // listar cliente
                        System.out.println("\n2) Listar Cliente");
                        adminClientes.listarClientes();
                        break;

                    case 3:
                        // buscar y listar
                        System.out.println("\n3) Buscar por Nombre y Listar los datos");
                        adminClientes.buscarCliente();
                        break;

                    case 4:
                        // buscar y eliminar
                        System.out.println("\n4) Buscar y Eliminar un Cliente");
                            adminClientes.eliminarCliente();
                        break;
                /*case 5:
                    // agregar activo a cliente
                    System.out.println("\n5) Agregar Activo a Cliente");
                    adminClientes.;
                    break;

                 */
                    case 6:
                        // salir
                        System.out.println("\n6) Salir");
                        break;
                    default:
                        System.out.println("\nOpcion invalida");
                        break;
                }


            } while (opcion != 6);

            try{
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C://Excepciones//cliente.dat"));
            List<Cliente> personal_recuperado = (ArrayList<Cliente>) recuperando_fichero.readObject();  // almacenamos dentro de un array lo que hay en el fichero
            recuperando_fichero.close();

            for (Cliente e : personal_recuperado){   // leemos el array
                System.out.println(e.imprimirInformacion());
            }
        }catch (IOException e){
                e.printStackTrace();
            }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (ClassCastException e){
                e.printStackTrace();
            }
    }
}
