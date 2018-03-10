/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import java.util.Scanner;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
class CrewMenuView {

    public void displayCrewMenuView() {

        boolean endView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                return;
            }
            endView = doAction(inputs);

        } while (endView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {

            System.out.println("  K - Pick new crew member\n"
                    + "  T - Talk to a crew member\n"
                    + "  R - Return\n"
                    + "  P - Pause game\n"
                    + "  Q - Quit game");

            Scanner userResponse = new Scanner(System.in);
            String response = userResponse.nextLine();
            String userInput = response.trim();

            if (userInput.length() < 1) {
                System.out.println("You cant have a crew member.");
                continue;
            }

            inputs[0] = userInput;
            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "K":
                pickCrew();
                break;
            case "T":
                talkCrew();
                break;
            case "R":
                returntoGame();
                break;
            case "P":
                pauseGame();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid pirate option.");
        }

        return false;
    }

    private void pickCrew() {
        GameControl.createNewGame(PiratesGame.getPlayer());
        PickCrewView pickCrewView = new PickCrewView();

        pickCrewView.displayPickCrew();
    }

    private void talkCrew() {

        TalkCrewView talkCrewView = new TalkCrewView();

        talkCrewView.displayTalkCrewView();
    }

    private void returntoGame() {
        ReturnGameView returnGameView = new ReturnGameView();

        returnGameView.displayReturnGameView();
    }

    private void pauseGame() {
        System.out.println("on MAIN MENU press P.");
    }
}


