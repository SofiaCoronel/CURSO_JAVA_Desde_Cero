package Colecciones.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<>();

        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Laura");
        personas.add("Eze");

        System.out.println(personas.size());    // .size - Nos muestra el numero de elementos de la lista.

        ListIterator<String> it = personas.listIterator();   // Permite insertar elementos en nuestra lista
        it.next();   // Nos desplazamos una posicion hacia adelante en nuestra lista

        it.add("Sofia");    // Agregamos elemento

        for (String persona: personas) {    // Imprimimos
            System.out.println(persona);
        }
    }
}
