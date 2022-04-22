package Wordle.model;

import java.util.ArrayList;
import java.util.Random;

// Class to hold word list and generate random words from list
public class WordList 
{
    private ArrayList<String> words = new ArrayList<String>();
    private Random random = new Random();
    private int randomInt;

    // Instantiates word list
    public WordList(ArrayList<String> wordlist) 
    {
        // For loop that adds all words in dictionary (wordlist) 
        //  to internal list
        for (String s : wordlist)
        {
            words.add(s);
        }
        System.out.println("WordList instantiated");
    }

    // Generates and returns a random word
    public String getWordRandomly()
    {
        System.out.println("getWordRandomly method used");
        randomInt = random.nextInt(words.size());
        String word = words.get(randomInt);
        return word;
    }

    // Checks if a word exists in the WordList
    public Boolean existsInList(String word)
    {
        boolean exists = false;
        for ( String testWord : this.words){
            if (word.equals(testWord)){
                exists = true;
                break;
            }
        }
        System.out.println("existsInList method used");
        return exists;
    }
}
