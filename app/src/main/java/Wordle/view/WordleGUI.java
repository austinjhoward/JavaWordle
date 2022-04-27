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
    private JFrame wordNotExistFrame;
    private JPanel masterPanel;
    private JPanel replayPanel;
    private JPanel exitPanel;
    private JPanel wordNotExistPanel;
    private JPanel endgameTextPanel;
    private JPanel gridPanel;
    private JButton enterButton;
    private JButton replayButton;
    private JButton mainMenuButton;
    private JTextField textField;
    private JTextField endgameMessage;
    private JTextField wordNotExistMessage;
    private JPanel[][] panels;
    private JLabel[][] labels;
    private int frameWidth = 600;
    private int numRows;
    private Font font2 = new Font("Arial", Font.BOLD, 38);

    public WordleGUI() {
        // Code to create engame popup
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
        mainMenuButton = new JButton("Main Menu");
        replayButton.setFont(font2);
        mainMenuButton.setFont(font2);

        endgameTextPanel.add(endgameMessage);
        replayPanel.add(replayButton);
        exitPanel.add(mainMenuButton);

        endgameFrame.add(endgameTextPanel, BorderLayout.NORTH);
        endgameFrame.add(replayPanel, BorderLayout.CENTER);
        endgameFrame.add(exitPanel, BorderLayout.SOUTH);
        endgameFrame.setLocation(100, 200);
        endgameFrame.setVisible(false);

        // code to create "Word not in dictionary popup"
        wordNotExistFrame = new JFrame("Word Doesn't Exist");
        wordNotExistFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        wordNotExistFrame.setSize(350, 150);
        wordNotExistPanel = new JPanel(new BorderLayout());
        wordNotExistMessage = new JTextField("That word isn't in the dictionary! Try a new one.");
        wordNotExistMessage.setHorizontalAlignment(SwingConstants.CENTER);

        wordNotExistPanel.add(wordNotExistMessage);
        wordNotExistFrame.add(wordNotExistPanel);
        wordNotExistFrame.setLocation(150, 300);
        wordNotExistFrame.setVisible(true);
        wordNotExistFrame.dispose(); // This is here because it solves a bug preventing the score board from showing
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        // defining a string which is fetched by the getText() method of TextArea class
        String text = textField.getText();
        if (text.length() < 5) {
            enterButton.setEnabled(false);
        } else if (text.length() == 5) {
            enterButton.setEnabled(true);
        } else if (text.length() > 5) {
            enterButton.setEnabled(false);
        }
    }

    public void draw(int numRows) {
        frame = new JFrame("Wordle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.numRows = numRows;
        panels = new JPanel[numRows][5];
        labels = new JLabel[numRows][5];
        frame.setSize(this.frameWidth, ((this.numRows * 100) + 200));
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
        textButtonPanel.setSize(this.frameWidth - 100, 100); 

        // Creating the text box

        textField = new JTextField("Enter a 5 letter word");
        // textField.setSize(100, 100);
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

    public void setColors(ArrayList<Integer> positions, int roundNumber) {
        for (int i = 0; i < positions.size(); i++) {
            if (positions.get(i) == 1) {
                panels[roundNumber][i].setBackground(new Color(198, 181, 102));
            } else if (positions.get(i) == 2) {
                panels[roundNumber][i].setBackground(new Color(107, 169, 100));
            } else {
                panels[roundNumber][i].setBackground(new Color(121, 124, 126));
            }

        }

        System.out.println("this method sets the colors of the block");
    }

    public void showEndgamePopUp(String msg) {
        endgameMessage.setText(msg);
        endgameFrame.setVisible(true);
    }

    public void showWordNotExistPopup() {
        wordNotExistFrame.setVisible(true);
    }

    public void setEnter(ActionListener l) {
        enterButton.addActionListener(l);
    }


    public void setReplay(ActionListener l) {
        replayButton.addActionListener(l);
    }

    public void setMainMenu(ActionListener l) {
        mainMenuButton.addActionListener(l);
    }

    public void setWordleVisible() {
        frame.setVisible(true);
    }

    public void setWord(String word, int roundNumber) {
        for (int i = 0; i < 5; i++) {
            labels[roundNumber][i].setText(String.valueOf(word.charAt(i)).toUpperCase());
        }
    }

    public void clearColorAndWord(int roundNumber) {
        endgameFrame.dispose();
        //textField.setText("");
        textField.setSize(200, 100);
        for (int i = 0; i < roundNumber; i++) {
            for (int j = 0; j < 5; j++) {
                labels[i][j].setText("");
                panels[i][j].setBackground(new Color(238, 238, 238));
            }
        }
    }

    public void closeWordle() {
        frame.removeAll();
        frame.dispose();
    }
}
