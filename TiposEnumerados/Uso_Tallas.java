package TiposEnumerados;

import java.util.Scanner;

public class Uso_Tallas {

    enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};    //Creamos las variables del tipo enumerado.

    public static void main(String[] args) {
        String talla;

        talla = "pequeña";
        talla = "mediana";
        talla = "grande";
        talla = "azul";   // --> No es una talla.

        /*
        TIPO ENUMERADO: es una variable en la cual solo
        se podra almacenar UN SOLO TIPO de valores.
         */

        Talla s = Talla.MINI;   // Usamos los tipos ENUMERADOS.
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
    }
}

    // Creamos un OCNSTRUCTOR para pedir la Talla por consola.
class Talla2{
    enum Tallas {

        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private Tallas(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura(){
            return abreviatura;
        }

        private String abreviatura;
    };

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");

            String entrada_datos = entrada.next().toUpperCase();    // Pasamos a MAYUSCULAS lo que el usuario pueda
                                                                    // escribir por consola.

            Tallas la_talla = Enum.valueOf(Tallas.class, entrada_datos);  // EL metodo ValueOf nos devuelve el nombre de
                                                                            // la constante enumerdada a la que pertenece el texto introducido.

            System.out.println("Talla = " + la_talla);

            System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
        }

        //Prueba git
}
