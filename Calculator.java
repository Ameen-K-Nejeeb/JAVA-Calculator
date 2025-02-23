import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {

    double firstnumber;
    double secondnumber,result;
    String operator;

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
        displayLabel.setBounds(50, 30, 480, 130);
        jf.add(displayLabel);
        displayLabel.setFont(new Font("Arial",Font.BOLD,40) {
        });
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.black);
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.LIGHT_GRAY);





        squareButton = new JButton("x²");
        squareButton.addActionListener(this);
        squareButton.setBounds(50, 190, 90, 90);
        squareButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(squareButton);
        squareButton.setBackground(Color.GRAY);

        CEButton=new JButton("CE");
        CEButton.addActionListener(this);
        CEButton.setBounds(180, 190, 90, 90);
        CEButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(CEButton);
        CEButton.setBackground(Color.GRAY);

        CButton=new JButton("C");
        CButton.addActionListener(this);
        CButton.setBounds(310, 190, 90, 90);
        CButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(CButton);
        CButton.setBackground(Color.GRAY);

        clearButton=new JButton("<-");
        clearButton.setBounds(440, 190, 90, 90);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(clearButton);
        clearButton.setBackground(Color.GRAY);








        sevenButton=new JButton("7");
        sevenButton.addActionListener(this);
        sevenButton.setBounds(50, 320, 90, 90);
        sevenButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(sevenButton);
        sevenButton.setBackground(Color.lightGray);

        eightButton=new JButton("8");
        eightButton.addActionListener(this);
        eightButton.setBounds(180, 320, 90, 90);
        eightButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(eightButton);
        eightButton.setBackground(Color.LIGHT_GRAY);

        nineButton=new JButton("9");
        nineButton.addActionListener(this);
        nineButton.setBounds(310, 320, 90, 90);
        nineButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(nineButton);
        nineButton.setBackground(Color.lightGray);

        divitionButton=new JButton("/");
        divitionButton.setBounds(440, 320, 90, 90);
        divitionButton.addActionListener(this);
        divitionButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(divitionButton);
        divitionButton.setBackground(Color.GRAY);







        fourButton=new JButton("4");
        fourButton.setBounds(50, 430, 90, 90);
        jf.add(fourButton);
        fourButton.setFont(new Font("Arial",Font.BOLD,30));
        fourButton.setBackground(Color.lightGray);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(180, 430, 90, 90);
        jf.add(fiveButton);
        fiveButton.setFont(new Font("Arial",Font.BOLD,30));
        fiveButton.setBackground(Color.lightGray);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(310, 430, 90, 90);
        jf.add(sixButton);
        sixButton.setFont(new Font("Arial",Font.BOLD,30));
        sixButton.setBackground(Color.lightGray);
        sixButton.addActionListener(this);

        multiplicationButton=new JButton("X");
        multiplicationButton.addActionListener(this);
        multiplicationButton.setBounds(440, 430, 90, 90);
        multiplicationButton.setFont(new Font("Arial",Font.BOLD,30));
        jf.add(multiplicationButton);
        multiplicationButton.setBackground(Color.GRAY);









        oneButton=new JButton("1");
        oneButton.setBounds(50, 540, 90, 90);
        oneButton.setFont(new Font("Arial",Font.BOLD,30));
        oneButton.addActionListener(this);
        jf.add(oneButton);
        oneButton.setBackground(Color.lightGray);

        twoButton=new JButton("2");
        twoButton.setBounds(180, 540, 90, 90);
        twoButton.setFont(new Font("Arial",Font.BOLD,30));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        twoButton.setBackground(Color.lightGray);

        threeButton=new JButton("3");
        threeButton.setFont(new Font("Arial",Font.BOLD,30));
        threeButton.setBounds(310, 540, 90, 90);
        jf.add(threeButton);
        threeButton.setBackground(Color.lightGray);
        threeButton.addActionListener(this);

        substractionButton=new JButton("-");
        substractionButton.setBounds(440, 540, 90, 90);
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
        zeroButton.setBackground(Color.lightGray);

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
        equalButton.setBackground(Color.gray);
        equalButton.addActionListener(this);




        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sevenButton){
            displayLabel.setText(displayLabel.getText()+"7");
        }else if(e.getSource() == eightButton){
            displayLabel.setText(displayLabel.getText()+"8");
        }else if(e.getSource() == nineButton){
            displayLabel.setText(displayLabel.getText()+"9");


        }else if(e.getSource() == fourButton){
            displayLabel.setText(displayLabel.getText()+"4");
        }else if(e.getSource() == fiveButton){
            displayLabel.setText(displayLabel.getText()+"5");
        }else if(e.getSource() == sixButton){
            displayLabel.setText(displayLabel.getText()+"6");
        

        }else if(e.getSource() == oneButton){
            displayLabel.setText(displayLabel.getText()+"1");
        }else if(e.getSource() == twoButton){
            displayLabel.setText(displayLabel.getText()+"2");
        }else if(e.getSource() == threeButton){
            displayLabel.setText(displayLabel.getText()+"3");
        

        
        }else if(e.getSource() == dotButton){
            if(!displayLabel.getText().contains(".")){
                displayLabel.setText(displayLabel.getText()+".");
            }

        }else if(e.getSource() == zeroButton){
            displayLabel.setText(displayLabel.getText()+"0");

        }else if(e.getSource() == CEButton){
            displayLabel.setText("");
        }else if(e.getSource() == CButton){
            displayLabel.setText("");
        }else if(e.getSource() == clearButton){
            displayLabel.setText("");
        }


        else if(e.getSource() == divitionButton){
            firstnumber = Double.parseDouble(displayLabel.getText());
            operator = "/";
            displayLabel.setText("");
        }else if (e.getSource() == multiplicationButton){
            firstnumber = Double.parseDouble(displayLabel.getText());
            operator = "x";
            displayLabel.setText("");
        }else if (e.getSource() == substractionButton){
            firstnumber = Double.parseDouble(displayLabel.getText());
            operator = "-";
            displayLabel.setText("");
        }else if (e.getSource() == plusButton){
            firstnumber = Double.parseDouble(displayLabel.getText());
            operator = "+";
            displayLabel.setText("");
        }else if (e.getSource() == squareButton){
            firstnumber = Double.parseDouble(displayLabel.getText());
            displayLabel.setText("");
            result  = firstnumber*firstnumber;
            displayLabel.setText(String.valueOf(result));
        }
        else if (e.getSource() == equalButton){
            secondnumber = Double.parseDouble(displayLabel.getText());
            switch(operator){
                case "+":
                    result = firstnumber + secondnumber;
                    break;
                case "-":
                    result = firstnumber - secondnumber;
                    break;
                case "x":
                    result = firstnumber * secondnumber;
                    break;
                case "/":
                    if(secondnumber == 0){
                        displayLabel.setText("---error---");
                        return;
                    } else {
                        result = firstnumber / secondnumber;
                    }
                    break;
                
                    
            }
            firstnumber = result;
            displayLabel.setText(String.valueOf(result));
        }
    }
}