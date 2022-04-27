package Wordle;

import org.junit.*;
import static org.junit.Assert.*;
import Wordle.model.Streak;

public class StreakTests {

    Streak streak = new Streak("StreakTest.txt");
    Integer two = new Integer(2);
    Integer one = new Integer(1);
    Integer zero = new Integer(0);
    //#Streak
    // 0
    // #Max streak
    // 10
    // #Total games played
    // 100

    @Test
    public void streakLoadingTest() {
        assertEquals("Streak should be zero", zero, streak.getStreak());
    }

    @Test
    public void increaseStreakTest() {
        streak.incStreak();
        assertEquals("Streak should now be one",one,streak.getStreak());
    }

    @Test
    public void resetStreakTest() {
        streak.resetStreak();
        assertEquals("Streak should be zero", zero, streak.getStreak());
    }

    @Test
    public void refreshMaxStreakTest() {
        streak.incStreak();
        streak.incStreak();
        assertEquals("Max Streak should be two",two,streak.getMaxStreak());
    }
}
