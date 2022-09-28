package Colecciones.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {
    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList<>();
        paises.add("Argentina");
        paises.add("Mexico");
        paises.add("Colombia");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<>();
        capitales.add("BS AS");
        capitales.add("CDMX");
        capitales.add("Bogota");
        capitales.add("Lima");

        System.out.println(paises);
        System.out.println(capitales);

        ListIterator<String> iterA = paises.listIterator();
        ListIterator<String> iterB = capitales.listIterator();

        // Agregar a la primer lista los elementos de la segunda

        while(iterB.hasNext()){
            if (iterA.hasNext()){   // Salta una posicion
                iterA.next();
            }
            iterA.add(iterB.next());    //Agregamos el 1er elemento de Capitales a continuacion de paises
        }

        System.out.println(paises);    // Imprimimos la lista

        //----------------------------------------------------------------------------------------------
        // Quitamos las posiciones PARES de la lista

        iterB = capitales.listIterator();   // El Iterador vuelve al principio de la lista

        while (iterB.hasNext()){    // preguntamos si hay una posicion
            iterB.next();   // salta una posicion

            if (iterB.hasNext()){   //preguntamos si hay una posicion

                iterB.next();   // salta una posicion. Dejamos detras la posicion 2.

                iterB.remove();   // eliminamos la posicion 2
            }
        }
        System.out.println(capitales);

        //----------------------------------------------------------------------------------------------

        paises.removeAll(capitales);    // quitamos las capitales

        System.out.println(paises);
    }
}
