/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.exceptions.GameControlException;
import byui.cit260.piratesgame.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesgame.PiratesGame;

/**
 *
 * @author rominapainter
 */

public abstract  class SaveGameView extends View{
   
                  
    public String[] getInputs(String promptMessage){
        String[] inputs = new String[1];
        
        this.console.println("\nPress 'S' to save the game under your user name.");

       String playerinput = this.getInput("Enter Player's name:");

            inputs[1] = playerinput;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String [] inputs)  {
        String filePath = inputs[0];
        
         Game game = PiratesGame.getCurrentGame();
         
        try{
            GameControl.saveGame(game, filePath);
         }
        catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        return false;
         } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        this.console.println("Your game is saved!");
 return true;
}

}
