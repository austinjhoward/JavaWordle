package Wordle.model;

import java.util.ArrayList;
import java.lang.Integer;

// Class to hold the current WORDLE i.e. the hidden word the 
//  user is guessing
public class HiddenWord 
{
    private String hiddenWord;
    private ArrayList<Integer> positions;

    // Instantiates and assigns hidden word
    public HiddenWord(String word)
    {
        System.out.println("HiddenWord instantiated");
        this.hiddenWord = word;
    }

    // checks the inputted word against the hidden word and
    //  returns their positions or lack of in it
    public  ArrayList<Integer> checkPositions(String word)
    {
        System.out.println("checkPositions called");
        return positions;
    }

    // Returns the hidden word
    public String getHiddenWord()
    {
        System.out.println("getHiddenWord called");
        return this.hiddenWord;
    }
}
