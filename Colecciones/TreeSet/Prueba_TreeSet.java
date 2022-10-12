package Colecciones.TreeSet;

import java.util.TreeSet;

public class Prueba_TreeSet {
    public static void main(String[] args) {

        /*
        TreeSet<String> ordenaPersonas = new TreeSet<String>();

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");

        for (String s: ordenaPersonas){     // imprime la lista en orden alfabetico
            System.out.println(s);
        }
         */

        Articulo primero = new Articulo(1, "Primer articulo");
        Articulo segundo = new Articulo(2, "Segundo articulo");
        Articulo tercero = new Articulo(3, "Tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();

        ordenaArticulos.add(segundo);
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(primero);

        for (Articulo art: ordenaArticulos){    // imprimimos los articulos
            System.out.println(art.getDescripcion());
        }

    }
}

class Articulo implements Comparable<Articulo>{

    public Articulo(int num, String desc){
        numero_articulo = num;
        descripcion = desc;
    }

    @Override
    public int compareTo(Articulo o) {  // ordena los artiulos en funcion del numero de articulo
        return numero_articulo - o.numero_articulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    private int numero_articulo;
    private String descripcion;
}
