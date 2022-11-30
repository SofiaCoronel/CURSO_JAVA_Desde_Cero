package ClasePracticaSegundoParcialLab2.Cliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona implements Informe, Serializable {
    private static final long serialVersionUID = 1L;

    private ArrayList<Double> activos;

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        super(nombre, apellido, direccion, dni);
        this.activos = new ArrayList<Double>();
    }

    // agregamos un activo a la coleccion
    public void addActivo(double activo){
        this.activos.add(activo);
    }

    // buscamos los activos por el nombre
    public Double getActivo(String nombre){
        for (Double activo : activos){
            if (activo.){
                return activo;
            }
        }
        return null;
    }
    public Activo agregarActivo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombreActivo = leer.nextLine();
        System.out.println("Monto: ");
        double montoActivo = leer.nextDouble();

        for (Double activo : activos){
            if (getActivo(getNombre()).equals(nombreActivo)){
                cliente.addActivo(montoActivo);
            }
        }
        return null;
    }
    // implementamos la interfaz INFORME
    @Override
    public String imprimirInformacion(){
        return "Cliente\n" +
                "Nombre: " + super.getNombre() + "\n" +
                "Apellido: " + super.getApellido() + "\n" +
                "Direccion: " + super.getDireccion() + "\n" +
                "DNI: " + super.getDni() + "\n" +
                "Activos: " + this.activos + "\n" +
                "-----------------------------";

    }

}

class Admin_Clientes implements Serializable{
    private static final long serialVersionUID = 1L;

    private ArrayList<Cliente> clientes;


    public Admin_Clientes(){
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(){
        Scanner leer = new Scanner(System.in);

            try {
                    System.out.println("Nombre: ");
                    String nombre = leer.nextLine();

                    System.out.println("Apellido: ");
                    String apellido = leer.nextLine();

                    System.out.println("Direccion: ");
                    String direccion = leer.nextLine();

                    System.out.println("DNI: ");
                    int dni = leer.nextInt();

                    leer.nextLine();

                    Cliente cliente = new Cliente(nombre, apellido, direccion, dni);
                    this.clientes.add(cliente);


            }catch (Exception e) {
                System.out.println("Ingreso de datos INVALIDO");
            }
    }

    // imprimimos la informacion de los clientes
    public void listarClientes(){

            if (clientes.size() == 0) {
                System.out.println("No hay clientes");
            }
            for (Cliente cliente1 : clientes) {
                System.out.println(cliente1.imprimirInformacion());
            }
    }


    // bucamos a cliente
    public void buscarCliente(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombreCliente = leer.nextLine();

        for (Cliente cliente1 : clientes){
            if (cliente1.getNombre().equals(nombreCliente)){
                System.out.println(cliente1.imprimirInformacion());
                break;
            }
        }
    }

    // eliminamos al cliente
    public void eliminarCliente(){
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente1 = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente1)) {
                clientes.remove(cliente1);
                System.out.println("Cliente eliminado");
            }else {
                    System.out.println("No se puede borrar ya que no existe el cliente");
            }
            break;
        }
    }


}


class Activo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private double monto;

    public Object getNombre() {
        return nombre;
    }

    public Object getMonto(){
        return monto;
    }
}
