package Graficos.Eventos.ClasesAdaptadoras;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Eventos_Ventana {
    public static void main(String[] args) {

        MarcoVentana mimarco = new MarcoVentana();
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(100,300,500,350);
        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        MarcoVentana mimarco2 = new MarcoVentana();
        mimarco2.setTitle("Ventana 2");
        mimarco2.setBounds(600,300,500,350);
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){

        setVisible(true);

        // MiVentana oyente_ventana = new MiVentana();
        // addWindowListener(oyente_ventana);

        addWindowListener(new MiVentana());
    }
}

class MiVentana extends WindowAdapter {     // heredamos de WindowAdapter

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

}
