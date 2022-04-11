package Wordle.model;

import java.util.ArrayList;
import java.util.List;

public class WordList 
{
    private List<String> words = new ArrayList<String>();

    public WordList(ArrayList<String> words) 
    {
        System.out.println("WordList instantiated");
    }

    public String getWordRandomly()
    {
        System.out.println("getWordRandomly method used");
        String word = "A random word";
        return word;
    }

    public Boolean existsInList(String word)
    {
        System.out.println("existsInList method used");
        return true;
    }
}
    

