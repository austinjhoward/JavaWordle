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
import javax.swing.plaf.DimensionUIResource;
import javax.swing.*;
import java.util.ArrayList;
import java.lang.Integer;
import java.awt.event.*;

public class EndGameGUI implements EndGameUserInterface{

    private JFrame endgameFrame;
    private JPanel replayPanel;
    private JPanel exitPanel;
    private JPanel wordPanel;
    private JPanel endgameTextPanel;
    private JButton replayButton;
    private JButton mainMenuButton;
    private JLabel endgameMessage;
    private JLabel endgameWord;
    private Font font2 = new Font("Arial", Font.BOLD, 14);

    public EndGameGUI() {
        endgameFrame = new JFrame("Endgame");
        endgameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        endgameFrame.setSize(400, 400);
        replayPanel = new JPanel(new BorderLayout());
        exitPanel = new JPanel(new BorderLayout());
        endgameTextPanel = new JPanel(new BorderLayout());
        wordPanel = new JPanel(new BorderLayout());

        endgameMessage = new JLabel();
        endgameMessage.setHorizontalAlignment(SwingConstants.CENTER);
        endgameMessage.setFont(font2);
        endgameWord = new JLabel();
        endgameWord.setText("text");
        endgameWord.setHorizontalAlignment((SwingConstants.CENTER));
        replayButton = new JButton("Replay");
        replayButton.setFont(new Font("Arial", Font.BOLD, 13));
        mainMenuButton = new JButton("Main Menu");
        // replayButton.setPreferredSize(new DimensionUIResource(200, 10));
        replayButton.setFont(font2);
        mainMenuButton.setFont(font2);

        endgameTextPanel.add(endgameMessage);
        replayPanel.add(replayButton);
        exitPanel.add(mainMenuButton);
        wordPanel.add(endgameWord);

        endgameFrame.add(endgameTextPanel, BorderLayout.NORTH);
        endgameFrame.add(replayPanel, BorderLayout.WEST);
        endgameFrame.add(exitPanel, BorderLayout.EAST);
        endgameFrame.add(wordPanel, BorderLayout.CENTER);
        endgameFrame.setLocation(100, 200);
        endgameFrame.setVisible(false);
    }
    
    public void showEndgamePopUp(String msg, String word) {
        endgameMessage.setText(msg);
        endgameWord.setText("The word was: " + word);
        endgameFrame.setVisible(true);
    }

    public void setReplay(ActionListener l) {
        replayButton.addActionListener(l);
    }

    public void setMainMenu(ActionListener l) {
        mainMenuButton.addActionListener(l);
    }

    public void closeEndgamePopup() {
        endgameFrame.dispose();
    }
    
}
