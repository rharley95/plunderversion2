/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

/**
 *
 * @author rominapainter
 */
public abstract class HankRiddleView extends View{
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("riddle goes here");


        String userInput = this.getInput("You must enter non-blank value.");

        inputs[0] = userInput;

        return inputs;

    }
    
      @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
//        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "M":
                this.displayMap();
                break;
            case "L":
                loadGame();
                break;
            case "H":
                helpMenu();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid option.");
        }

        return false;
    }

    private void loadGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
