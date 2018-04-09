/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.model.Actor;
import byui.cit260.piratesgame.model.Location;
import byui.cit260.piratesgame.model.Player;
import byui.cit260.piratesgame.control.MapControl;
import byui.cit260.piratesgame.exceptions.MapControlException;
import byui.cit260.piratesgame.model.RegularScene;
import java.awt.Point;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public abstract class MoveActorView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        System.out.println("Move the actor to your choice of location");

        System.out.println("N - Move North\n"
                + "S - Move South\n"
                + "E - Move East\n"
                + "W - Move West\n"
                + "Q - Quit\n");

        String direction = this.getInput("Enter a direction");
        inputs[0] = direction;

        return inputs;
    }

    @Override
    //it was private at first
    public boolean doAction(String[] inputs) {
// row = get first value in inputs array

        @SuppressWarnings("UnusedAssignment")
        int newRow = 0;
        int newColumn = 0;

        Point oldCoordinates = PiratesGame.getPlayer().getActor().getCoordinates();

        int oldRow = oldCoordinates.x;
        int oldColumn = oldCoordinates.y;

        switch (inputs[0]) {
            case "N":
                newRow = oldRow;
                newColumn = oldColumn - 1;
                break;
            case "S":
                newRow = oldRow;
                newColumn = oldColumn + 1;
                break;
            case "E":
                newColumn = oldColumn;
                newRow = oldRow + 1;
                break;
            case "W":
                newColumn = oldColumn;
                newRow = oldRow - 1;
                break;
            case "Q":
                return true;
            default:
                System.out.println("Please enter a valid option.");
                return false;
        }

        Player player = PiratesGame.getPlayer();
        Actor actor = player.getActor();

        try {
            Location newLocation = MapControl.moveActor(actor, newRow, newColumn);
            // print out location and descript of scene in new location
            System.out.println("\n You moved to row," + newRow + " column, " + newColumn + "\n");
            System.out.println(newLocation.getScene().getDescription());
        } catch (MapControlException cause) {
            System.out.println(cause.getMessage());
            return false;
        }

        return true;
    }

}
