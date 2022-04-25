package Wordle.controller;

import Wordle.model.*;
import Wordle.view.*;
import java.util.ArrayList;
import java.lang.Integer;

public class WordleController {

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
        game = new Game(round);
        System.out.println("This starts the game, controlling the entire flow, grabbing the word from wordList, etc.");
    }


    public void onEnter() {
        ArrayList<Integer> positions;
        String word = ui.getText().toLowerCase();
        Boolean wordExists = wordList.existsInList(word);
        if (wordExists) {

            positions = hiddenWord.checkPositions(word);
            ui.setColors(positions, game.getRoundNumber());
            ui.setWord(word, game.getRoundNumber());
            game.incRoundNumber();
            if (game.hasWon(positions)) {
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
