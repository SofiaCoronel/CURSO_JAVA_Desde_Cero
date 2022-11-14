package Graficos.Ejemplos.CarritoCompras.vista;

import Graficos.Ejemplos.CarritoCompras.controlador.ControladorCarrito;
import Graficos.Ejemplos.CarritoCompras.controlador.ControladorCliente;
import Graficos.Ejemplos.CarritoCompras.controlador.ControladorProducto;

public class IniciarCarrito {
    public static void main(String[] args) {
        VistaConLayout v = new VistaConLayout();
        //VistaSinLayout v = new VistaSinLayout(); // VISTA ADICIONAL

        setControladores( (InterfazVista) v);
        v.setVisible(true);
    }

    private static void setControladores(InterfazVista v){
        ControladorProducto controladorProducto = new ControladorProducto(v);
        ControladorCliente controladorCliente = new ControladorCliente(v);
        ControladorCarrito controladorCarrito = new ControladorCarrito(v);
    }
}
