/** 
 * My first Java program
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.lang.String;


public class Wordle extends JFrame
{
    public Wordle()
    {
        super("Wordle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel masterPanel = new JPanel(new BorderLayout());
        WordleGrid gridPanel = new WordleGrid();
        masterPanel.add(gridPanel, BorderLayout.CENTER);
        add(masterPanel);
        pack();
    }

   public static void main(String []args)
   {
       Wordle wordle = new Wordle();
       wordle.setSize(600,800);
       wordle.setVisible(true);
   }
}
