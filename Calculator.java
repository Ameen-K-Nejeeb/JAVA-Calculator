import javax.swing.JFrame;
import javax.swing.JLabel;


public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        JLabel displayLabel=new JLabel("hello world");
        displayLabel.setBounds(30, 50, 540, 40);

        jf.add(displayLabel);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
    
}
