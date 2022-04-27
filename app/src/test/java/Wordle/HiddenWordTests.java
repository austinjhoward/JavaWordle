package Wordle;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import Wordle.model.HiddenWord;

import org.junit.*;
import static org.junit.Assert.*;

public class HiddenWordTests {

    private HiddenWord word = new HiddenWord("tests");
    
    @Test
    public void getHiddenWordTest() {
        //String testWord = "teams";
        //ArrayList<Integer> positions = word.checkPositions(testWord);
        //Iterator posIt = positions.listIterator();
        //while(posIt.hasNext()){
        //    System.out.println(posIt.next());
        // }
        assertEquals("Hidden word should be tests","tests",word.getHiddenWord());
    }
    
    //@Test
    //public void checkPositionsMatchTest() {
    //    String testWord = "teams";
    //    ArrayList<Integer> correctPositions = new ArrayList<Integer>();
    //    correctPositions.add(2);
    //    correctPositions.add(2);
    //    correctPositions.add(0);
    //    correctPositions.add(0);
    //    correctPositions.add(2);
    //    assertEquals("checkPositions should return an array of [2,2,0,0,2]",correctPositions,word.checkPositions(testWord));
    //}
}
