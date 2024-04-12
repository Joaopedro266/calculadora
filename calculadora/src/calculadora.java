import javax.swing.*;
import java.awt.*;

public class calculadora  extends JFrame{
    public calculadora(){

        setTitle("calculadora");
        setVisible(true);
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

    }
}
