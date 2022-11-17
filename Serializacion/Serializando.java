package Serializacion;

import java.io.*;
import java.util.*;

public class Serializando {
    public static void main(String[] args) {

        Administrador jefe = new Administrador("juan", 8000, 2020, 12, 07);
        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("sofia", 25000, 2022, 11, 01);
        personal[2] = new Empleado("abril", 23000, 2021, 06, 17);

        try {
            // llevamos un objeto al disco - SERIALIZAMOS el obj.
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C://Excepciones//empleado.txt"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();

            // recuperamos el objeto que llevamos al disco - DESERIALIZAMOS el obj.
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C://Excepciones//empleado.dat"));
            Empleado[] personal_recuperado = (Empleado[]) recuperando_fichero.readObject();  // almacenamos dentro de un array lo que hay en el fichero
            recuperando_fichero.close();

            for (Empleado e : personal_recuperado){   // leemos el array
                System.out.println(e);
            }

        }catch (Exception e){

        }

    }
}

class Empleado implements Serializable {

    public Empleado(String n, double s, int anio, int mes, int dia){
        nombre = n;
        sueldo = s;

        GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);

        fechaContrato = calendario.getTime();

    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato(){
        return fechaContrato;
    }

    public void subirSueldo(double porcentaje){
        double aumento = sueldo * porcentaje/ 100;
        sueldo += aumento;
    }

    public String toString(){
        return "Nombre: " + nombre + ", sueldo: " + sueldo + ", fecha de contrato: " + fechaContrato;
    }

    private String nombre;
    private double sueldo;
    private Date fechaContrato;


}

class Administrador extends Empleado{

    public Administrador(String n, double s, int anio, int mes, int dia) {
        super(n, s, anio, mes, dia);
        incentivo = 0;
    }

    public double getSueldo(){
        double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }

    public void setIncentivo(double b){
        incentivo = b;
    }

    public String toString(){
        return super.toString() + "\nIncentivo: " + incentivo;
    }

    private double incentivo;

}
