package POO.PasoParametros;

public class Coche {

    //CARACTERISTICAS - Encapsulo con un modificador de acceso (PRIVATE)
    // - Solo es visible y modificable desde la propia CLASE
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    //METODO CONSTRUCTOR - Tiene el mismo nombre que la CLASE.
    public Coche(){
        ruedas  = 4;
        largo   = 2000; //cm
        ancho   = 300;  //cm
        motor   = 1600;
        peso_plataforma = 500;
    }

    //METODO GETTER - Encargado de CAPTAR el valor de esa propiedad - Siempre RETORNA algo
    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
                ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
                "cm y un peso de plataforma " + peso_plataforma + "kg.";

    }

    //METODO SETTER - Encargado de MODIFICAR el valor de la propiedad - NO Retorna
    //Ponemos los PARAMETROS entre parentesis.
    public void establece_color(String color_coche){
        color=color_coche;
    }

    public String dime_color(){
        return "El color del coche es " + color;
    }

    //-----------------------------------------------------------------

    public void configura_asientos(String asientos_cuero){  //SETTER
        if(asientos_cuero=="si"){
            this.asientos_cuero=true;   //THIS hace referencia a la CLASE
        }else {
            this.asientos_cuero=false;
        }
    }

    public String dime_asientos(){  //GETTER
        if(asientos_cuero==true){
            return "El coche tiene asientos de cuero.";
        }else {
            return "El coche tiene asientos de serie.";
        }
    }

}
