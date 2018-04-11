/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.model.Player;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rominapainter
 */
public class StartProgramView extends View {

    public StartProgramView() {

    }

    private ArrayList<StartProgramView> inputs = new ArrayList<StartProgramView>();

    public String[] getInputs() {

        String[] inputs = new String[1];
        this.console.println("This is a text based role playing game.\n "
                + "In this game, you will take the reins in your hand by being the captain of a ship.\n "
                + "You and your crew members have a goal to find the long lost treasure of General Monkey Spot.\n "
                + "Lots of people in the town have heard of this treasure.\n "
                + "It is up to you as Captain of the expedition to choose the best people to go on this trip with.\n "
                + "Every Crew member has a special tale which can bring you closer to the treasure but these tales have very horrid tales which come with it.\n "
                + "With every tale you choose from a crew member, you have to overcome the barricades to move on to the next step.\n "
                + "Occasionally you will receive divine help from the god of the sea.\n"
                + " Seems the gods like you Captain. You would be given messages in bottles floating on the sea. \n"
                + "Choosing the wrong directions would stir up mighty storms. Poseidon hates wong turns. \n"
                + "Don't anger him and always keep to the right road. \n"
                + "Your  task is to overcome all these barricades and head for the treasure. \n"
                + "The game is over when you have loaded the ship with the treasure and set sail for home where the people await to hear your tale of the Treasure of General Monkeyspot.”\n"
                + " The game begins when  you select your crew members. During the game, you will need to explore the land of to find your treasure and fight with other pirates on the same search. \n"
                + "You need to have a supply of food and water to keep you going. Without food, water or fire to keep you warm and a supply of weapons you won’t reach the treasure. \n"
                + "You need to store these equipments  and trade  food products to keep you till the game ends.\n");

                
            String playername = this.getInput("Enter Player's name:");

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
                 "\nWelcome to the game " + playersName +
                "\nWe hope you have a lot of fun!" + 
                "\n=================================================");
    
    
   MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();

        return true;
    }

}
