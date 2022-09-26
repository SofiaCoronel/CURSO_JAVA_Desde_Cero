package POO.ModificadoresDeAcceso;

public class Clase1 {

    int mivar = 5;   // No poner nada, tiene el modificador por defecto.
    protected int mivar2 = 7;   //Protected permite ser visible a las subclases.

    String mimetodo(){  // Modificador por defecto.
        return  "El valor de mivar2 es: " + mivar2;
    }
}
