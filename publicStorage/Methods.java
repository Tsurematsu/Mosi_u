package publicStorage;

import java.awt.Color;

import javax.swing.JFrame;

public class Methods {
    public static ventana ventana;
    public static class ventana extends JFrame{
        public ventana(){
            this.getContentPane().setBackground(Color.white);
            setSize(500,500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Ventana principal");
            setVisible(true);
            // setBounds(100,100,500,500);
        }
    }
}
