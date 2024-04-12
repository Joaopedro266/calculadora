import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora  extends JFrame {
    public calculadora(){

        setTitle("calculadora");
        setSize(350,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton JButton = new JButton( "texto");
        JButton.setBounds(120,400,100,100);
        JButton.setBackground(new Color(71, 68, 68, 255));
        JButton.setForeground(new Color(255, 255, 255, 255));
        add(JButton);

        JButton.addActionListener(this::botao1);

        JTextField number = new JTextField("numeros");
        number.setBounds(95,200,150,100);
        number.setBackground(new Color(71, 68, 68, 255));
        number.setForeground(new Color(255, 255, 255, 255));
        add(number);

        setVisible(true);
    }

    public void botao1 (ActionEvent actionEvent){

    }

}
