package Wordle;


import org.junit.*;
import static org.junit.Assert.*;
import Wordle.model.Game;
import java.util.ArrayList;

public class GameTests {

    @Test
    public void getRoundNumberTest() {
        Game game = new Game(6);
        assertEquals("Round number should be 0", 0, game.getRoundNumber());
    }

    @Test
    public void hasWonTrueTest() {
        Game game = new Game(4);
        ArrayList<Integer> madeUpPositions = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            madeUpPositions.add(2);
        }
        assertTrue("An array of 2s should signal a win", game.hasWon(madeUpPositions));
    }

    @Test
    public void hasLostTest() {
        Game game = new Game(6);
        for (int i = 0; i < 6; i++) {
            game.incRoundNumber();
        }
        assertTrue("After six rounds, the user should lose", game.hasLost());
    }

    @Test 
    public void hasWonFalseTest() {
        Game game = new Game(6);
        ArrayList<Integer> badPositions = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            badPositions.add(2);
        }
        badPositions.add(1);
        badPositions.add(0);
        assertFalse("hasWon should return false",game.hasWon(badPositions));
    }
}
