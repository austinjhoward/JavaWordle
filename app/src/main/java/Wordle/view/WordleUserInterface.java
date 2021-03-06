package Wordle.view;

import java.util.ArrayList;
import java.lang.Integer;
import java.awt.event.ActionListener;

public interface WordleUserInterface {

    public void draw(int numRows);
    public String getText();
    public void setColors(ArrayList<Integer> positions, int roundNumber);
    public void setEnter(ActionListener l);
    public void setWordleVisible();
    public void clearColorAndWord(int roundnumber);
    public void closeWordle();
    public void setWord(String word, int roundNumber);
    public void disableEnter();
}

