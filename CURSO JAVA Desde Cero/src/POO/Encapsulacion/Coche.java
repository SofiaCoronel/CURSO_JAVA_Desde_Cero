package POO.Encapsulacion;

public class Coche {

    //CARACTERISTICAS - Encapsulo con un modificador de acceso (PRIVATE)
    // - Solo es visible y modificable desde la propia CLASE
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    //METODO CONSTRUCTOR - Tiene el mismo nombre que la CLASE.
    public Coche(){
        ruedas=4;
        largo=2000; //cm
        ancho=300;  //cm
        motor=1600;
        peso_plataforma=500;
    }

    //METODO GETTER - Encargado de CAPTAR el valor de esa propiedad - Siempre RETORNA algo
    public String dime_largo(){
        return "El largo del coche es " + largo;

    }
    //METODO SETTER - Encargado de MODIFICAR el valor de la propiedad - NO Retorna
    public void establece_color(){

        color="azul";
    }

    public String dime_color(){
        return "El color del coche es "+color;
    }


}
