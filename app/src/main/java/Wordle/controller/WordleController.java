package Wordle.controller;
import Wordle.model.*;

class WordleController {
    int roundNumber;
    int[] currentPositions;
    int maxRounds;

    public WordleController(int maxRounds) {

        System.out.println("Wordle constructor");
    }

    public int play(String wordToGuess) {
        System.out.println("This starts the game with the word to be guessed");
        return 0;
    }

    public String getHiddenWord(HiddenWord word) { //Duplicate method from the HiddenWord class
        return word.getHiddenWord();
    }

    public Boolean doesExist(String word, HiddenWord hidWord){
        if (word == hidWord.getHiddenWord()) {
            return true;
        }
        return false;
    }

}