package Graficos.Ejemplos.CarritoCompras.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Graficos.Ejemplos.CarritoCompras.modelo.Cliente;
import Graficos.Ejemplos.CarritoCompras.vista.InterfazVista;
import Graficos.Ejemplos.CarritoCompras.vista.VentanaCliente;

public class ControladorCliente implements ActionListener {

    private InterfazVista vista;
    private VentanaCliente ventanaCliente;

    public ControladorCliente(InterfazVista v) {
        vista = v;
        setearControlador();
        setearTabla();
    }

    private void setearTabla() {
        // Traigo de la base los clientes
        Cliente clienteBD = new Cliente();
    }

    private void setearControlador() {
        vista.setControladorCliente(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        String accion = evento.getActionCommand();
        if(accion.equals(InterfazVista.INSERTAR_CLIENTE)){
            abrirFormulario(accion);
        } else if(accion.equals(vista.CONFIRMAR_INSERTAR_CLIENTE)){
            confirmarInsertarCliente();
        } else if(accion.equals(vista.CANCELAR_INSERTAR_CLIENTE)){
            cerrarFormulario();
        }
    }

    private void abrirFormulario(String accion) {
        if (accion.equals(vista.INSERTAR_CLIENTE)){
            ventanaCliente = new VentanaCliente(accion);
            ventanaCliente.setControlador(this);
            ventanaCliente.setActionCommand(vista.CONFIRMAR_INSERTAR_CLIENTE, vista.CANCELAR_INSERTAR_CLIENTE);
            setValoresDefecto("AUTOGENERADO", "");
            ventanaCliente.setVisible(true);
        }
    }

    private void setValoresDefecto(String codigo, String nombre) {
        ventanaCliente.setTextCodigo(codigo);
        ventanaCliente.setTextNombre(nombre);
    }

    private void cerrarFormulario(){
        ventanaCliente.dispose();
    }

    private void confirmarInsertarCliente() {
        // Se toman los datos ingresados
        String nombre = ventanaCliente.getTextNombre();
        // Chequeo validez de los datos y
        // Si se agrega cliente a BD la operacion es correcta
        if (validarCliente(vista.INSERTAR_CLIENTE, nombre)) {
            vista.operacionCorrecta("Cliente Agregado");
            cerrarFormulario();
        }
    }

    private boolean validarCliente(String operacion, String nombre){
        if( nombre == null || nombre.equals("")){
            vista.errorOperacion("El nombre no puede quedar vacío", operacion);
            return false;
        }return true;
    }
}