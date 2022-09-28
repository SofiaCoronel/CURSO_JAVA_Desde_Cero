package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class CuentaUsuario {
    public static void main(String[] args) {

        // Creamos los clientes
        Cliente cl1 = new Cliente("sofia", "00001", 200000);
        Cliente cl2 = new Cliente("Abril", "00002", 300000);
        Cliente cl3 = new Cliente("Eli", "00003", 500000);
        Cliente cl4 = new Cliente("Emilio", "00004", 780000);
        Cliente cl5 = new Cliente("sofia", "00001", 200000);


        // Creamos la coleccion
        Set<Cliente> clientesBanco = new HashSet<Cliente>();    // HashSet NO permite el ordenamiento

        clientesBanco.add(cl1);     // Agregamos los clientes a la coleccion
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        for (Cliente cliente : clientesBanco) {     // Recorremos la coleccion
            System.out.println(cliente.getNombre() + " " + cliente.getNum_cuenta() +
                    " " + cliente.getSaldo());
        }


    }
}
