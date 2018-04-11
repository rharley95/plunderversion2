/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.model.Actor;
import java.util.Scanner;

/**
 *
 * @author madug
 */
class PickCrewView extends View{


    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {

            this.console.println("  H - Hank\n"
                    + "  B - Bo\n"
                    + "  Z – Zebra \n"
                    + "  T - Texas Pit\n"
                    + "  R - Restart game\n");

            Scanner userResponse = new Scanner(System.in);
            String response = userResponse.nextLine();
            String userInput = response.trim();

            if (userInput.length() < 1) {
                ErrorView.display(this.getClass().getName(),"You must select a valid initial for the Member.");
                continue;
            }

            inputs[0] = userInput;
            valid = true;
        }

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "H":
                Hank();
                break;
            case "B":
                Bo();
                break;
            case "Z":
                Zebra();
                break;
            case "T":
                TexasPit();
                break;
            case "G":
                BacktoGame();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Please enter a valid option.");
        }

        return false;
    }

    private void Hank() {
        this.console.println("\n" + Actor.Hank.getDescription());
        
  
    }

    private void Bo() {
        this.console.println("\n" + Actor.Bo.getDescription());
    }

    private void Zebra() {
        this.console.println("\n" + Actor.Zebra.getDescription());
    }

    private void TexasPit() {
        this.console.println("\n" + Actor.TexasPit.getDescription());
    }

    private void BacktoGame() {
        this.console.println("Go back to main menu.\n");
    }

}
