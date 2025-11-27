
/**
 * Author: Bhagat Sabari Nath
 * Date: Nov 25, 2025
 * Creating a Cashier Application
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exercise4 extends JPanel implements ActionListener
{
    //instance variable
    static Scanner sc=new Scanner(System.in);
    JLabel item;
    JTextField t1;
    JLabel unitPrice;
    JTextField t2;
    JLabel quantity;
    JTextField t3;
    JButton cost;
    JTextField t4;
    JFrame frame;
    //constructor
    public Lesson6(){
        item = new JLabel("Item");
        t1 = new JTextField();
        unitPrice = new JLabel("Unit Price");
        t2 = new JTextField();
        quantity = new JLabel("Quantity");
        t3 = new JTextField();
        cost = new JButton("Cost");
        t4 = new JTextField();
        
        
        frame = new JFrame("Welcome to our Store!");
        frame.setLayout(null);
        //positioning the components on the JFrame
        item.setBounds(50,50,100,20);
        t1.setBounds(200,50,100,20);
        unitPrice.setBounds(50,100,100,20);
        t2.setBounds(200,100,100,20);
        quantity.setBounds(50,150,100,20);
        t3.setBounds(200,150,100,20);
        cost.setBounds(50,200,100,20);
        t4.setBounds(200,200,100,20);
        //adding the components to the JFrame
        frame.add(item);
        frame.add(t1);
        frame.add(unitPrice);
        frame.add(t2);
        frame.add(quantity);
        frame.add(t3);
        frame.add(cost);
        frame.add(t4);
        //creating the JFrame size
        frame.setSize(350,400);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setVisible(true);
        //adding the components to the ActionListener
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        cost.addActionListener(this);
    }
    public static void main(String[]args){
        new Lesson6();
    }
    public void actionPerformed(ActionEvent e){
        double p=Double.parseDouble(t2.getText());//p stands for unit price 
        double q=Double.parseDouble(t3.getText());//q stands for quantity
        double total = p*q;
        // t4.setText(String.valueOf(total));
        t4.setText(String.format("%.2f",total));
    }
}
