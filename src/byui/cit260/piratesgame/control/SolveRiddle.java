/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.exceptions.GameControlException;

/**
 *
 * @author madug
 */
public class SolveRiddle {

    public static double solveRiddle(double diameter, double guess) throws GameControlException{
        if (diameter < 10 || diameter > 50) {
             throw new GameControlException("That diameter seems to be wrong, try again!");
        }

        if (guess < 16 || guess > 79) {
             throw new GameControlException("Try another guess, mate!");
        }

        double theorem = (Math.PI * diameter) / 2;

        double distance = Math.round(theorem);

        if (guess == distance) {

            return distance;

         }
        return 0;
     }
}   