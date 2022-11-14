package EstructuraDeDatos.Lineales.Pilas;

import javax.swing.*;

class Nodo {
    int informacion;
    Nodo siguiente;

    public Nodo(int valor) {
        informacion = valor;
        siguiente = null;
    }
}

class Pila {

    private Nodo ultimoValorIngresado;
    int tamanio;
    String Lista = "";

    public Pila() {
        ultimoValorIngresado = null;
        tamanio = 0;
    }

    // Metodo para saber si la pila esta vacia
    public boolean PilaVacia(){

        return ultimoValorIngresado == null;
    }

    // Metodo para insertar un nodo en la pila
    public void InsertarNodo(int nodo){

        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevo_nodo;

        tamanio++;
    }

    // Metodo para eliminar un elemento de la pila
    public int EliminarNodo(){

        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;

        tamanio--;
        return auxiliar;
    }

    // Metodo para conocer el ultimo elemento ingresado
    public int MostrarUltimoValorIngresado(){
        return ultimoValorIngresado.informacion;
    }

    // Metodo para conocer el tamaño de la pila
    public int TamanioPila(){
        return tamanio;
    }

    // Metodo para vaciar nuestra pila
    public void VaciarPila(){
        while (! PilaVacia()){
            EliminarNodo();
        }
    }

    // Metodo para mostrar el contenido de la pila
    public void MostrarValores(){

        Nodo recorrido = ultimoValorIngresado;

        while (recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }

        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
