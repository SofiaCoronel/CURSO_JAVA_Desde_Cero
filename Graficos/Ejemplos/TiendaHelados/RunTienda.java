package Graficos.Ejemplos.TiendaHelados;

import javax.swing.JFrame;

public class RunTienda {
    public static void main(final String[] theArgs) {
            final JFrame frame = new FrameTiendaHelados();
            frame.setTitle("Crea tu HELADO");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

    }
}