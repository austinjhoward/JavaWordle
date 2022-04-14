package Wordle.controller;

import Wordle.model.*;

class WordleController {
    int roundNumber = 0;
    int[] currentPositions;
    int maxRounds;
    protected DictionaryLoader dictionary;
    protected WordList wordList;
    protected HiddenWord hiddenWord;
    protected Game game;

    public WordleController(int maxRounds, DictionaryLoader dictionary, WordList wordList, HiddenWord hiddenWord,Game game) {
        this.maxRounds = maxRounds;
        this.dictionary = dictionary;
        this.wordList = wordList;
        this.hiddenWord = hiddenWord;
        this.game = game;
        System.out.println("WordleController constructor");
    }

    public void onPlay() {
        System.out.println("This starts the game, controlling the entire flow, grabbing the word from wordList, etc.");
    }

    public void onChangeText() {
        System.out.println("Func that enables us to check if user put in a five letter word");
    }

    public void onEnter() {
        System.out.println("Func that submits the word when user hits enter, then changes the blocks colors to give appropriate answer");
    }


}