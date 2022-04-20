package Wordle.model;

import java.util.ArrayList;

import javax.annotation.processing.FilerException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DictionaryLoader 
{
    String pathFile;
    protected ArrayList<String> words;

    public ArrayList<String> loadDictionary(String pathFile) throws IOException
    {
        words = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader("Dictionary.txt"));
        String line;
        while ( (line = br.readLine()) != null)
        {
                words.add(line);
        }
            System.out.println("checkPositions called");
            return words;
        }
}
