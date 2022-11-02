package Graficos.Eventos.MultiplesFuentes;

import javax.swing.*;

public class PruebaAcciones {
    public static void main(String[] args) {

        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class MarcoAccion extends JFrame{
    public MarcoAccion(){

        setTitle("Prueba acciones");
        setBounds(600,350,600,300);

        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}

class PanelAccion extends JPanel{

}