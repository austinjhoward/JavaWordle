
//User interface prototype for wordle

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*; 

public class Driver
{

   public static void main(String []args)
   {
      JFrame frame = new JFrame("Wordle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,800);
      JPanel masterPanel = new JPanel(new BorderLayout());
      JPanel gridPanel = new JPanel();
      gridPanel.setLayout(new GridLayout(6,5,2,2));
      Border border = LineBorder.createGrayLineBorder();
      Font font1 = new Font("Arial", Font.BOLD, 80);
      JLabel L1 = new JLabel("A",JLabel.CENTER);
      L1.setFont(font1);
      L1.setForeground(new Color(238,238,238));
      JPanel L1P = new JPanel();
      L1P.setBackground(new Color(198,181,102));
      L1P.add(L1);
      gridPanel.add(L1P);
      JLabel L2 = new JLabel("L");
      L2.setFont(font1);
      L2.setForeground(new Color(238,238,238));
      JPanel L2P = new JPanel();
      L2P.setBackground(new Color(198,181,102));
      L2P.add(L2);
      gridPanel.add(L2P);
      JLabel L3 = new JLabel("T");
      L3.setFont(font1);
      L3.setForeground(new Color(238,238,238));
      JPanel L3P = new JPanel();
      L3P.setBackground(new Color(107,169,100));
      L3P.add(L3);
      gridPanel.add(L3P);
      JLabel L4 = new JLabel("E");
      L4.setFont(font1);
      L4.setForeground(new Color(238,238,238));
      JPanel L4P = new JPanel();
      L4P.setBackground(new Color(121,124,126));
      L4P.add(L4);
      gridPanel.add(L4P);
      JLabel L5 = new JLabel("R");
      L5.setFont(font1);
      L5.setForeground(new Color(238,238,238));
      JPanel L5P = new JPanel();
      L5P.setBackground(new Color(121,124,126));
      L5P.add(L5);
      gridPanel.add(L5P);
      JLabel L6 = new JLabel(" ");
      L6.setBorder(border);
      gridPanel.add(L6);
      JLabel L7 = new JLabel(" ");
      L7.setBorder(border);
      gridPanel.add(L7);
      JLabel L8 = new JLabel(" ");
      L8.setBorder(border);
      gridPanel.add(L8);
      JLabel L9 = new JLabel(" ");
      L9.setBorder(border);
      gridPanel.add(L9);
      JLabel L10 = new JLabel(" ");
      L10.setBorder(border);
      gridPanel.add(L10);
      JLabel L11 = new JLabel(" ");
      L11.setBorder(border);
      gridPanel.add(L11);
      JLabel L12 = new JLabel(" ");
      L12.setBorder(border);
      gridPanel.add(L12);
      JLabel L13 = new JLabel(" ");
      L13.setBorder(border);
      gridPanel.add(L13);
      JLabel L14 = new JLabel(" ");
      L14.setBorder(border);
      gridPanel.add(L14);
      JLabel L15 = new JLabel(" ");
      L15.setBorder(border);
      gridPanel.add(L15);
      JLabel L16 = new JLabel(" ");
      L16.setBorder(border);
      gridPanel.add(L16);
      JLabel L21 = new JLabel(" ");
      L21.setBorder(border);
      gridPanel.add(L21);
      JLabel L22 = new JLabel(" ");
      L22.setBorder(border);
      gridPanel.add(L22);
      JLabel L23 = new JLabel(" ");
      L23.setBorder(border);
      gridPanel.add(L23);
      JLabel L24 = new JLabel(" ");
      L24.setBorder(border);
      gridPanel.add(L24);
      JLabel L25 = new JLabel(" ");
      L25.setBorder(border);
      gridPanel.add(L25);
      JLabel L26 = new JLabel(" ");
      L26.setBorder(border);
      gridPanel.add(L26);
      JLabel L27 = new JLabel(" ");
      L27.setBorder(border);
      gridPanel.add(L27);
      JLabel L28 = new JLabel(" ");
      L28.setBorder(border);
      gridPanel.add(L28);
      JLabel L29 = new JLabel(" ");
      L29.setBorder(border);
      gridPanel.add(L29);
      JLabel L30 = new JLabel(" ");
      L30.setBorder(border);
      gridPanel.add(L30);
      JLabel L31 = new JLabel(" ");
      L31.setBorder(border);
      gridPanel.add(L31);
      JLabel L32 = new JLabel(" ");
      L32.setBorder(border);
      gridPanel.add(L32);
      JLabel L33 = new JLabel(" ");
      L33.setBorder(border);
      gridPanel.add(L33);
      JLabel L34 = new JLabel(" ");
      L34.setBorder(border);
      gridPanel.add(L34);
      frame.add(gridPanel);
      
      //This part of the code creates a new panel that will contain
      //a text box and an enter button

      Font font2 = new Font("Arial", Font.BOLD, 38);
      JPanel textButtonPanel = new JPanel();
      
      //Creating the text box
      
      JTextField textField = new JTextField("Enter a five letter word");
      textField.setFont(font2);
      textButtonPanel.add(textField);
      
      //Creating the enter button
      
      JButton enterButton = new JButton("Enter");
      enterButton.setFont(font2);
      textButtonPanel.add(enterButton);
      
      //Adding both panels to the master panel, positioning them and
      //making them visible
      
      masterPanel.add(gridPanel, BorderLayout.CENTER);
      masterPanel.add(textButtonPanel, BorderLayout.SOUTH);
      frame.add(masterPanel);
      frame.setVisible(true);
   }
}
