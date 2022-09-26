package POO.Encapsulacion;

public class Get_Y_Set {
    public static void main(String[] args){
        //CREACION DEL OBJETO

        Coche Renault = new Coche();    //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE

        System.out.println(Renault.dime_largo());

        //--------------------------------------------------

        Coche micoche = new Coche();

        micoche.establece_color();

        System.out.println(micoche.dime_color());

    }
}
