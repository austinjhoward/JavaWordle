package Wordle.model;

import java.util.ArrayList;

public class Game 
{
    private int roundNumber = 0;
    private ArrayList<Integer> currentPositions = new ArrayList<Integer>();
    private int maxRounds;

    public Game(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    public Boolean hasWon(ArrayList<Integer> positions)
    {
        boolean wonGame = true;
        for (int number : positions)
        {
           if (number != 2)
           {
           wonGame = false;
           break;
            } 
        }
        
        return wonGame;
    }

    public Boolean hasLost()
    {
        boolean lostGame = false;
        if (roundNumber == maxRounds){
            lostGame = true;
        }
        return lostGame;
    }

    public int getRoundNumber()
    {
        //System.out.println("getRoundNumber called");
        return this.roundNumber;
    }

    public int getMaxRoundNumber() {
        return this.maxRounds;
    }

    public ArrayList<Integer> getCurrentPosition()
    {
        //System.out.println("getCurrentPosition called");
        return this.currentPositions;
    }

    public void incRoundNumber()
    {
        //System.out.println("Round nunber increased");
        this.roundNumber ++;
    }

    public void setMaxRounds(int max)
    {
        //System.out.println("setMaxRounds used");
        this.roundNumber = max;
    }
}
