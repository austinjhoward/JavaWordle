package Wordle.model;

import java.util.ArrayList;

public class Game 
{
    private int roundNumber;
    private ArrayList<Integer> currentPositions = new ArrayList<Integer>();
    private int maxRounds;

    public Game(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    public Boolean hasWon()
    {
        System.out.println("hasWon method called");
        return true;
    }

    public Boolean hasLost()
    {
        System.out.println("hasLost method called");
        return false;
    }

    public int getRoundNumber()
    {
        System.out.println("getRoundNumber called");
        return this.roundNumber;
    }

    public ArrayList<Integer> getCurrentPosition()
    {
        System.out.println("getCurrentPosition called");
        return this.currentPositions;
    }

    public void incRoundNumber()
    {
        System.out.println("Round nunber increased");
        this.roundNumber ++;
    }

    public void setMaxRounds(int max)
    {
        System.out.println("setMaxRounds used");
        this.roundNumber = max;
    }
}
