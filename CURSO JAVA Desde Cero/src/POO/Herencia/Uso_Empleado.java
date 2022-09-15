package POO.Herencia;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("sofia luna", 85000, 2018, 12, 17);

        Empleado empleado2 = new Empleado("abril coronel", 83500, 2015, 5, 9);

        Empleado empleado3 = new Empleado("emilio coronel", 120000, 2010, 1, 24);

        empleado1.subeSueldo(15);   //modificamos el sueldo
        empleado2.subeSueldo(20);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() +
                " Fecha de alta: " + empleado1.dameFechaContrato());

        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() +
                " Fecha de alta: " + empleado2.dameFechaContrato());

        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() +
                " Fecha de alta: " + empleado3.dameFechaContrato());

    }
}

class Empleado{
    public Empleado(String nom, double sue, int anio, int mes, int dia){
        nombre = nom;
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();

    }

    public String dameNombre() {    //GETTER
        return nombre;
    }

    public double dameSueldo() {    //GETTER
        return sueldo;
    }
    public Date dameFechaContrato(){    //GETTER

        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {     //SETTER
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

}

class Jefe extends Empleado{
    public Jefe(String nombre, double sueldo, int anio, int mes, int dia){

        super(nombre, sueldo, anio, mes, dia);

    }
    public void establece_incentivo(double b){

        incentivo = b;
    }

    public double dameSueldo(){  // SOBREESCRIBIMOS EL METODO DE LA CLASE PADRE
        double sueldo_jefe = super.dameSueldo();  // Llamamos a la clase Padre.
        return sueldo_jefe + incentivo;
    }
    private double incentivo;
}