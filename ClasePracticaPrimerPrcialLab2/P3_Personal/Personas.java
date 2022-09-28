package ClasePracticaPrimerPrcialLab2.P3_Personal;

import java.util.LinkedList;

public class Personas {
    public static void main(String[] args) {
        LinkedList<Persona> personas = new LinkedList<>();

        Jefe jefe_RRHH = new Jefe("perez", "juan", 28907654, 95000);
        jefe_RRHH.subirSueldo(15);
    }
}
