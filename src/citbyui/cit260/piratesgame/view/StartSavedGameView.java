/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.model.Game;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class StartSavedGameView extends View {

    @Override
    public String [] getInputs(){
        String[] inputs = new String[1];
        
        this.console.println("\nPress 'R' to start the savedgame.");

       String playerinput = this.getInput("Enter File name:");

            inputs[1] = playerinput;
        
        return inputs;
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
        savedgame.display();
        

        return true;
    }  

    
    }

