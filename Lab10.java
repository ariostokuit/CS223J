import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class Lab10 extends JFrame implements ActionListener{
    final int FRAME_WIDTH = 350;
    final int FRAME_HEIGHT = 200;
    JLabel heading,result;

    JTextField numField, numField2; //for num1 and num2
    JButton button1;//multiplication
    JButton button2; // subtraction
    JButton button3; //division
    JButton button4; //addition
    JLabel spacing;
    JLabel spacing2;

    public Lab10(){
        super("Calculator");
        heading = new JLabel("Calculator Application");
        result = new JLabel();
        numField = new JTextField(7);
        numField2 = new JTextField(7);
        button1 = new JButton(" x ");
        button2 = new JButton(" - ");
        button3 = new JButton(" / ");
        button4 = new JButton(" + ");
        spacing = new JLabel ("      ");
        spacing2 = new JLabel ("     ");

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        heading.setFont(new Font("Arial", Font.BOLD,25));
        numField.setFont(new Font("Arial", Font.BOLD,20));
        numField2.setFont(new Font("Arial", Font.BOLD,20));
        result.setFont(new Font("Arial", Font.BOLD,20));

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        numField.addActionListener(this);
        numField2.addActionListener(this);

        numField.setToolTipText("Press Enter for pow 2");
        numField2.setToolTipText("Press Enter for sqrt");

        setLayout(new FlowLayout());
        add(heading);
        add(numField);
        add(numField2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(spacing);
        add(spacing2);
        add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        String RightNum, LeftNum;
        double answer, num1, num2;

        try{
            LeftNum = numField.getText();
            num1 = Double.parseDouble(LeftNum);
        }
        catch(Exception ex){ num1 =0.0;}
        try{
            RightNum = numField2.getText();
            num2 = Double.parseDouble(RightNum);
        }
        catch(Exception ex){num2 = 0.0;}//set the number to zero

        if(source == button1){
            answer = num1 * num2;
            result.setText("" + answer); //set results for multiplication
        }
        else if(source == button2){
            answer = num1 - num2;
            result.setText("" + answer); //set the results for power
        }
        else if(source == button3){
            answer = num1/num2;
            result.setText("" + answer);//set for division
        }
        else if(source == button4){
            answer = num1 + num2;
            result.setText("" + answer);//set for addition
        }
        else if(source == numField){
            answer = Math.pow(num1,2);
            result.setText("" + answer);//set the results for power
        }
        else if(source == numField2){
            answer = Math.sqrt(num2);
            result.setText("" + answer); //set the results for square root
        }
    }
}