import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 700);
        jf.setLocation(300, 150);

        JLabel displayLabel=new JLabel("255551");
        displayLabel.setBounds(50, 20, 480, 90);
        jf.add(displayLabel);
        displayLabel.setFont(new Font("Arial",Font.BOLD,40) {
        });
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.GRAY);


        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(50, 130, 90, 90);
        sevenButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(sevenButton);
        sevenButton.setBackground(Color.GRAY);

        JButton eightButton=new JButton("8");
        eightButton.setBounds(180, 130, 90, 90);
        eightButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(eightButton);
        eightButton.setBackground(Color.GRAY);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(310, 130, 90, 90);
        nineButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(nineButton);
        nineButton.setBackground(Color.GRAY);

        JButton divitionButton=new JButton("/");
        divitionButton.setBounds(440, 130, 90, 90);
        divitionButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(divitionButton);
        divitionButton.setBackground(Color.GRAY);




        JButton fourButton=new JButton("4");
        fourButton.setBounds(50, 260, 90, 90);
        jf.add(fourButton);
        fourButton.setFont(new Font("Arial",Font.BOLD,30));
        fourButton.setBackground(Color.GRAY);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(180, 260, 90, 90);
        jf.add(fiveButton);
        fiveButton.setFont(new Font("Arial",Font.BOLD,30));
        fiveButton.setBackground(Color.GRAY);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(310, 260, 90, 90);
        jf.add(sixButton);
        sixButton.setFont(new Font("Arial",Font.BOLD,30));
        sixButton.setBackground(Color.GRAY);

        JButton multiplicationButton=new JButton("X");
        multiplicationButton.setBounds(440, 260, 90, 90);
        multiplicationButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(multiplicationButton);
        multiplicationButton.setBackground(Color.GRAY);





        JButton oneButton=new JButton("1");
        oneButton.setBounds(50, 390, 90, 90);
        oneButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(oneButton);
        oneButton.setBackground(Color.GRAY);

        JButton twoButton=new JButton("2");
        twoButton.setBounds(180, 390, 90, 90);
        twoButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(twoButton);
        twoButton.setBackground(Color.GRAY);

        JButton threeButton=new JButton("3");
        threeButton.setFont(new Font("Arial",Font.BOLD,30));
        threeButton.setBounds(310, 390, 90, 90);
        jf.add(threeButton);
        threeButton.setBackground(Color.GRAY);

        JButton substractionButton=new JButton("-");
        substractionButton.setBounds(440, 390, 90, 90);
        substractionButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(substractionButton);
        substractionButton.setBackground(Color.GRAY);





        JButton dotButton=new JButton(".");
        dotButton.setBounds(50, 520, 90, 90);
        jf.add(dotButton);
        dotButton.setFont(new Font("Arial",Font.BOLD,30));
        dotButton.setBackground(Color.GRAY);

        JButton zeroButton=new JButton("0");
        zeroButton.setBounds(180, 520, 90, 90);
        jf.add(zeroButton);
        zeroButton.setFont(new Font("Arial",Font.BOLD,30));
        zeroButton.setBackground(Color.GRAY);

        JButton plusButton=new JButton("+");
        plusButton.setBounds(310, 520, 90, 90);
        jf.add(plusButton);
        plusButton.setFont(new Font("Arial",Font.BOLD,30));
        plusButton.setBackground(Color.GRAY);

        JButton equalButton=new JButton("=");
        equalButton.setBounds(440, 520, 90, 90);
        jf.add(equalButton);
        equalButton.setFont(new Font("Arial",Font.BOLD,30));
        equalButton.setBackground(Color.GRAY);




        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }

    public static void main(String[] args) {
        new Calculator();
    }
    
}
