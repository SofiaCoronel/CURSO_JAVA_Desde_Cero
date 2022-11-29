import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Admin_contacto {
    private ArrayList<Contacto> contactos;

    public Admin_contacto(){
        this.contactos = new ArrayList<Contacto>();

    }
    File nuevo_contacto;

    public void agregarContacto() {

        Scanner leer = new Scanner(System.in);

        try {

            System.out.println("nombre: ");
            String nombre = leer.nextLine();


            System.out.println("apellido: ");
            String apellido = leer.nextLine();

            System.out.println("DNI:");
            int dni = leer.nextInt();

            System.out.println("telefono: ");
            String telefono = leer.nextLine();

            System.out.println("email: ");
            String email = leer.nextLine();

            leer.nextLine();

            Contacto contacto = new Contacto(nombre, apellido, telefono, email, dni);
            this.contactos.add(contacto);
            escribir_archivo(contacto);
        } catch (Exception e) {
            System.out.println("ERROR EN EL INGRESO DE DATOS");
        }
    }

    public int tamanio(){   // cantidad de contactos
        return contactos.size();
    }

    public Contacto obtener(int pos){
        return contactos.get(pos);
    }

    public void listarContacto(){
        if (contactos.size() == 0){
            System.out.println("La lista esta vacia");
        }
        for (int i=0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i).imprimir());
        }
        System.out.println("\nLa lista tiene " + tamanio() + " contactos.");
    }

    public void buscarContactoNombre(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Nombre ");
        String nombreContacto = leer.nextLine();

        for (Contacto contacto : contactos){
            if (contacto.getNombre().equals(nombreContacto) ){
                System.out.println(contacto.imprimir());
                System.out.println("Se encontraron " + tamanio() + " contactos.");
                break;
            }else {
                System.out.println("No se encontraron contactos");
            }
        }

    }

    public void buscarContactoApellido(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Apellido: ");
        String apellidoContacto = leer.nextLine();

        for (Contacto contacto : contactos){
            if (contacto.getApellido().equals(apellidoContacto) ){
                System.out.println(contacto.imprimir());
                System.out.println("Se encontraron " + tamanio() + " contactos.");
                break;
            }else {
                System.out.println("No se encontraron contactos");
            }
        }

    }

    public Contacto buscarContactoDni(){
        Scanner leer = new Scanner(System.in);
        System.out.print("DNI: ");
        int dnicontacto = leer.nextInt();

        for (Contacto contacto : contactos){
            if (contacto.getDni()== dnicontacto){
                System.out.println(contacto.imprimir());
                System.out.println("Se encontraron " + tamanio() + " contactos.");
                break;
            }else {
                System.out.println("No se encontraron contactos");
            }
        }

        return null;
    }

    public void editarContacto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("DNI: ");
        int editContacto = leer.nextInt();
        try {

            for (Contacto contacto : contactos) {
                if (contacto.getDni() == editContacto) {
                    System.out.println("nombre: ");
                    String nombre = leer.nextLine();

                    System.out.println("apellido: ");
                    String apellido = leer.nextLine();

                    System.out.println("DNI:");
                    int dni = leer.nextInt();

                    System.out.println("telefono: ");
                    String telefono = leer.nextLine();

                    System.out.println("email: ");
                    String email = leer.nextLine();

                    leer.nextLine();

                    Contacto contacto1 = new Contacto(nombre, apellido, telefono, email, dni);
                    this.contactos.add(contacto1);
                    escribir_archivo(contacto1);
                    listarContacto();
                    System.out.println("Contacto modificado");
                } else {
                    System.out.println("No existe el contacto");
                }
            }
        }catch (Exception e){
        }
    }

    public void eliminarContacto(){
        Scanner leer = new Scanner(System.in);
        System.out.print("DNI: ");
        int dniContacto1 = leer.nextInt();

        for (Contacto contacto : contactos) {
            if (contacto.getDni() == dniContacto1) {
                contactos.remove(contacto);
                escribir_archivo(contacto);
                listarContacto();
                System.out.println("Contacto eliminado");
            }else {
                System.out.println("No se puede borrar ya que no existe el contacto");
            }
            break;
        }
    }

    public void crearArchivo() {
        try {
            nuevo_contacto = new File("C:" + File.separator + "contacto.txt");

            if (nuevo_contacto.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("contacto.txt"));
                String linea;
                while ((linea = br.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(linea, ", ");
                }
                br.close();
            } else {
                try {
                    if (nuevo_contacto.createNewFile()) {
                        System.out.println("Contacto creado");
                    }
                } catch (Exception e) {
                }
            }
        }catch (Exception e){
        }
    }

    public void escribir_archivo(Contacto contacto){
        try {
            PrintWriter escritura = new PrintWriter(new FileWriter("contacto.txt"));
            for (int i=0; i < tamanio(); i++){
                escritura.println(obtener(i).imprimir());
            }
            escritura.close();

        } catch (Exception e) {
        }
    }

}

