package Wordle;

import Wordle.model.DictionaryLoader;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DictionaryLoaderTest {

    @Test
    public void DictionaryLoader1() {
        DictionaryLoader dictionary = new DictionaryLoader();
        try {
            dictionary.loadDictionary("asdasdasd.txt");
            assertEquals("Failed test, file does not exist", 13, 3);
        } catch (IOException e) {

        }
    }

    @Test
    public void DictionaryLoader2() {
        DictionaryLoader dictionary = new DictionaryLoader();
        try {
            ArrayList<String> words = dictionary.loadDictionary("Dictionary.csv");
            assertEquals("Testing the number of words loaded", words.size(), 2315);
        } catch (IOException e) {
            System.out.println("Doesn't load");
        }
    }
}
