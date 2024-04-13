import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora  extends JFrame {

    private JTextField display;

    public calculadora(){

        setTitle("calculadora");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        display = new JTextField();
        display.setBounds(10, 30, 350, 80);
        display.setBackground(new Color(71, 68, 68, 255));
        display.setForeground(new Color(255, 255, 255, 255));
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        display.setEditable(false);
        add(display);

        JButton numero0 = new JButton( "0");
        numero0.setBounds(100,440,80,80);
        numero0.setBackground(new Color(71, 68, 68, 255));
        numero0.setForeground(new Color(255, 255, 255, 255));
        numero0.setFont(new Font("Arial", Font.PLAIN, 20));
        numero0.setHorizontalAlignment(JTextField.CENTER);
        numero0.addActionListener(e -> display.setText(display.getText() + "0"));
        add(numero0);

        JButton numero1 = new JButton( "1");
        numero1.setBounds(10,350,80,80);
        numero1.setBackground(new Color(71, 68, 68, 255));
        numero1.setForeground(new Color(255, 255, 255, 255));
        numero1.setFont(new Font("Arial", Font.PLAIN, 20));
        numero1.setHorizontalAlignment(JTextField.CENTER);
        numero1.addActionListener(e -> display.setText(display.getText() + "1"));
        add(numero1);

        JButton numero2 = new JButton( "2");
        numero2.setBounds(100,350,80,80);
        numero2.setBackground(new Color(71, 68, 68, 255));
        numero2.setForeground(new Color(255, 255, 255, 255));
        numero2.setFont(new Font("Arial", Font.PLAIN, 20));
        numero2.setHorizontalAlignment(JTextField.CENTER);
        numero2.addActionListener(e -> display.setText(display.getText() + "2"));
        add(numero2);

        JButton numero3 = new JButton( "3");
        numero3.setBounds(190,350,80,80);
        numero3.setBackground(new Color(71, 68, 68, 255));
        numero3.setForeground(new Color(255, 255, 255, 255));
        numero3.setFont(new Font("Arial", Font.PLAIN, 20));
        numero3.setHorizontalAlignment(JTextField.CENTER);
        numero3.addActionListener(e -> display.setText(display.getText() + "3"));
        add(numero3);

        JButton numero4 = new JButton( "4");
        numero4.setBounds(10,260,80,80);
        numero4.setBackground(new Color(71, 68, 68, 255));
        numero4.setForeground(new Color(255, 255, 255, 255));
        numero4.setFont(new Font("Arial", Font.PLAIN, 20));
        numero4.setHorizontalAlignment(JTextField.CENTER);
        numero4.addActionListener(e -> display.setText(display.getText() + "4"));
        add(numero4);

        JButton numero5 = new JButton( "5");
        numero5.setBounds(100,260,80,80);
        numero5.setBackground(new Color(71, 68, 68, 255));
        numero5.setForeground(new Color(255, 255, 255, 255));
        numero5.setFont(new Font("Arial", Font.PLAIN, 20));
        numero5.setHorizontalAlignment(JTextField.CENTER);
        numero5.addActionListener(e -> display.setText(display.getText() + "5"));
        add(numero5);

        JButton numero6 = new JButton( "6");
        numero6.setBounds(190,260,80,80);
        numero6.setBackground(new Color(71, 68, 68, 255));
        numero6.setForeground(new Color(255, 255, 255, 255));
        numero6.setFont(new Font("Arial", Font.PLAIN, 20));
        numero6.setHorizontalAlignment(JTextField.CENTER);
        numero6.addActionListener(e -> display.setText(display.getText() + "6"));
        add(numero6);

        JButton numero7 = new JButton( "7");
        numero7.setBounds(10, 170,80,80);
        numero7.setBackground(new Color(71, 68, 68, 255));
        numero7.setForeground(new Color(255, 255, 255, 255));
        numero7.setFont(new Font("Arial", Font.PLAIN, 20));
        numero7.setHorizontalAlignment(JTextField.CENTER);
        numero7.addActionListener(e -> display.setText(display.getText() + "7"));
        add(numero7);

        JButton numero8 = new JButton( "8");
        numero8.setBounds(100, 170,80,80);
        numero8.setBackground(new Color(71, 68, 68, 255));
        numero8.setForeground(new Color(255, 255, 255, 255));
        numero8.setFont(new Font("Arial", Font.PLAIN, 20));
        numero8.setHorizontalAlignment(JTextField.CENTER);
        numero8.addActionListener(e -> display.setText(display.getText() + "8"));
        add(numero8);

        JButton numero9 = new JButton( "9");
        numero9.setBounds(190,170,80,80);
        numero9.setBackground(new Color(71, 68, 68, 255));
        numero9.setForeground(new Color(255, 255, 255, 255));
        numero9.setFont(new Font("Arial", Font.PLAIN, 20));
        numero9.setHorizontalAlignment(JTextField.CENTER);
        numero9.addActionListener(e -> display.setText(display.getText() + "9"));
        add(numero9);

        JButton mais = new JButton( "+");
        mais.setBounds(280,170,80,80);
        mais.setBackground(new Color(71, 68, 68, 255));
        mais.setForeground(new Color(255, 255, 255, 255));
        mais.setFont(new Font("Arial", Font.PLAIN, 20));
        mais.setHorizontalAlignment(JTextField.CENTER);
        mais.addActionListener(e -> display.setText(display.getText() + "+"));
        add(mais);

        JButton menos = new JButton( "-");
        menos.setBounds(280,260,80,80);
        menos.setBackground(new Color(71, 68, 68, 255));
        menos.setForeground(new Color(255, 255, 255, 255));
        menos.setFont(new Font("Arial", Font.PLAIN, 20));
        menos.setHorizontalAlignment(JTextField.CENTER);
        menos.addActionListener(e -> display.setText(display.getText() + "-"));
        add(menos);

        JButton vezes = new JButton( "x");
        vezes.setBounds(280,350,80,80);
        vezes.setBackground(new Color(71, 68, 68, 255));
        vezes.setForeground(new Color(255, 255, 255, 255));
        vezes.setFont(new Font("Arial", Font.PLAIN, 20));
        vezes.setHorizontalAlignment(JTextField.CENTER);
        vezes.addActionListener(e -> display.setText(display.getText() + "x"));
        add(vezes);

        JButton dividido = new JButton( "/");
        dividido.setBounds(280,440,80,80);
        dividido.setBackground(new Color(71, 68, 68, 255));
        dividido.setForeground(new Color(255, 255, 255, 255));
        dividido.setFont(new Font("Arial", Font.PLAIN, 20));
        dividido.setHorizontalAlignment(JTextField.CENTER);
        dividido.addActionListener(e -> display.setText(display.getText() + "/"));
        add(dividido);

        JButton igual = new JButton( "=");
        igual.setBounds(190,440,80,80);
        igual.setBackground(new Color(71, 68, 68, 255));
        igual.setForeground(new Color(255, 255, 255, 255));
        igual.setFont(new Font("Arial", Font.PLAIN, 20));
        igual.setHorizontalAlignment(JTextField.CENTER);
        add(igual);

        JButton deletar = new JButton( "DEL");
        deletar.setBounds(10,440,80,80);
        deletar.setBackground(new Color(71, 68, 68, 255));
        deletar.setForeground(new Color(255, 255, 255, 255));
        deletar.setFont(new Font("Arial", Font.PLAIN, 20));
        deletar.setHorizontalAlignment(JTextField.CENTER);
        deletar.addActionListener(e -> display.setText(""));
        add(deletar);

        igual.addActionListener(this::calcular);

        setVisible(true);
    }

    public void calcular(ActionEvent actionEvent) {
        String text = display.getText().replaceAll("\\s+", "");
        String[] tokens = text.split("(?=[-+*/])|(?<=[-+*/])");
        double num1 = Double.parseDouble(tokens[0]);
        double num2;
        String operador = "+";
        for (int i = 1; i < tokens.length; i++) { 
            if (i % 2 == 1) {
                operador = tokens[i];
            } else {
                num2 = Double.parseDouble(tokens[i]);
                switch (operador) {
                    case "+":
                        num1 += num2;
                        break;
                    case "-":
                        num1 -= num2;
                        break;
                    case "*":
                        num1 *= num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(this, "Nao se divide por 0!");
                            return;
                        }
                        num1 /= num2;
                        break;
                }
            }
        }
        display.setText(String.valueOf(num1));
    }
}
