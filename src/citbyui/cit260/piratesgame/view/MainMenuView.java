/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.model.Game;
import byui.cit260.piratesgame.model.Player;
import java.util.Scanner;
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
                + "  P - Pick Crew member\n"
                + "  R - Riddle\n"
                + "  M - Map\n"
                + "  T- Talk to Crew Member\n"
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
                startNewGame();
                break;
            case "L":
                loadGame();
                break;
            case "H":
                getHelp();
                break;
            case "P":
                pickCrew();
                break;
            case "C":
                getCrew();
                break;
            case "R":
                riddleSo();
                break;
            case "T":
                talkCrew();
                break;
            case "M":
                mapMenu();
                break;

            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid option.");
        }

        return false;
    }

    private void startNewGame() {

        Game game = new Game();
        GameControl.createNewGame(PiratesGame.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.displayGameMenuView();
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
        MapMenuView mapMenuView = new MapMenuView();

        mapMenuView.display();
    }
}
