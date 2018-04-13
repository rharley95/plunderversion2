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
public abstract class CombatView extends View {
    
    
        @Override
        public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println(" R - Read Enemy\n"
                + "  A - Attack Enemy\n"
                + "  T - Talk to Crew Member\n"
                + "E - Escape Monster/Come back later"
                + "  Q - Quit Program");

        String userInput = this.getInput("You must enter non-blank value.");

        inputs[0] = userInput;

        return inputs;

    }
        
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "R":
                readEnemy();
                break;
            case "A":
                attackEnemy();
                break;
            case "T":
                askCrew();
                break;
            case "E":
                escapeAttack();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Please enter a valid pirate option.");
        }

        return false;
    }

    private void attackEnemy() {
        this.console.println("You have attacked the enemy! They lose 2 points");
    }

    private void readEnemy() {
        this.console.println("This enemy is HUGE, take a look at those tentacles and beak!");
    }

    private void askCrew() {
       PickCrewView pickCrewView = new PickCrewView();

        pickCrewView.display();
    }

    private void escapeAttack() {
        this.console.println("Maybe we don't want to fight today...");
    }
    
        
        
}
