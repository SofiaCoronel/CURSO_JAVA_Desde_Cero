package POO.Casting;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado_Casting_De_Objetos {
    public static void main(String[] args) {

        Jefe jefe_RRHH = new Jefe("Juan", 96500.0,2022,07,25);
        jefe_RRHH.establece_incentivo(4570);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado("Sofia Luna", 85000, 2018, 12, 17);
        misEmpleados[1] = new Empleado("Abril Coronel", 83500, 2015, 5, 9);
        misEmpleados[2] = new Empleado("Emilio Coronel", 120000, 2010, 1, 24);

        misEmpleados[3] = new Empleado("Antonio Fernandez");  // llamamos al 2do constructor

        misEmpleados[4] = jefe_RRHH;    //POLIMORFISMO. Principio de sustitucion

        misEmpleados[5] = new Jefe("Maria", 97000, 2016, 05, 15);

        Jefe jefa_Finanzas = (Jefe) misEmpleados[5];    //CASTING. Convertimos un Objeto de un tipo, en otro.
        jefa_Finanzas.establece_incentivo(15000);

        for (Empleado e: misEmpleados){     //subimos el sueldo
            e.subeSueldo(5);
        }

        for (Empleado e: misEmpleados) {    //imprimimos en consola
            System.out.println("Nombre: " + e.dameNombre() + " - Sueldo: " + e.dameSueldo() +
                    " - Fecha de Alta: " + e.dameFechaContrato());
        }

    }
}
class Empleado{    // 1er constructor
    public Empleado(String nom, double sue, int anio, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        altaContrato = calendario.getTime();

    }


    //SOBRECARGA
    //creamos el 2do constructor
    public Empleado(String nom){
        nombre = nom;
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

class Jefe extends Empleado {
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


