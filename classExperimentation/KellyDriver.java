/** 
 * My first Java program
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.lang.String;

public class KellyDriver
{

   public static void main(String []args)
   {
      JFrame frame = new JFrame("Wordle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,800);

      JPanel masterPanel = new JPanel(new BorderLayout());
      WordleGrid gridPanel = new WordleGrid();
      masterPanel.add(gridPanel, BorderLayout.CENTER);
      frame.getContentPane().add(masterPanel);
      frame.setVisible(true);
   }
}
