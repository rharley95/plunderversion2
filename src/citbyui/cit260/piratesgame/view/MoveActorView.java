/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.model.Actor;
import byui.cit260.piratesgame.model.Player;
import java.util.Scanner;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public abstract class MoveActorView extends View {

    public String getInputs(String promptMessage) {
       
        String[] inputs = new String[4];

//        Print instructions to move an actor
        System.out.println("Move the actor");

//        System.out.println("promptMessage");

        String[] input = new String[1];

        boolean valid = false;
        while (valid == false) {

            System.out.println("N,S,E,W");
            Scanner userResponse  = new Scanner(System.in);

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
}

//    @Override
//    public boolean doAction(String[] inputs) {
//       //        get first value in inputs array
//
//        String row = inputs[0];
////      get second value in inputs array
//        String column = inputs[1];
//       
//        try {
//            Integer parseInt = Integer.parseInt(inputs);
//        } catch   NumberFormatException {
//       System.out.Println("The row and column must be a number");
//                       
//                    }
//        return false;
//        }
//        Player player = PiratesGame.getPlayer();
//         Actor actor = Player.getActor();
//
//        try {
//            newLocation = moveActor(actor, direction);
//        } catch  MapControlException { 
//            
//         System.out.Println("error passed with the exception");
//                        
//         return false;
////   the description of the scene A the newLocation
//        System.out.Println("");
//
//        return true;
//                    }
//        }
//        
//
//    
//    
