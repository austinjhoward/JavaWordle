import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;


public class WordleGrid extends JPanel
{
    private JLabel labels[] = new JLabel[30];
    private JPanel panels[] = new JPanel[30];
    private Border border = LineBorder.createGrayLineBorder();
    private Font font1 = new Font("Arial", Font.BOLD, 80);

    // public ArrayList<JLabel> labelList = new ArrayList<JLabel>();
    public WordleGrid() 
    {
        JPanel guessGrid = new JPanel();
        guessGrid.setLayout(new GridLayout(6,5,2,2));
        for(int i = 0; i < 30; i++)
        {
            labels[i] = new JLabel(" ",JLabel.CENTER);
            panels[i] = new JPanel();
            labels[i].setFont(font1);
            labels[i].setBorder(border);
            labels[i].setForeground(new Color(238,238,238));
            panels[i].setBackground(new Color(198,181,102));
            panels[i].add(labels[i]);
            guessGrid.add(panels[i]);
        }

        //JPanel guessGrid = new JPanel();
        //guessGrid.setLayout(new GridLayout(6,5,2,2));
        //for(int i = 0; i < 30; i++)
        {
            //JLabel label = new JLabel(" ");
            //label.setBorder(border);
            //labelList.add(label);
            //guessGrid.add(label);
        }
    }
}