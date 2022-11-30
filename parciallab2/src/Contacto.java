package parciallab2.src;

public class Contacto extends Persona implements Impresion {

    public Contacto(String nombre, String apellido, String telefono, String email, int dni) {
        super(nombre, apellido, telefono, email, dni);
    }


    @Override
    public String imprimir() {
        return "Contacto\n"+
                "Nombre: " + super.getNombre() + "\n" +
                "Apellido: " + super.getApellido() + "\n" +
                "DNI: " + super.getDni() + "\n" +
                "Telefono: " + super.getTelefono() + "\n" +
                "Email: " + super.getEmail() + "\n" +
                "-----------------------------";
    }
}
