//Driver
main {
    WordleGUI w = new WordleGUI();
    }
}

//Controller

array[0 -> gray, 1 -> yellow, 2 -> green]

public WordleController(Integer dificulty) {
    //phase 0
    //roundNumber = 0
    //maxRounds = dificulty
    //Call DictionaryLoader -> List<String>
    //With that list, we create WordList (constructor)
    //call getWordRandomly -> String
    //With that string we create HiddenWord
    
   
}

//Boolean exists(String word) {
    return wordList.existsWord(word);
}

public Integer play(String word) {
    Integer[] positions;

     //phase N (when the user sends the word)
     //1- check that the word exists
     
     if(exists(word)){
        //move to next phase
        currentPositions = HiddenWord.checkPositions(word);
    } else {
        return null;
        }
        
        //Check if positions have all 1
        if(hasWon()) {
            return 1;
        } else if(hasLost()){
            return 2;
            }else {
            //Increase roundNumber
            return 0;
            }
}

//

//GUI

Controller c = new Controller(dificulty);
//setColors()
if(array[y] == 0) {
    grid[x][y] = Color.GREY;
} else if(array[y] == 1) {
    
}
//On the Action of button
//method PLAY
//Check that the user has only put 5 letters
//call Controller.play:
//If it returns 0 -> getPositions()
//If it returns ->Popup WIN -> ShowPopUp("You won")
//If it returns -> popup de LOST, and getHiddenWord() -> 
        //showPopUp("you've lost " + Controller.getHiddenWord())

//Show POPUP (String msg)
JDialog ..... //Return to menu????
//Turn off ENTER

//Phase 2.0 -> call Controller.save




