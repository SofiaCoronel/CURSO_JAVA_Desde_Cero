package POO.ConstruccionDeObjetos.toString;

public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private int numControl;

    public Alumno(String nombre, String apellido, int edad, int numControl) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numControl = numControl;
    }

    public String toString(){
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nNumero de Control: "+numControl+"\n-----------------------";
    }
}
