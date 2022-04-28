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

public class WordNotExistGUI implements WordNotExistUserInterface{

    private JFrame wordNotExistFrame;
    private JPanel wordNotExistPanel;
    private JTextField wordNotExistMessage;
    private Font font2 = new Font("Arial", Font.BOLD, 13);

    public WordNotExistGUI() {
        // code to create "Word not in dictionary popup"
        wordNotExistFrame = new JFrame("Word Doesn't Exist");
        wordNotExistFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        wordNotExistFrame.setSize(350, 150);
        wordNotExistPanel = new JPanel(new BorderLayout());
        wordNotExistMessage = new JTextField("That word isn't in the dictionary! Try a new one.");
        wordNotExistMessage.setFont(font2);
        wordNotExistMessage.setHorizontalAlignment(SwingConstants.CENTER);

        wordNotExistPanel.add(wordNotExistMessage);
        wordNotExistFrame.add(wordNotExistPanel);
        wordNotExistFrame.setLocation(150, 300);
        wordNotExistFrame.setVisible(true);
        wordNotExistFrame.dispose(); // This is here because it solves a bug preventing the score board from showing
    }

    public void showWordNotExistPopup() {
        wordNotExistFrame.setVisible(true);
    }
}
