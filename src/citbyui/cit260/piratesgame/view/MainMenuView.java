/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.exceptions.GameControlException;
import byui.cit260.piratesgame.model.Game;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class MainMenuView extends View {

    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" N - New Game\n"
                + "  L - Load Game\n"
                + "  H - Help\n"
                + "  Q - Quit Program");


        String userInput = this.getInput("You must enter non-blank value.");

        inputs[0] = userInput;

        return inputs;

    }


    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
//        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "N":
        {
            try {
                startNewGame();
            } catch (GameControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case "L":
                loadGame();
                break;
            case "H":
                getHelp();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid option.");
        }

        return false;
    }

    private void startNewGame() throws GameControlException {

        GameControl.createNewGame(PiratesGame.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();
    }

    private void getHelp() {

        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.displayHelpMenuView();
    }

    private void loadGame() {

        LoadGameView loadGameView = new LoadGameView();

        loadGameView.displayLoadGameView();
    }

    private void getCrew() {
        PickCrewView pickCrewView = new PickCrewView();

        pickCrewView.display();
    }

    private void talkCrew() {
        TalkCrewView talkCrewView = new TalkCrewView();

        talkCrewView.displayTalkCrewView();

    }

    private void riddleSo() {
        RiddleSoView riddleSoView = new RiddleSoView();

        riddleSoView.displayRiddleSoView();
    }

    private void pickCrew() {
        PickCrewView pickCrewView = new PickCrewView();

        pickCrewView.display();
    }

    private void mapMenu() {
       MapMenuView mapMenuView = new MapMenuView() {};

        mapMenuView.display();
    }

    private void daemon() {
        DaemonView daemonView = new DaemonView();
        
        daemonView.display();
    }
}
