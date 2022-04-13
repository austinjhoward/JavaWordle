package Wordle.model;

// Class to hold the current WORDLE i.e. the hidden word the 
//  user is guessing
public class HiddenWord 
{
    private String hiddenWord;

    // Instantiates and assigns hidden word
    public HiddenWord(String word)
    {
        System.out.println("HiddenWord instantiated");
        this.hiddenWord = word;
    }

    // checks the inputted word against the hidden word and
    //  returns their positions or lack of in it
    int checkPositions(String word)
    {
        System.out.println("checkPositions called");
        return 1;
    }

    // Returns the hidden word
    public String getHiddenWord()
    {
        System.out.println("getHiddenWord called");
        return this.hiddenWord;
    }
}
