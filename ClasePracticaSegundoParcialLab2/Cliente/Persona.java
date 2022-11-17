package ClasePracticaSegundoParcialLab2.Cliente;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    private String nombre, apellido, direccion;
    private int dni;

    public Persona(String nombre, String apellido, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getDni() {
        return this.dni;
    }
}
