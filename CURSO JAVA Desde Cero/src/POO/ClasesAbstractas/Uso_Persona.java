package POO.ClasesAbstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Sofia", 50000, 2009, 02, 25);
        lasPersonas[1] = new Alumno("Ana", "Ingenieria");

        for (Persona p: lasPersonas) {   // Bucle FOR-EACH
            System.out.println(p.dameNombre() + ": " + p.dameDescripcion());

        }
    }
}

abstract class Persona {
    public Persona(String nom){
        nombre = nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public abstract String dameDescripcion();  // DECLARAMOS UN METODO ABSTRACTO.
                                               // Se define pero NO se construye.

    private String nombre;


}

class Empleado2 extends Persona {
    public Empleado2(String nom, double sue, int anio, int mes, int dia){

        super(nom);

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();

    }

    public String dameDescripcion(){    // Sobreescribimos el metodo de la Clase padre.
        return "Este empleado tiene un sueldo = " + sueldo;
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

    private double sueldo;
    private Date altaContrato;

}

class Alumno extends Persona {
    public Alumno(String nom, String car){

        super(nom);

        carrera = car;
    }

    public String dameDescripcion(){     // Sobreescribimos el metodo de la Clase padre.
        return "Este alumno esta estudiando la carrera de " + carrera;
    }

    private String carrera;
}

