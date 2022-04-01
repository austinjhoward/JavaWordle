/** 
 * My first Java program
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;


public class Driver
{

   public static void main(String []args)
   {
      	JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JTextField textField = new JTextField("Hello world!");
       textField.setBounds(50, 100, 200, 30);
       frame.add(textField);
       frame.setLayout(null);
       frame.setVisible(true);
   }
}
