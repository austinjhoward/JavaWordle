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
        System.out.println("HiddenWord: " + word);
        this.hiddenWord = word;
    }

    // checks the inputted word against the hidden word and
    //  returns their positions or lack of in it
    public  ArrayList<Integer> checkPositions(String word)
    {
        System.out.println("checkPositions called");
        positions = new ArrayList<Integer>();
        ArrayList<Integer> indexesMatching = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
        {
            if(word.charAt(i) == hiddenWord.charAt(i))
            {
                positions.add(2);
                indexesMatching.add(i);
            }
            else
            {
                positions.add(0);
            }
        }
        
        for(int i = 0; i < 5; i++)
        {
            Boolean exists = false;
            for(int j = 0; j < 5; j++)
            {
                if(!indexesMatching.contains(j))
                {
                    if(word.charAt(i) == hiddenWord.charAt(j) && !exists)
                    {
                        exists = true;
                        positions.set(i,1);
                        indexesMatching.add(j);
                    }
                }
            }
        }
        return positions;
    
    }

    // Returns the hidden word
    public String getHiddenWord()
    {
        System.out.println("getHiddenWord called");
        return this.hiddenWord;
    }
}
