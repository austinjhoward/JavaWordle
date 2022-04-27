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
         Streak streak = new Streak("Streak.txt");
         MainMenuGUI mainMen = new MainMenuGUI();
         EndGameGUI endgameGUI = new EndGameGUI();
         WordleController controller = new WordleController(dictionary, wordList, gui, streak, mainMen, endgameGUI);


         mainMen.setEasy(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               mainMen.disposeFrame();
               controller.onEasy();
               gui.draw(10);
               gui.setEnter(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     controller.onEnter();
                  }
               });
               gui.setWordleVisible();
            }
         });

         mainMen.setMedium(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               mainMen.disposeFrame();
               controller.onMedium();
               gui.draw(6);
               gui.setEnter(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     controller.onEnter();
                  }
               });
               gui.setWordleVisible();
            }
         });

         mainMen.setHard(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               mainMen.disposeFrame();
               controller.onHard();
               gui.draw(4);
               gui.setEnter(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                     controller.onEnter();
                  }
               });
               gui.setWordleVisible();
            }
         });

         endgameGUI.setReplay(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               endgameGUI.closeEndgamePopup();
               controller.onReplay();
            }
         });

         endgameGUI.setMainMenu(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               endgameGUI.closeEndgamePopup();
               controller.onMainMenu();
            }
         });
         
      } catch (IOException e) {
         System.out.println(e);
      }

   }
}
