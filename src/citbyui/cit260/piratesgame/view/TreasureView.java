/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.CrewControl;

/**
 *
 * @author rominapainter
 * Individual assignment #13
 */
public class TreasureView extends View{
 public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println("You have reached the treasure! What will you do now?" + 
                "+ \"  B - Get bragging rights\n" +
"                    + \"  L - Leave forever\n" +
"                    + \"  Q - Quit");

        String userInput = this.getInput("You must enter non-blank value.");

        inputs[0] = userInput;

        return inputs;

    }
    
      @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
//        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "B":
                this.bragRights();
                break;
            case "L":
                leaveGame();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Please enter a valid option.");
        }

        return false;
    }

    private void bragRights() {
       System.out.print("__  __               _       ___       __\n" +
"\\ \\/ /___  __  __   | |     / (_)___  / /\n" +
" \\  / __ \\/ / / /   | | /| / / / __ \\/ / \n" +
" / / /_/ / /_/ /    | |/ |/ / / / / /_/  \n" +
"/_/\\____/\\__,_/     |__/|__/_/_/ /_(_)   \n" +
"                                         " + 
               "\n Congrats! You have won the game! You now have braggings rights and a ton of gold!");
    }

    private void leaveGame() {
        System.out.println("Hope to see you back again someday!");
        System.exit(0);
    }
               
}
