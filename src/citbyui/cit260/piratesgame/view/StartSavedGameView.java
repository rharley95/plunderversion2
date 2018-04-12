/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.exceptions.GameControlException;
import byui.cit260.piratesgame.model.Game;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class StartSavedGameView extends View {

    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
        
        this.console.println("\nPress 'R' to  start the game under your user name.");

       String playerinput = this.getInput("Enter Player's name:");

            inputs[1] = playerinput;
        
        return inputs;
    }

    
    
    @Override
    
    public boolean doAction(String[] inputs) throws GameControlException {
        String filePath = inputs[0];
        
         
        try{
             Game game = PiratesGame.getCurrentGame();
         }
        catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        return false;
         }
        
        this.console.println("Your game is saved!");
 return true;
    }  
}
