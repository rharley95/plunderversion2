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
import byui.cit260.piratesgame.exceptions.MapControlException;
import java.util.Scanner;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public abstract class MoveActorView extends View {

    public String getInputs(String promptMessage) {

//        String[] inputs = new String[3];
//        Print instructions to move an actor
//        System.out.println("Move the actor");
//        System.out.println("promptMessage");
        String[] input = new String[3];
        System.out.println("Move the actor to your choice of location");

        boolean valid = false;
        while (valid == false) {

            System.out.println("N - Move North\n"
                    + "S - Move South\n"
                    + "E - Move East\n"
                    + "W - Move West\n");
            Scanner userResponse = new Scanner(System.in);

            String response = userResponse.nextLine();
            String userInput = response.trim();

            if (userInput.length() < 1) {
                System.out.println("You must enter non-blank value.");
                continue;
            }

            input[0] = userInput;
            valid = true;
        }

        return input[0];
    }

    @Override
    //it was private at first
    public boolean doAction(String[] inputs) {
// row = get first value in inputs array

        String row = inputs[0];
        String column = inputs[1];

        try {
            int intRow = Integer.parseInt(row);
            int intColumn = Integer.parseInt(column);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

        Player player = PiratesGame.getPlayer();
        Actor actor = player.getActor();

        try {
            Location newLocation = moveActor(actor, row, column);
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        System.out.println("Description of this scene goes here");
        return true;
    }
}
