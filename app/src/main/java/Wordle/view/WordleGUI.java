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
    private JPanel endgameTextPanel;
    private JPanel gridPanel;
    private JButton enterButton;
    private JButton replayButton;
    private JButton exitButton;
    private JTextField textField;
    private JTextField endgameMessage;
    private JPanel[][] panels;
    private JLabel[][] labels;
    private Font font2 = new Font("Arial", Font.BOLD, 38);
  


    public WordleGUI() {
        
        frame = new JFrame("Wordle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 800);
        //masterPanel = new JPanel(new BorderLayout());
        //gridPanel = new JPanel();
        //gridPanel.setLayout(new GridLayout(6, 5, 2, 2));
        //Border border = LineBorder.createGrayLineBorder();
        //Font font1 = new Font("Arial", Font.BOLD, 80);
  
        // Loop that fills a 2D array with Jpanels
        //for (int i = 0; i < 6; i++) {
        //   for (int j = 0; j < 5; j++) {
        //      panels[i][j] = new JPanel();
        //   }
        //}
        // Loop that fills a 2D array with JLabels
        //for (int i = 0; i < 6; i++) {
        //   for (int j = 0; j < 5; j++) {
        //      labels[i][j] = new JLabel(" ");
        //   }
        //}
        // Loop that sets the default color of the text and panel and places label in
        // the panel
        //for (int i = 0; i < 6; i++) {
        //   for (int j = 0; j < 5; j++) {
        //      labels[i][j].setFont(font1);
        //      labels[i][j].setForeground(new Color(238, 238, 238));
        //      // panels[i][j].setBackground(new Color(198,181,102));
        //      panels[i][j].setBorder(border);
        //      panels[i][j].add(labels[i][j]);
        //      gridPanel.add(panels[i][j]);
        //   }
        //}
        // Setting each square to show the way the game works when you guess a word
        //labels[0][0].setText("A");
        //panels[0][0].setBackground(new Color(198, 181, 102));
        //labels[0][1].setText("L");
        //panels[0][1].setBackground(new Color(198, 181, 102));
        //labels[0][2].setText("T");
        //panels[0][2].setBackground(new Color(107, 169, 100));
        //labels[0][3].setText("E");
        //panels[0][3].setBackground(new Color(121, 124, 126));
        //labels[0][4].setText("R");
        //panels[0][4].setBackground(new Color(121, 124, 126));
  
        // This part of the code creates a new panel that will contain
        // a text box and an enter button
  
        //Font font2 = new Font("Arial", Font.BOLD, 38);
        //JPanel textButtonPanel = new JPanel();
  
        // Creating the text box
  
        //textField = new JTextField("Enter a 5 letter word");
        //textField.setFont(font2);
        //textButtonPanel.add(textField);
        // adding KeyListener to the text area   
        //textField.addKeyListener(this);   
    
  
        // Creating the enter button
  
        //enterButton = new JButton("Enter");
        //enterButton.setFont(font2);
        //enterButton.setEnabled(false);
        //textButtonPanel.add(enterButton);
  
        // Adding both panels to the master panel, positioning them and
        // making them visible
  
        //masterPanel.add(gridPanel, BorderLayout.CENTER);
        //masterPanel.add(textButtonPanel, BorderLayout.SOUTH);
        //frame.add(masterPanel);
        //frame.setVisible(false);

        endgameFrame = new JFrame("Endgame");
        endgameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        endgameFrame.setSize(400, 400);
        replayPanel = new JPanel(new BorderLayout());
        exitPanel = new JPanel(new BorderLayout());
        endgameTextPanel = new JPanel(new BorderLayout());

        endgameMessage = new JTextField();
        endgameMessage.setHorizontalAlignment(SwingConstants.CENTER);
        endgameMessage.setFont(font2);
        replayButton = new JButton("Replay");
        exitButton = new JButton("Exit");
        replayButton.setFont(font2);
        exitButton.setFont(font2);

        endgameTextPanel.add(endgameMessage);
        replayPanel.add(replayButton);
        exitPanel.add(exitButton);
        
        endgameFrame.add(endgameTextPanel, BorderLayout.NORTH);
        endgameFrame.add(replayPanel, BorderLayout.CENTER);
        endgameFrame.add(exitPanel, BorderLayout.SOUTH);
        endgameFrame.setLocation(100, 200);
        endgameFrame.setVisible(false);
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

    public void draw(int numRows) {

        panels = new JPanel[numRows][5];
        labels = new JLabel[numRows][5];
        frame.setSize(600, ((numRows*100)+200));
        masterPanel = new JPanel(new BorderLayout());
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(numRows, 5, 2, 2));
        Border border = LineBorder.createGrayLineBorder();
        Font font1 = new Font("Arial", Font.BOLD, 80);
  
        // Loop that fills a 2D array with Jpanels
        for (int i = 0; i < numRows; i++) {
           for (int j = 0; j < 5; j++) {
              panels[i][j] = new JPanel();
           }
        }
        // Loop that fills a 2D array with JLabels
        for (int i = 0; i < numRows; i++) {
           for (int j = 0; j < 5; j++) {
              labels[i][j] = new JLabel(" ");
           }
        }
        // Loop that sets the default color of the text and panel and places label in
        // the panel
        for (int i = 0; i < numRows; i++) {
           for (int j = 0; j < 5; j++) {
              labels[i][j].setFont(font1);
              labels[i][j].setForeground(new Color(238, 238, 238));
              // panels[i][j].setBackground(new Color(198,181,102));
              panels[i][j].setBorder(border);
              panels[i][j].add(labels[i][j]);
              gridPanel.add(panels[i][j]);
           }
        }

  
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
        frame.setVisible(false);
    }

    public String getText() {
        return this.textField.getText();
    }

    public void setColors(ArrayList<Integer> positions, int roundNumber){
        for(int i = 0; i < positions.size(); i++)
        {
            if(positions.get(i) == 1)
            {
                panels[roundNumber][i].setBackground(new Color(198, 181, 102));
            }
            else if(positions.get(i) == 2)
            {
                panels[roundNumber][i].setBackground(new Color(107, 169, 100));
            }
            else
            {
                panels[roundNumber][i].setBackground(new Color(121, 124, 126));
            }

        }

        System.out.println("this method sets the colors of the block");
    }

    public void showPopUp(String msg) {
        endgameMessage.setText(msg);
        endgameFrame.setVisible(true);
    }

    public void setEnter(ActionListener l) {
        enterButton.addActionListener(l);
    }

    public void setWordleVisible()
    {
        frame.setVisible(true);
    }

    public void setWord(String word, int roundNumber)
    {
        for(int i = 0; i < 5; i++)
        {
            labels[roundNumber][i].setText(String.valueOf(word.charAt(i)).toUpperCase());
        }
    }
}
