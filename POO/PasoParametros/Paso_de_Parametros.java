package POO.PasoParametros;

public class Paso_de_Parametros {
    public static void main(String[] args){
        Coche micoche = new Coche();

        micoche.establece_color("amarillo");

        System.out.println(micoche.dime_datos_generales());
        System.out.println(micoche.dime_color());

        micoche.configura_asientos("no");
        System.out.println(micoche.dime_asientos());
    }

}
