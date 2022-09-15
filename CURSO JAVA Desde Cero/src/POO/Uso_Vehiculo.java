package POO;

import POO.Herencia.Furgoneta;
import POO.PasoParametros.Coche;

public class Uso_Vehiculo {
    public static void main(String[] args){

        Coche mi_coche1 = new Coche();
        mi_coche1.establece_color("Azul.");

        Furgoneta mi_furgoneta1 = new Furgoneta(7, 580);
        mi_furgoneta1.establece_color("Negro.");
        mi_furgoneta1.configura_asientos("Si");

        System.out.println(mi_coche1.dime_datos_generales() +"\n" + mi_coche1.dime_color());
        System.out.println(mi_furgoneta1.dime_datos_generales() + "\n" + mi_furgoneta1.dimeDatosFurgoneta());
    }
}
