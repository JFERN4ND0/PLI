import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Juego extends JFrame implements ActionListener {

    private JButton opc1, opc2, opc3, opc4;
    private JLabel pregunta;
    private String color;
    private int puntaje = 0, intentos = 10;

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

        opc4 = new JButton();
        opc4.setBounds(250, 250, 250, 250);
        opc4.setBackground(new Color(250, 250, 0));
        opc4.addActionListener(this);
        add(opc4);

        color = scolor();

        pregunta = new JLabel("Selecciona el color " + color);
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
            if(color.equals("Rojo")) {
            	JOptionPane.showMessageDialog(null,"Correcto");
            	puntaje++;
            	
            }
        } else if(e.getSource() == opc2){
        	if (color.equals("Verde")) {
        		JOptionPane.showMessageDialog(null,"Correcto");
        		puntaje++;
        		
        	}
        } else if(e.getSource() == opc3){
        	if (color.equals("Azul")) {
        		JOptionPane.showMessageDialog(null,"Correcto");
        		puntaje++;
        		
        	}
        } else if(e.getSource() == opc4){
        	if (color.equals("Amarillo")) {
        		JOptionPane.showMessageDialog(null,"Correcto");
        		puntaje++;
        		
        	}
        }
        intentos--;
        this.setVisible(false);

        if(intentos >= 0) {
        	Juego v1 = new Juego();
        	v1.setBounds(0, 0, 500, 500);
        	v1.setVisible(true);
        	v1.setResizable(true);
        } else JOptionPane.showMessageDialog(null,"tu puntuacion es: " + puntaje);
    }

    public static void main(String[] args) {
        Juego v1 = new Juego();
        v1.setBounds(0, 0, 500, 500);
        v1.setVisible(true);
        v1.setResizable(true);
    }
}