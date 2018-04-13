/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.exceptions.GameControlException;
import byui.cit260.piratesgame.model.Actor;
import byui.cit260.piratesgame.model.Game;
import byui.cit260.piratesgame.model.Inventory;
import byui.cit260.piratesgame.model.Map;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class PrintActorReportView extends View {

    @Override

    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("\nPrints the list of actors.");

        String playerinput = this.getInput("\n\nEnter the file Path for the file you want to print");
        inputs[0] = playerinput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        
        Actor[]actors = Actor.values(); 
        
        
        try {
            GameControl.PrintActorReport(actors ,filePath );
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
         this.console.println("Your report is printed!");

     return true;
    }
}

