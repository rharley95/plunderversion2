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
    public String getInput(String promptMessage){
        String[] inputs = new String[1];
        
        this.console.println("\nPress 'R' to start the game under your user name.");

       String playerinput = this.getInput("Enter Player's name:");

            inputs[1] = playerinput;
        
        return inputs[1];
    }

    
    
    @Override
    public boolean doAction(String[] inputs){
        String filePath = inputs[0];
        
         
        try{
             Game game = PiratesGame.getCurrentGame();
         }
        catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        return false;
         }
        
        GameMenuView savedgame = new GameMenuView();
        

        return true;
    }  

    @Override
    public String[] getInputs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
