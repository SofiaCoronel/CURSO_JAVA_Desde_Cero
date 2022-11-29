import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin_contacto admin_contacto = new Admin_contacto();

        File fichero = new File("contacto.txt");
        int opcion = 0;

       // File fichero = new File("contactos.dat");

        Scanner leer = new Scanner(System.in);


       do{
            System.out.println("\n ----------------------------------------\n ADMINISTRADOR DE CONTACTOS");
            System.out.println("1) Nuevo Contacto ");
            System.out.println("2) Listar todos los contactos ");
            System.out.println("3) Buscar contacto por nombre o apellido");
            System.out.println("4) Buscar contacto por dni");
            System.out.println("5) Eliminar contacto por DNI");
            System.out.println("6) Imprimir en un archivo");
            System.out.println("7) Editar contacto");
            System.out.println("99) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n 1) Nuevo Contacto: ");
                        if (fichero.exists()) {
                            admin_contacto.agregarContacto();
                            admin_contacto.crearArchivo();
                        } else {
                            try {
                                if (fichero.createNewFile()) {
                                    admin_contacto.agregarContacto();
                                    admin_contacto.crearArchivo();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                        break;
                    case 2:
                        System.out.println("\n 2) Listar todos los contactos: ");
                        admin_contacto.listarContacto();
                        break;
                    case 3:
                        System.out.println("\n 3) Buscar contacto por nombre y apellido");
                        admin_contacto.buscarContactoNombre();
                        admin_contacto.buscarContactoApellido();
                        break;
                    case 4:
                        System.out.println("\n 4) Buscar contacto por dni");
                        admin_contacto.buscarContactoDni();
                        break;
                    case 5:
                        System.out.println("\n 5) Eliminar contacto por DNI");
                        admin_contacto.eliminarContacto();
                        break;
                    case 6:
                        System.out.println("\n 6) Imprimir en un archivo");
                        Admin_contacto imprimiendo = new Admin_contacto();
                        break;
                    case 7:
                        System.out.println("\n 7) Editar contacto");
                        admin_contacto.editarContacto();
                        break;
                    case 99:
                        System.out.println("\n 99) Salir");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
       }while (opcion != 99);

    }
}
