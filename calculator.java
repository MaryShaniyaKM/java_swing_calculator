import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;


public class calculator implements ActionListener {
    boolean isClicked = false;
    String oldValue, newValue;
    int click = 0;
    JFrame jf;
    JLabel DisplayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton addButton;
    JButton subButton;
    JButton mulButton;
    JButton divButton;
    JButton equalButton;
    JButton dotButton;
    JButton zeroButton;
    JButton clearButton;

    calculator() {
        jf = new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.getContentPane().setBackground(Color.PINK);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DisplayLabel = new JLabel();
        DisplayLabel.setBounds(65, 40, 450, 60);
        DisplayLabel.setFont(new Font("Serif", Font.PLAIN, 40));

        jf.add(DisplayLabel);
        DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayLabel.setBackground(Color.lightGray);
        DisplayLabel.setForeground(Color.BLACK);
        Border border = BorderFactory.createRaisedBevelBorder();
        DisplayLabel.setBorder(border);
        DisplayLabel.setOpaque(true);

        sevenButton = new JButton("7");
        sevenButton.setBounds(100, 130, 70, 60);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(200, 130, 70, 60);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(300, 130, 70, 60);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        divButton = new JButton("/");
        divButton.setBounds(400, 130, 70, 60);
        divButton.setFont(new Font("Arial", Font.PLAIN, 30));
        divButton.addActionListener(this);
        jf.add(divButton);


        fourButton = new JButton("4");
        fourButton.setBounds(100, 210, 70, 60);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(200, 210, 70, 60);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(300, 210, 70, 60);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        mulButton = new JButton("*");
        mulButton.setBounds(400, 210, 70, 60);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        oneButton = new JButton("1");
        oneButton.setBounds(100, 290, 70, 60);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(200, 290, 70, 60);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(300, 290, 70, 60);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        subButton = new JButton("-");
        subButton.setBounds(400, 290, 70, 60);
        subButton.setFont(new Font("Arial", Font.PLAIN, 30));
        subButton.addActionListener(this);
        jf.add(subButton);

        dotButton = new JButton(".");
        dotButton.setBounds(100, 370, 70, 60);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        clearButton = new JButton("C");
        clearButton.setBounds(100, 450, 70, 60);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(200, 370, 70, 60);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(300, 370, 70, 60);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        addButton = new JButton("+");
        addButton.setBounds(400, 370, 70, 60);
        addButton.setFont(new Font("Arial", Font.PLAIN, 30));
        addButton.addActionListener(this);
        jf.add(addButton);


    }

    public static void main(String[] args) {
        calculator c = new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (isClicked) {
                DisplayLabel.setText("7");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "7");
            }
        } else if (e.getSource() == eightButton) {
            if (isClicked) {
                DisplayLabel.setText("8");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if (isClicked) {
                DisplayLabel.setText("9");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "9");
            }
        } else if (e.getSource() == fourButton) {
            if (isClicked) {
                DisplayLabel.setText("4");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isClicked) {
                DisplayLabel.setText("5");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "5");
            }
        } else if (e.getSource() == sixButton) {
            if (isClicked) {
                DisplayLabel.setText("6");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "6");
            }
        } else if (e.getSource() == oneButton) {
            if (isClicked) {
                DisplayLabel.setText("1");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isClicked) {
                DisplayLabel.setText("2");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isClicked) {
                DisplayLabel.setText("3");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "3");
            }
        } else if (e.getSource() == zeroButton) {
            if (isClicked) {
                DisplayLabel.setText("0");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "0");
            }
        } else if (e.getSource() == clearButton) {
            DisplayLabel.setText("");
        } else if (e.getSource() == dotButton) {
            if (isClicked) {
                DisplayLabel.setText(".");
                isClicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + ".");
            }
        } else if (e.getSource() == divButton) {
            isClicked = true;
            click = 1;
            oldValue = DisplayLabel.getText();
        } else if (e.getSource() == mulButton) {
            isClicked = true;
            click = 2;
            oldValue = DisplayLabel.getText();
        } else if (e.getSource() == subButton) {
            isClicked = true;
            click = 3;
            oldValue = DisplayLabel.getText();
        } else if (e.getSource() == addButton) {
            isClicked = true;
            click = 4;
            oldValue = DisplayLabel.getText();
        } else if (e.getSource() == equalButton) {
            newValue = DisplayLabel.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            if (click == 1) {
                float result = oldValueF / newValueF;
                DisplayLabel.setText(result + "");
            }
            if (click == 2) {
                float result = oldValueF * newValueF;
                DisplayLabel.setText(result + "");
            }
            if (click == 3) {
                float result = oldValueF - newValueF;
                DisplayLabel.setText(result + "");
            }
            if (click == 4) {
                float result = oldValueF + newValueF;
                DisplayLabel.setText(result + "");
            }
        }
    }
}