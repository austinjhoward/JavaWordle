package Wordle.view;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;

public class MainMenuGUI {

    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton easyButton;
    private JButton medButton;
    private JButton hardButton;
    

    public MainMenuGUI()
    {
        mainFrame = new JFrame("Wordle Main Menu");
        mainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    
        mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setPreferredSize(new Dimension(300, 100));

        GridBagConstraints easyCon = new GridBagConstraints();

        easyButton = new JButton("Easy");
        easyCon.fill = GridBagConstraints.HORIZONTAL;
        easyCon.gridx = 0;
        easyCon.gridy = 0;
        easyCon.weightx = 0.5;
        mainPanel.add(easyButton,easyCon);

        GridBagConstraints medCon = new GridBagConstraints();

        medButton = new JButton("Medium");
        medCon.fill = GridBagConstraints.HORIZONTAL;
        medCon.gridx = 1;
        medCon.gridy = 0;
        medCon.weightx = 0.5;
        mainPanel.add(medButton, medCon);

        GridBagConstraints hardCon = new GridBagConstraints();

        hardButton = new JButton("Hard");
        hardCon.fill = GridBagConstraints.HORIZONTAL;
        hardCon.gridx = 2;
        hardCon.gridy = 0;
        hardCon.weightx = 0.5;
        mainPanel.add(hardButton, hardCon);

        mainFrame.add(mainPanel);

        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public void setEasy(ActionListener l) {
        this.easyButton.addActionListener(l);
        System.out.println("Our easy play button");
    }

    public void setMedium(ActionListener l) {
        this.medButton.addActionListener(l);
        System.out.println("Our medium play button");
    }

    public void setHard(ActionListener l) {
        this.hardButton.addActionListener(l);
        System.out.println("Our hard play button");
    }

    public void disposeFrame()
    {
        mainFrame.dispose();
    }
}
