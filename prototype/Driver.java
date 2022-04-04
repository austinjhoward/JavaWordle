/** 
 * My first Java program
 */
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.io.*;
import java.lang.String;


public class Driver
{

   public static void main(String []args)
   {
      	JFrame frame = new JFrame("Wordle");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,800);

       JPanel newPanel = new JPanel();
       newPanel.setLayout(new GridLayout(7,5,2,2));
       Border border = LineBorder.createGrayLineBorder();
       JLabel L1 = new JLabel(" ");
       L1.setBorder(border);
       newPanel.add(L1);
       JLabel L2 = new JLabel(" ");
       L2.setBorder(border);
       newPanel.add(L2);
       JLabel L3 = new JLabel(" ");
       L3.setBorder(border);
       newPanel.add(L3);
       JLabel L4 = new JLabel(" ");
       L4.setBorder(border);
       newPanel.add(L4);
       JLabel L5 = new JLabel(" ");
       L5.setBorder(border);
       newPanel.add(L5);
       JLabel L6 = new JLabel(" ");
       L6.setBorder(border);
       newPanel.add(L6);
       JLabel L7 = new JLabel(" ");
       L7.setBorder(border);
       newPanel.add(L7);
       JLabel L8 = new JLabel(" ");
       L8.setBorder(border);
       newPanel.add(L8);
       JLabel L9 = new JLabel(" ");
       L9.setBorder(border);
       newPanel.add(L9);
       JLabel L10 = new JLabel(" ");
       L10.setBorder(border);
       newPanel.add(L10);
       JLabel L11 = new JLabel(" ");
       L11.setBorder(border);
       newPanel.add(L11);
       JLabel L12 = new JLabel(" ");
       L12.setBorder(border);
       newPanel.add(L12);
       JLabel L13 = new JLabel(" ");
       L13.setBorder(border);
       newPanel.add(L13);
       JLabel L14 = new JLabel(" ");
       L14.setBorder(border);
       newPanel.add(L14);
       JLabel L15 = new JLabel(" ");
       L15.setBorder(border);
       newPanel.add(L15);
       JLabel L16 = new JLabel(" ");
       L16.setBorder(border);
       newPanel.add(L16);
       JLabel L21 = new JLabel(" ");
       L21.setBorder(border);
       newPanel.add(L21);
       JLabel L22 = new JLabel(" ");
       L22.setBorder(border);
       newPanel.add(L22);
       JLabel L23 = new JLabel(" ");
       L23.setBorder(border);
       newPanel.add(L23);
       JLabel L24 = new JLabel(" ");
       L24.setBorder(border);
       newPanel.add(L24);
       JLabel L25 = new JLabel(" ");
       L25.setBorder(border);
       newPanel.add(L25);
       JLabel L26 = new JLabel(" ");
       L26.setBorder(border);
       newPanel.add(L26);
       JLabel L27 = new JLabel(" ");
       L27.setBorder(border);
       newPanel.add(L27);
       JLabel L28 = new JLabel(" ");
       L28.setBorder(border);
       newPanel.add(L28);
       JLabel L29 = new JLabel(" ");
       L29.setBorder(border);
       newPanel.add(L29);
       JLabel L30 = new JLabel(" ");
       L30.setBorder(border);
       newPanel.add(L30);
       JLabel L31 = new JLabel(" ");
       L31.setBorder(border);
       newPanel.add(L31);
       JLabel L32 = new JLabel(" ");
       L32.setBorder(border);
       newPanel.add(L32);
       JLabel L33 = new JLabel(" ");
       L33.setBorder(border);
       newPanel.add(L33);
       JLabel L34 = new JLabel(" ");
       L34.setBorder(border);
       newPanel.add(L34);
       frame.add(newPanel);
       frame.add(new JSeparator(), BorderLayout.CENTER);

       Font font1 = new Font("Arial", Font.BOLD, 40);
       JTextField textField = new JTextField("Enter a five letter word");
       textField.setSize(200, 60);
       textField.setFont(font1);
       textField.setLocation(50,700);
       frame.add(textField);
       frame.setVisible(true);



   }
}
