/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.model.Player;

/**
 *
 * @author madug
 */
public class SleepView extends View{

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        this.console.println("This is a text based role playing game.\n "
                + "  ___   ___   __   _____  _   _   ___ ___   _   _    _ __   __ __      ___   _  _ _____   _____ ___    ___ _    ___ ___ ___ ___ ___ \n" +
" |   \\ / _ \\  \\ \\ / / _ \\| | | | | _ \\ __| /_\\ | |  | |\\ \\ / / \\ \\    / /_\\ | \\| |_   _| |_   _/ _ \\  / __| |  | __| __| _ \\__ \\__ \\\n" +
" | |) | (_) |  \\ V / (_) | |_| | |   / _| / _ \\| |__| |_\\ V /   \\ \\/\\/ / _ \\| .` | | |     | || (_) | \\__ \\ |__| _|| _||  _/ /_/ /_/\n" +
" |___/ \\___/    |_| \\___/ \\___/  |_|_\\___/_/ \\_\\____|____|_|     \\_/\\_/_/ \\_\\_|\\_| |_|     |_| \\___/  |___/____|___|___|_|  (_) (_) \n" +
"                                                                                                                                    .\n");

                
            String playername = this.getInput("Enter your name. I must have a bad memory:");

            inputs[0] = playername;

        return inputs;
    }

    

    @Override
    public boolean doAction(String[] inputs) {
       String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if (player == null) {
            ErrorView.display(this.getClass().getName(),"could not create the player"
                    + "enter a different name.");
            
            return false;
        }
        
        this.console.println("================================================= " +
                 "\nWelcome to THE END OF YOUR LIFETIME " + playersName +
                "\nWe hope you have a lot of fun SLEEPING AND DREAMING!" + 
                "\n=================================================");
        
      DeathView deathView = new DeathView();

        deathView.display();

        return true;
    }

}