//User interface prototype for wordle
package Wordle;

import Wordle.view.*;
import Wordle.model.*;
import Wordle.controller.*;
import java.awt.event.*;
import java.io.IOException;

public class Driver {

   public static void main(String[] args) { // Creates a 2D array of Jpanels, and of JLabels

      DictionaryLoader dictionary = new DictionaryLoader();

      try {
         WordList wordList = new WordList(dictionary.loadDictionary("Dictionary.csv"));
         WordleGUI gui = new WordleGUI();
         WordleController controller = new WordleController(dictionary, wordList, gui);

         gui.setEnter(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               controller.onEnter();
            }
         });

         gui.setOnChangeText(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               controller.onChangeText();
            }
         });

         gui.setEasy(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               controller.onEasy();
            }
         });

         gui.setMedium(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               controller.onMedium();
            }
         });

         gui.setHard(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               controller.onHard();
            }
         });
      } catch (IOException e) {
         System.out.println(e);
      }

   }
}
