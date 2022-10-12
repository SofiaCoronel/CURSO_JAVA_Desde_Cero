package ClasePracticaPrimerPrcialLab2;

public class Verificar {
    public static void main(String[] args) {
        Clase1 obj = new Clase2();
    }
}
class Clase1{
    public void metodo1(){
        System.out.println("datos");
    }
    String datos = "datos";
}
class Clase2 extends Clase1{
    @Override
    public void metodo1() {

    }
    String datos = "muchos datos";
}
