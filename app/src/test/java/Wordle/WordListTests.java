package Wordle;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import Wordle.model.WordList;

public class WordListTests {

    ArrayList<String> words = new ArrayList<String>();

    @Test
    public void wordListInstantiationTest() {
        words.add("tests");
        WordList wordList = new WordList(words);
        assertEquals("The random word should be tests","tests",wordList.getWordRandomly());
    }
    
    @Test
    public void wordInListTest() {
        words.add("value");
        words.add("error");
        WordList wordList = new WordList(words);
        assertTrue("error should be in the Word List",wordList.existsInList("error"));
    }

    @Test
    public void wordNotInListTest() {
        words.add("fanny");
        WordList wordList = new WordList(words);
        assertFalse("funny should not be in the Word List",wordList.existsInList("funny"));
    }


}
