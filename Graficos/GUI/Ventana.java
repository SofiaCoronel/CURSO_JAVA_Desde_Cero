package Graficos.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JPanel panel1;
    private JTextField Usuario;
    private JTextField textField1;
    private JButton Ingresar;
    private JButton salirButton;
    private JMenuBar menubar;
    private JMenu archivo;
    private JMenuItem salir;

    public Ventana(){

        super("Ejemplo GUI");

        setContentPane(panel1);

        menubar = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");

        menubar.add(archivo);
        archivo.add(salir);

        setJMenuBar(menubar);
        Ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bienvenido a Swing");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}
