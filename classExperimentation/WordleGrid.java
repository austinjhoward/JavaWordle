import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.awt.*;


public class WordleGrid extends JPanel
{
    public ArrayList<JLabel> labelList = new ArrayList<JLabel>();
    public WordleGrid() 
    {
        JPanel guessGrid = new JPanel();
        guessGrid.setLayout(new GridLayout(6,5,2,2));
        Border border = LineBorder.createGrayLineBorder();
        for(int i = 0; i < 30; i++)
        {
            JLabel label = new JLabel(" ");
            label.setBorder(border);
            labelList.add(label);
            guessGrid.add(label);
        }
    }
}