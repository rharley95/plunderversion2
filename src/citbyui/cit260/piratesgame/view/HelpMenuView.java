/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import java.util.Scanner;

/**
 *
 * @author rominapainter
 */
class HelpMenuView {
    
    void displayHelpMenuView(){
        boolean endView = false;
        
        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                return;
            }
            endView = doAction(inputs);
            

        } while (endView != true);
   

  
}

    private String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {

            System.out.println("   G - What is the goal of the game?\n" +
                               "  M - How to move\n" +
                               "  C – How to engage in combat \n" +
                               "  S - Save game\n" +
                               "  R - Restart game\n" +
                               "  P - Pause game\n" +
                               "  Q - Quit game");
            
            Scanner userResponse = new Scanner(System.in);
            String response = userResponse.nextLine();
            String userInput = response.trim();
            

            if (userInput.length() < 1) {
                System.out.println("You must enter non-blank value.");
                continue;
            }

            inputs[0] = userInput;
            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
      menuItem = inputs[0].toUpperCase();
      
      switch (menuItem) {
          case "G" : gameGoal();
          break;
          case "M" : howToMove();
          break;
          case "C" : playCombat();
          break;
          case "S" : savingGame();
          break;
          case "R" : restartingGame();
          break;
          case "P" : pausingGame();
          break;
          case "Q" : return true;
          default: System.out.println("Please enter a valid option.");
      }

        return false;
    }

    private void gameGoal() {
        System.out.println("This is a text based role playing game. \n"
                + "In this game, you will take the reins in your hand by being the captain of a ship. \n"
                + "You and your crew members have a goal to find the long lost treasure of General Monkey Spot. \n"
                + "Lots of people in the town have heard of this treasure. It is up to you as Captain of the expedition to choose the best people to go on this trip with. \n"
                + "Every Crew member has a special tale which can bring you closer to the treasure but these tales have very horrid tales which come with it. \n"
                + "With every tale you choose from a crew member, you have to overcome the barricades to move on to the next step. \n"
                + "Occasionally you will receive divine help from the god of the sea. Seems the gods like you Captain. You would be given messages in bottles floating on the sea. \n"
                + "Choosing the wrong directions would stir up mighty storms. Poseidon hates wong turns. "
                + "Don't anger him and always keep to the right road. "
                + "Your  task is to overcome all these barricades and head for the treasure. "
                + "The game is over when you have loaded the ship with the treasure and set sail for home where the people await to hear your tale of the Treasure of General Monkeyspot.” \n"
                + "The game begins when  you select your crew members. During the game, you will need to explore the land of to find your treasure and fight with other pirates on the same search. \n"
                + "You need to have a supply of food and water to keep you going. Without food, water or fire to keep you warm and a supply of weapons you won’t reach the treasure. You need to store these equipments  and trade  food products to keep you till the game ends. \n");
    }

    private void howToMove() {
        System.out.println("N - Travel North\n" +
"  W - Travel West\n" +
"  E - Travel East\n" +
"  S - Travel South" + "The user will enter one of the four directions to travel.");
    }

    private void playCombat() {
        System.out.println("During combat the user will be able to see both ships stats and decide to attack or run. "
                + "If they attack the results are displayed (if they run the enemy gets one free attack and combat ends, putting the player back to their previous position and in the game menu. "
                + "If an invalid entry is made they will be re prompted to enter a decision. If the player’s ship is sunk (has its HP value reduce to 0 or below) they will receive a game over message and be put back at the main menu. "
                + "If the enemy ship is defeated the player will be notified of what cargo they are able to obtain, and brought to the game menu. ");
    }

    private void savingGame() {
        System.out.println("The end user is prompted by the program to determine where the game will be saved. "
                + "If a valid file location is specified, the save will include player name, game progress, map, inventory items, ship, and other relevant data to a file. "
                + "Display a message saying that the game was saved successfully and then return back to the Main Menu. "
                + "If the user enters an invalid location to save the data, the end user is prompted again to enter a location.");
    }

    private void restartingGame() {
        System.out.println("The end user is prompted to enter the file location where the game was saved previously. "
                + "If a valid file location was specified, the program reads in the player name, game progress, map, inventory items, ship, and other relevant data to a file. "
                + "Set the current game to the game read in. Display a message saying that the game was loaded successfully and then display the Game Menu. "
                + "If the user enters an invalid location to save the data, the end user is prompted again to enter a valid location or exit to the main menu.");
    }

    private void pausingGame() {
        System.out.println("on MAIN MENU press P.");
    }
    
}
