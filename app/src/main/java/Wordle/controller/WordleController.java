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
    protected WordleUserInterface wordleUi;
    protected Streak streak;
    protected MainMenuInterface menuUi;


    public WordleController(DictionaryLoader dictionary, WordList wordList, WordleUserInterface ui, Streak streak, MainMenuInterface menuUi) {
        this.dictionary = dictionary;
        this.wordList = wordList;
        this.menuUi = menuUi;
        this.streak = streak;
        this.menuUi.sendData(this.streak.getStreak(), this.streak.getMaxStreak(), this.streak.getTotalGamesPlayed());
        this.wordleUi = ui;

        System.out.println("WordleController constructor");

    }

    public void onPlay(int round) {
        this.hiddenWord = new HiddenWord(wordList.getWordRandomly());
        game = new Game(round);
        System.out.println("This starts the game, controlling the entire flow, grabbing the word from wordList, etc.");
    }

    /*
    public void onReplay() {
        sendData
        show menuGui
    }

     */


    public void onEnter() {
        ArrayList<Integer> positions;
        String word = wordleUi.getText().toLowerCase();
        Boolean wordExists = wordList.existsInList(word);
        if (wordExists) {

            positions = hiddenWord.checkPositions(word);
            wordleUi.setColors(positions, game.getRoundNumber());
            wordleUi.setWord(word, game.getRoundNumber());
            game.incRoundNumber();
            if (game.hasWon(positions)) {
                this.streak.incStreak();
                wordleUi.showEndgamePopUp("You won!");
            }
            else if (game.hasLost()) {
                this.streak.resetStreak();
                wordleUi.showEndgamePopUp("You lost!");
            }
        }
        else {
            wordleUi.showWordNotExistPopup();
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
