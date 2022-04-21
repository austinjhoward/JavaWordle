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
    protected WordleUserInterface ui;


    public WordleController(DictionaryLoader dictionary, WordList wordList, WordleUserInterface ui) {
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


    public void onEnter() {
        ArrayList<Integer> positions;
        String word = ui.getText();
        Boolean wordExists = wordList.existsInList(word);
        if (wordExists) {
            roundNumber++;
            positions = hiddenWord.checkPositions(word);
            ui.setColors(positions, roundNumber);
            if (game.hasWon()) {
                ui.showPopUp("You won!");
            }
            else if (game.hasLost()) {
                ui.showPopUp("You lost!");
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
