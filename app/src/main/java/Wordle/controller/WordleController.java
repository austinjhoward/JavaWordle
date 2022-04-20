package Wordle.controller;

import Wordle.model.*;
import Wordle.view.*;
import java.util.ArrayList;
import java.lang.Integer;

public class WordleController {
    int roundNumber = 0;
    int[] currentPositions;
    protected int maxRounds;
    protected DictionaryLoader dictionary;
    protected WordList wordList;
    protected HiddenWord hiddenWord;
    protected Game game;
    protected WordleGUI ui;


    public WordleController(DictionaryLoader dictionary, WordList wordList, WordleGUI ui) {
        this.dictionary = dictionary;
        this.wordList = wordList;
        this.ui = ui;
        System.out.println("WordleController constructor");

    }

    public void onPlay(int round) {
        this.hiddenWord = new HiddenWord(wordList.getWordRandomly());
        maxRounds = round;
        game = new Game(maxRounds);
        System.out.println("This starts the game, controlling the entire flow, grabbing the word from wordList, etc.");
    }

    public void onChangeText() {
        System.out.println("Func that enables us to check if user put in a five letter word");
    }

    public void onEnter() {
        ArrayList<Integer> positions;
        String word = ui.getText();
        Boolean yesOrNo = wordList.existsInList(word);
        if (yesOrNo) {
            roundNumber++;
            positions = hiddenWord.checkPositions(word);
            ui.setColors(positions, roundNumber);
            if (game.hasWon()) {
                //launches pop-up saying that you won
                //asks if you want to play again, or go to the main menu. Play again sets you back on the same difficulty
            }
            else if (game.hasLost()) {
                //launches pop-up saying that you lost
                //asks if you want to play again, or go to the main menu. Play again sets you back on the same difficulty
            }
        }

    }

    public void onEasy() {
        onPlay(10);
    }

    public void onMedium() {
        onPlay(6);
    }

    public void onHard() {
        onPlay(4);
    }


}