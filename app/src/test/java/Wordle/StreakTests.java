package Wordle;

import org.junit.*;
import static org.junit.Assert.*;
import Wordle.model.Streak;
import java.io.*;

public class StreakTests {

    Streak streak = new Streak("StreakTest.txt");
    //#Streak
    // 0
    // #Max streak
    // 10
    // #Total games played
    // 100

    @Test
    public void streakLoadingTest() {
        Integer zero = new Integer(0);
        assertEquals("Streak should be zero", zero, streak.getStreak());
    }

    @Test
    public void increaseStreakTest() {
        streak.incStreak();
        Integer one = new Integer(1);
        assertEquals("Streak should now be one",one,streak.getStreak());
    }
}
