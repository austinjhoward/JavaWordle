package Wordle;

import org.junit.*;
import static org.junit.Assert.*;
import Wordle.model.Streak;
import java.io.*;

public class StreakTests {
    // In terms of testing streak without overwriting it,
    //  should we make streak take the file name as an input??
    //  Instead of always assuming the text file is called "streak.txt"?

    Streak streak = new Streak();

    @Test
    public void streakLoadingTest() {
        Integer one = new Integer(1);
        one = 1;
        assertEquals("Streak should be 1", one, streak.getStreak());
    }
}
