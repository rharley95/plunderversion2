/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.GameControl;
import byui.cit260.piratesgame.exceptions.GameControlException;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class MainMenuView extends View {

    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" N - New Game\n"
                + "  L - Load Game\n"
                + "  H - Help\n"
                + "  S - Start Saved game\n"
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
                this.console.println(ex.getMessage());
            }
        }
                break;
            case "L":
                loadGame();
                break;
            case "H":
                getHelp();
            case "S":
                savedGame();    
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "Please enter a valid option.");
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

//    private void getCrew() {
//        PickCrewView pickCrewView = new PickCrewView();
//
//        pickCrewView.display();
//    }
//
//    private void talkCrew() {
//        TalkCrewView talkCrewView = new TalkCrewView() {};
//
//        talkCrewView.displayTalkCrewView();
//
//    }
//
//    private void riddleSo() {
//        RiddleSoView riddleSoView = new RiddleSoView() {};
//
//        riddleSoView.displayRiddleSoView();
//    }
//
//    private void pickCrew() {
//        PickCrewView pickCrewView = new PickCrewView();
//
//        pickCrewView.display();
//    }

//    private void mapMenu() {
//       MapMenuView mapMenuView = new MapMenuView() {};
//
//        mapMenuView.display();
//    }
//
//    private void boRiddle() {
//        BoRiddleView daemonView = new BoRiddleView();
//        
//        daemonView.display();
//    }

    private void savedGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
