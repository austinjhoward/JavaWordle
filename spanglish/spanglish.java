//Driver
main {
    WordleGUI w = new WordleGUI();
    }
}

//Controller

array[0 -> gris, 1 -> amarillo, 2 -> verde]

public WordleController(Integer dificulty) {
    //Fase 0
    //roundNumber = 0
    //maxRounds = dificulty
    //Llamamos a DictionaryLoader -> List<String>
    //With that list, we create WordList (constructor)
    //call getWordRandomly -> String
    //With that string we create HiddenWord
    
   
}

//Boolean exists(String word) {
    return wordList.existsWord(word);
}

public Integer play(String word) {
    Integer[] positions;

     //Fase N (cuando user envia palabra)
     //1- Comprobar que la palabra exista
     
     if(exists(word)){
        //Pasar a fase siguiente
        currentPositions = HiddenWord.checkPositions(word);
    } else {
        return null;
        }
        
        //Comprobar si las 'positions' tienen TODO 1
        if(hasWon()) {
            return 1;
        } else if(hasLost()){
            return 2;
            }else {
            //Incrementar roundNumber
            return 0;
            }
}

//

//GUI

Controller c = new Controller(dificultad);
//setColors()
if(array[y] == 0) {
    grid[x][y] = Color.GREY;
} else if(array[y] == 1) {
    
}
//En el Action del button
//método PLAY
//Controlar que el usuario ha escrito palabra de JUSTO 5 letras
//Llamamos a Controller.play, y en funcion de la respuesta:
//Si devuelve 0 -> getPositions()
//Si devuelve 1 ->Popup de GANÉ -> ShowPopUp("Has ganado")
//Si devuelve 2 -> popup de DESASTRE, y getHiddenWord() -> 
        //showPopUp("Has perdido " + Controller.getHiddenWord())

//Mostrar POPUP (String msg)
JDialog ..... //Devolver a menu????
//Deshabilitar ENTER

//Fase 2.0 -> llamar a Controller.save




