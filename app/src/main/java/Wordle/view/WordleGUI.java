package Wordle.view;

import java.awt.event.ActionListener;
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
import java.util.ArrayList;
import java.lang.Integer;
import java.awt.event.*;


public class WordleGUI implements WordleUserInterface, KeyListener {

    private JFrame frame;
    private JFrame endgameFrame;
    private JPanel masterPanel;
    private JPanel replayPanel;
    private JPanel exitPanel;
    private JPanel gridPanel;
    private JButton enterButton;
    private JButton replayButton;
    private JButton exitButton;
    private JTextField textField;
    private JPanel[][] panels = new JPanel[6][5];
    private JLabel[][] labels = new JLabel[6][5];
  


    public WordleGUI() {
        
        frame = new JFrame("Wordle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        masterPanel = new JPanel(new BorderLayout());
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(6, 5, 2, 2));
        Border border = LineBorder.createGrayLineBorder();
        Font font1 = new Font("Arial", Font.BOLD, 80);
  
        // Loop that fills a 2D array with Jpanels
        for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 5; j++) {
              panels[i][j] = new JPanel();
           }
        }
        // Loop that fills a 2D array with JLabels
        for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 5; j++) {
              labels[i][j] = new JLabel(" ");
           }
        }
        // Loop that sets the default color of the text and panel and places label in
        // the panel
        for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 5; j++) {
              labels[i][j].setFont(font1);
              labels[i][j].setForeground(new Color(238, 238, 238));
              // panels[i][j].setBackground(new Color(198,181,102));
              panels[i][j].setBorder(border);
              panels[i][j].add(labels[i][j]);
              gridPanel.add(panels[i][j]);
           }
        }
        // Setting each square to show the way the game works when you guess a word
        labels[0][0].setText("A");
        panels[0][0].setBackground(new Color(198, 181, 102));
        labels[0][1].setText("L");
        panels[0][1].setBackground(new Color(198, 181, 102));
        labels[0][2].setText("T");
        panels[0][2].setBackground(new Color(107, 169, 100));
        labels[0][3].setText("E");
        panels[0][3].setBackground(new Color(121, 124, 126));
        labels[0][4].setText("R");
        panels[0][4].setBackground(new Color(121, 124, 126));
  
        // This part of the code creates a new panel that will contain
        // a text box and an enter button
  
        Font font2 = new Font("Arial", Font.BOLD, 38);
        JPanel textButtonPanel = new JPanel();
  
        // Creating the text box
  
        textField = new JTextField("Enter a 5 letter word");
        textField.setFont(font2);
        textButtonPanel.add(textField);
        // adding KeyListener to the text area   
        textField.addKeyListener(this);   
    
  
        // Creating the enter button
  
        enterButton = new JButton("Enter");
        enterButton.setFont(font2);
        enterButton.setEnabled(false);
        textButtonPanel.add(enterButton);
  
        // Adding both panels to the master panel, positioning them and
        // making them visible
  
        masterPanel.add(gridPanel, BorderLayout.CENTER);
        masterPanel.add(textButtonPanel, BorderLayout.SOUTH);
        frame.add(masterPanel);
        frame.setVisible(true);

        endgameFrame = new JFrame("Endgame");
        endgameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        endgameFrame.setSize(400, 400);
        replayPanel = new JPanel(new BorderLayout());
        exitPanel = new JPanel(new BorderLayout());

        replayButton = new JButton("Replay");
        exitButton = new JButton("Exit");
        replayButton.setFont(font2);
        exitButton.setFont(font2);

        replayPanel.add(replayButton);
        exitPanel.add(exitButton);
        

        endgameFrame.add(replayPanel, BorderLayout.CENTER);
        endgameFrame.add(exitPanel, BorderLayout.SOUTH);
        endgameFrame.setLocation(100, 200);
        endgameFrame.setVisible(true);
    }
    public void keyTyped(KeyEvent e) {}    
    public void keyPressed(KeyEvent e) {}    
    public void keyReleased (KeyEvent e) {    
        // defining a string which is fetched by the getText() method of TextArea class  
                String text = textField.getText();      
                if (text.length()<5){
                    enterButton.setEnabled(false);
                }
                else if (text.length()==5){
                    enterButton.setEnabled(true);
                }
                else if (text.length()>5){
                    enterButton.setEnabled(false);
                }   
            }

    public String getText() {
        return this.textField.getText();
    }

    public void setColors(ArrayList<Integer> positions, int roundNumber){
        //Takes the round number, uses it for the row #, then sets the colors appropriately
        System.out.println("this method sets the colors of the block");
    }

    public void showPopUp(String msg) {
        System.out.println("This function produces the endgame popup");
    }

    public void setEnter(ActionListener l) {
        enterButton.addActionListener(l);
    }

    public void setOnChangeText(ActionListener l) {
        System.out.println("Our setOnChangeText button");
    }

    public void setWordleVisible()
    {
        frame.setVisible(true);
    }
}
