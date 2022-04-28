package Wordle;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import Wordle.model.HiddenWord;

import org.junit.*;
import static org.junit.Assert.*;

public class HiddenWordTests {

    public HiddenWord word;
    public String testWord;
    public ArrayList<Integer> positions;
    private Integer two;
    private Integer zero;
    private Integer one;

    @Before
    public void initial() {
        word = new HiddenWord("tests");
        testWord = "teams";
        positions = word.checkPositions(testWord);
        two = new Integer(2);
        zero = new Integer(0);
        one = new Integer(1);
    }
    
    @Test
    public void getHiddenWordTest() {
        assertEquals("Hidden word should be tests","tests",word.getHiddenWord());
    }
    
    @Test
    public void checkPositionsMatchOneTest() {
        assertEquals("The first number of the array should be one",one,positions.get(0));
    }

    @Test
    public void checkPositionsMatchTwoTest() {
        assertEquals("The second number of the array should be 2",two,positions.get(1));
    }

    @Test
    public void checkPositionsMatchThreeTest() {
        assertEquals("The third number of the array should be 0",zero,positions.get(2));
    }

    @Test
    public void checkPositionsMatchFourTest() {
        assertEquals("The four number of the array should be 0",zero,positions.get(3));
    }

    @Test
    public void checkPositionsMatchFiveTest() {
        assertEquals("The fifth number of the array should be one",one,positions.get(4));
    }
}
