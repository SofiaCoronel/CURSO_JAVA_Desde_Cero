package Colecciones.Maps;

import java.util.*;

public class Prueba_Mapas {
    public static void main(String[] args) {

        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        // String es la CLAVE - Empleado es el VALOR

        personal.put("145", new Empleado("sofia"));     // CREAMOS un obj. y agregamos un empleado.
        personal.put("146", new Empleado("abril"));
        personal.put("147", new Empleado("sam"));
        System.out.println(personal);   // imprimimos

        personal.remove("147");     // ELIMINAMOS un elemento usando la clave
        System.out.println(personal);

        personal.put("145", new Empleado("eze"));   // REEMPLAZAMOS un elemento de la lista
        System.out.println(personal);

        System.out.println(personal.entrySet());    // nos devuelve una coleccion de tipo set, e imprimir.

        for(Map.Entry<String, Empleado> entrada : personal.entrySet()){
           // almacenamos en dos variables la ENTRADA y el VALOR.
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();

            System.out.println("Clave = " + clave + ", Valor = " + valor);
        }
    }
}

class Empleado{
    public Empleado(String n){
        nombre = n;
        sueldo = 2000;
    }

    public String toString(){
        return " [Nombre = " + nombre + " , sueldo = " + sueldo + " ]";
    }

    private String nombre;
    private double sueldo;
}
