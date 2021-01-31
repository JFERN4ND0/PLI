import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Juego extends JFrame implements ActionListener {

    private JButton opc1, opc2, opc3, opc4;
    private JLabel pregunta;
    private String color;

    public Juego() {
        setLayout(new GridLayout(3,2));
        setTitle("Proyecto LI");
        //getContentPane().setBackground(new Color(0, 0, 0));

        opc1 = new JButton();
        opc1.setBounds(0, 0, 250, 250);
        opc1.setBackground(new Color(255, 0, 0));
        opc1.addActionListener(this);
        add(opc1);

        opc2 = new JButton();
        opc2.setBounds(250, 0, 250, 250);
        opc2.setBackground(new Color(0, 255, 0));
        opc2.addActionListener(this);
        add(opc2);

        opc3 = new JButton();
        opc3.setBounds(0, 250, 250, 250);
        opc3.setBackground(new Color(0, 0, 255));
        opc3.addActionListener(this);
        add(opc3);

        opc4 = new JButton("");
        opc4.setBounds(250, 250, 250, 250);
        opc4.setBackground(new Color(250, 250, 0));
        opc4.addActionListener(this);
        add(opc4);

        color = "Selecciona el color " + scolor();

        pregunta = new JLabel(color, Label.RIGHT);
        pregunta.setFont(new Font("Andale Mono", 3, 20));
        pregunta.setForeground(new Color(0, 0, 0));
        add(pregunta);
    }

    public String scolor() {
        int c = (int)(Math.random() * 4) + 1;

        switch(c) {
            case 1: return "Rojo";

            case 2: return "Verde";

            case 3: return "Azul";

            case 4: return "Amarillo";
        }
        
        return "";
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == opc1){
            JOptionPane.showMessageDialog(null, "Debes Ingresar tu nombre");
        }
    }

    public static void jugar(){
        Juego v2 = new Juego();
        v2.setBounds(0, 0, 500, 500);
        v2.setVisible(true);
        v2.setResizable(false);
    }

    public static void main(String[] args) {
        Juego v1 = new Juego();
        v1.setBounds(0, 0, 500, 500);
        v1.setVisible(true);
        v1.setResizable(true);
    }
}