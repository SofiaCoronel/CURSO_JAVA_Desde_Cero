package Serializacion.SerialVersionUID;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando_UID {
    public static void main(String[] args) {

        Administrador_UID jefe = new Administrador_UID("juan", 8000, 2020, 12, 07);
        jefe.setIncentivo(5000);

        Empleado_UID[] personal = new Empleado_UID[3];
        personal[0] = jefe;
        personal[1] = new Empleado_UID("sofia", 25000, 2022, 11, 01);
        personal[2] = new Empleado_UID("abril", 23000, 2021, 06, 17);

        try {
            // llevamos un objeto al disco - SERIALIZAMOS el obj.
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C://Excepciones//empleado.dat"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();

            // recuperamos el objeto que llevamos al disco
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C://Excepciones//empleado.dat"));
            Empleado_UID[] personal_recuperado = (Empleado_UID[]) recuperando_fichero.readObject();  // almacenamos dentro de un array lo que hay en el fichero
            recuperando_fichero.close();

            for (Empleado_UID e : personal_recuperado){   // leemos el array
                System.out.println(e);
            }

        }catch (Exception e){

        }

    }
}

class Empleado_UID implements Serializable {

    @Serial
    private static final long serialVersionUID = -582354523209483612L;  // usamos la opcion por default

    public Empleado_UID(String n, double s, int anio, int mes, int dia){
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

class Administrador_UID extends Empleado_UID {

    @Serial
    private static final long serialVersionUID = -8341383605151225547L;

    public Administrador_UID(String n, double s, int anio, int mes, int dia) {
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
