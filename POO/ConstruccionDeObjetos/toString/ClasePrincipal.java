package POO.ConstruccionDeObjetos.toString;

public class ClasePrincipal {
    public static void main(String[] args) {

        Alumno al1 = new Alumno("Sofia", "Coronel", 20, 1234);
        Alumno al2 = new Alumno("Abril", "Coronel", 23, 1245);
        Alumno al3 = new Alumno("Emilio", "Coronel", 50, 1238);

        System.out.println("Alumno 1: ");
        System.out.println(al1);
        System.out.println("Alumno 2: ");
        System.out.println(al2);
        System.out.println("Alumno 3: ");
        System.out.println(al3);

    }
}
