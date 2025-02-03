import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        JLabel displayLabel=new JLabel("hello this is a calculator");
        displayLabel.setBounds(30, 50, 540, 40);
        jf.add(displayLabel);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.GRAY);


        



        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }

    public static void main(String[] args) {
        new Calculator();
    }
    
}
