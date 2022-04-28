package Wordle;

import org.junit.*;
import static org.junit.Assert.*;
import Wordle.model.Streak;

public class StreakTests {
    
    private Streak streak;
    private Integer two;
    private Integer one;
    private Integer zero;

    @Before
    public void init() {
        streak = new Streak("StreakTest.txt");
        two = new Integer(2);
        one = new Integer(1);
        zero = new Integer(0);
    }

    @After
    public void clear() {
        streak.resetStreak();
    }
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
        for (int i = 0; i < 11; i++) {
            streak.incStreak();
        }
        Integer eleven = new Integer(11);
        assertEquals("Max Streak should be eleven",eleven,streak.getMaxStreak());
    }

    @Test
    public void getTotalGamesPlayedTest() {
        Integer total = streak.getTotalGamesPlayed();
        streak.incTotalGamesPlayed();
        Integer totalPlus = new Integer(total.intValue()+1);
        assertEquals("Total games played should increase by one",totalPlus,streak.getTotalGamesPlayed());
    }
}
