/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.model.Player;
import java.util.Scanner;


/**
 *
 * @author rominapainter
 */
public abstract class MapMenuView extends View{

    /**
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
            System.out.println("+--+--+--+--+--+                           \n"
                    + "|~~|~~|/\\|  |  |\n"
                    + "+--+--+--+--+--+\n"
                    + "|  |  |~~|  |  |\n"
                    + "+--+--+--+--+--+\n"
                    + "|  |  |  |  |  |\n"
                    + "+--+--+--+--+--+       \n"
                    + "|  |  |  |  |  |                  \n"
                    + "+--+--+--+--+--+\n"
                    + "|  |  |  |  |  |                  \n"
                    + "+--+--+--+--+--+\n"
                    + "\n"
                    + "  N - Travel North\n"
                    + "  W - Travel West\n"
                    + "  E - Travel East\n"
                    + "  S - Travel South\n"
                    + "  I - Check Inventory\n"
                    + "  C - Check Crew\n"
                    + "  B - Check Ship\n"
                    + "  H - Help\n"
                    + "  V - Save\n"
                    + "  Q - Exit     ");

              String userInput = this.getInput("You must enter a direction, unless you wish to stay idle then choose to EXIT.");
        
                inputs[0] = userInput;
    
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "N":
                travelNorth();
                break;
            case "W":
                travelWest();
                break;
            case "E":
                travelEast();
                break;
            case "S":
                travelSouth();
                break;
            case "I":
                checkInventory();
                break;
            case "C":
                checkCrew();
                break;
            case "B":
                checkShip();
                break;
            case "H":
                getHelp();
                break;
            case "V":
                saveGame();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid option.");
        }

        return false;
    }

    private void travelNorth() {
        System.out.println("You have traveled North! Let's see where else we could go!");
    }

    private void travelWest() {
        System.out.println("You have traveled West! Let's see where else we could go!");
    }

    private void travelEast() {
        System.out.println("You have traveled East! Let's see where else we could go!");
    }

    private void travelSouth() {
        System.out.println("You have traveled South! Let's see where else we could go!");
    }

    private void checkInventory() {
        System.out.println("Here is your inventory!");
    }

    private void checkCrew() {
        System.out.println("T - Talk to crew\n" + "B - Back to last menu");
    }

    private void checkShip() {
        System.out.println("Stat1\n"
                + "Stat2\n"
                + "Stat3");
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("Game saved.");
    
    }
    
    }


