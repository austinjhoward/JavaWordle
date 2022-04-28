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
    protected EndGameUserInterface endgameUi;
    protected WordNotExistUserInterface wordNotExistUi;

    public WordleController(DictionaryLoader dictionary, WordList wordList, WordleUserInterface ui, Streak streak,
            MainMenuInterface menuUi, EndGameUserInterface endgameUi, WordNotExistUserInterface wordNotExistUi) {
        this.dictionary = dictionary;
        this.wordList = wordList;
        this.menuUi = menuUi;
        this.streak = streak;
        this.menuUi.sendData(this.streak.getStreak(), this.streak.getMaxStreak(), this.streak.getTotalGamesPlayed());
        this.wordleUi = ui;
        this.endgameUi = endgameUi;
        this.wordNotExistUi = wordNotExistUi;

        System.out.println("WordleController constructor");

    }

    public void onPlay(int round) {
        this.hiddenWord = new HiddenWord(wordList.getWordRandomly());
        game = new Game(round);
        System.out.println("This starts the game, controlling the entire flow, grabbing the word from wordList, etc.");
    }

    public void onReplay() {
        wordleUi.clearColorAndWord(game.getMaxRoundNumber());
        onPlay(game.getMaxRoundNumber());
    }

    public void onMainMenu() {
        wordleUi.clearColorAndWord(game.getMaxRoundNumber());
        wordleUi.closeWordle();
        this.menuUi.sendData(this.streak.getStreak(),this.streak.getMaxStreak(),this.streak.getTotalGamesPlayed());
        menuUi.showFrame();
    }

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
                wordleUi.disableEnter();
                this.streak.incStreak();
                endgameUi.showEndgamePopUp("You won!", this.hiddenWord.getHiddenWord());
            } else if (game.hasLost()) {
                wordleUi.disableEnter();
                this.streak.resetStreak();
                endgameUi.showEndgamePopUp("You lost!", this.hiddenWord.getHiddenWord());
            }
        } else {
            wordNotExistUi.showWordNotExistPopup();
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
