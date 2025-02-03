import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {


    // Here [ JFrame jf ] is globel
    JFrame jf;

    JLabel displayLabel;
    JButton squareButton;
    JButton CEButton;
    JButton CButton;
    JButton clearButton;

    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton divitionButton;


    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton multiplicationButton;
    

    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton substractionButton;

    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton plusButton;


    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 800);
        jf.setLocation(300, 150);

        displayLabel=new JLabel();
        displayLabel.setBounds(50, 20, 480, 90);
        jf.add(displayLabel);
        displayLabel.setFont(new Font("Arial",Font.BOLD,40) {
        });
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.GRAY);





        squareButton = new JButton("x²");
        squareButton.addActionListener(this);
        squareButton.setBounds(50, 130, 90, 90);
        squareButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(squareButton);
        squareButton.setBackground(Color.GRAY);

        CEButton=new JButton("CE");
        CEButton.addActionListener(this);
        CEButton.setBounds(180, 130, 90, 90);
        CEButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(CEButton);
        CEButton.setBackground(Color.GRAY);

        CButton=new JButton("C");
        CButton.addActionListener(this);
        CButton.setBounds(310, 130, 90, 90);
        CButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(CButton);
        CButton.setBackground(Color.GRAY);

        clearButton=new JButton("<-");
        clearButton.setBounds(440, 130, 90, 90);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(clearButton);
        clearButton.setBackground(Color.GRAY);








        sevenButton=new JButton("7");
        sevenButton.addActionListener(this);
        sevenButton.setBounds(50, 260, 90, 90);
        sevenButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(sevenButton);
        sevenButton.setBackground(Color.GRAY);

        eightButton=new JButton("8");
        eightButton.addActionListener(this);
        eightButton.setBounds(180, 260, 90, 90);
        eightButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(eightButton);
        eightButton.setBackground(Color.GRAY);

        nineButton=new JButton("9");
        nineButton.addActionListener(this);
        nineButton.setBounds(310, 260, 90, 90);
        nineButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(nineButton);
        nineButton.setBackground(Color.GRAY);

        divitionButton=new JButton("/");
        divitionButton.setBounds(440, 260, 90, 90);
        divitionButton.addActionListener(this);
        divitionButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(divitionButton);
        divitionButton.setBackground(Color.GRAY);







        fourButton=new JButton("4");
        fourButton.setBounds(50, 390, 90, 90);
        jf.add(fourButton);
        fourButton.setFont(new Font("Arial",Font.BOLD,30));
        fourButton.setBackground(Color.GRAY);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(180, 390, 90, 90);
        jf.add(fiveButton);
        fiveButton.setFont(new Font("Arial",Font.BOLD,30));
        fiveButton.setBackground(Color.GRAY);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(310, 390, 90, 90);
        jf.add(sixButton);
        sixButton.setFont(new Font("Arial",Font.BOLD,30));
        sixButton.setBackground(Color.GRAY);
        sixButton.addActionListener(this);

        multiplicationButton=new JButton("X");
        multiplicationButton.addActionListener(this);
        multiplicationButton.setBounds(440, 390, 90, 90);
        multiplicationButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(multiplicationButton);
        multiplicationButton.setBackground(Color.GRAY);









        oneButton=new JButton("1");
        oneButton.setBounds(50, 520, 90, 90);
        oneButton.setFont(new Font("Arial",Font.BOLD,30));
        oneButton.addActionListener(this);
        jf.add(oneButton);
        oneButton.setBackground(Color.GRAY);

        twoButton=new JButton("2");
        twoButton.setBounds(180, 520, 90, 90);
        twoButton.setFont(new Font("Arial",Font.BOLD,30));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        twoButton.setBackground(Color.GRAY);

        threeButton=new JButton("3");
        threeButton.setFont(new Font("Arial",Font.BOLD,30));
        threeButton.setBounds(310, 520, 90, 90);
        jf.add(threeButton);
        threeButton.setBackground(Color.GRAY);
        threeButton.addActionListener(this);

        substractionButton=new JButton("-");
        substractionButton.setBounds(440, 520, 90, 90);
        substractionButton.setFont(new Font("Arial",Font.BOLD,30));
        substractionButton.addActionListener(this);
        jf.add(substractionButton);
        substractionButton.setBackground(Color.GRAY);





        dotButton=new JButton(".");
        dotButton.setBounds(50, 650, 90, 90);
        jf.add(dotButton);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial",Font.BOLD,30));
        dotButton.setBackground(Color.GRAY);

        zeroButton=new JButton("0");
        zeroButton.setBounds(180, 650, 90, 90);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        zeroButton.setFont(new Font("Arial",Font.BOLD,30));
        zeroButton.setBackground(Color.GRAY);

        plusButton=new JButton("+");
        plusButton.setBounds(310, 650, 90, 90);
        jf.add(plusButton);
        plusButton.addActionListener(this);
        plusButton.setFont(new Font("Arial",Font.BOLD,30));
        plusButton.setBackground(Color.GRAY);

        equalButton=new JButton("=");
        equalButton.setBounds(440, 650, 90, 90);
        jf.add(equalButton);
        equalButton.setFont(new Font("Arial",Font.BOLD,30));
        equalButton.setBackground(Color.GRAY);
        equalButton.addActionListener(this);




        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String buttonText = ((JButton) e.getSource()).getText();
        switch (buttonText) {
            case "7":
            case "8":
            case "9":
            case "4":
            case "5":
            case "6":
            case "1":
            case "2":
            case "3":
            case "0":
            case ".":
                displayLabel.setText(displayLabel.getText() + buttonText);
                break;
            case "/":
                displayLabel.setText(displayLabel.getText() + buttonText);
                break;
            case "X":
            case "-":
            case "+":
                displayLabel.setText(displayLabel.getText() + buttonText);
                break;
            case "=":
                String Result = Calcular(displayLabel.getText());
                displayLabel.setText(Result);
                break;
            case "x²":
                String currentText = displayLabel.getText();
                if (!currentText.isEmpty()) {
                    double number = Double.parseDouble(currentText);
                    double squared = number * number;
                    displayLabel.setText(String.valueOf(squared));
                }
                break;
            case "CE":
            case "C":
            case "<-":
                displayLabel.setText("");
                break;
        }
    }
    private String Calcular(String calculo){
        int result = 0;
        if(calculo.contains("/")){
            String[] parts = calculo.split("/");

            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);

            result = numerator / denominator;

            return String.valueOf(result);
        }
        if(calculo.contains("-")){
            String[] parts = calculo.split("-");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            result = numerator - denominator;
        }
        if(calculo.contains("X")){
            String[] parts = calculo.split("X");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            result = numerator * denominator;
        }
        if(calculo.contains("+")){
            String[] parts = calculo.split("\\+");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            result = numerator + denominator;
        }
        return String.valueOf(result);
    }
}