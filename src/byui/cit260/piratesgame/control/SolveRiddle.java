/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

/**
 *
 * @author madug
 */
public class SolveRiddle {

    public double solveRiddle(double diameter, double guess) {
        if (diameter < 10 || diameter > 50) {
            return -1;
        }

        if (guess < 16 || guess > 79) {
            return -2;
        }

        double theorem = (Math.PI * diameter) / 2;

        double distance = Math.round(theorem);

        if (guess == distance) {

            return distance;

         }
        return 0;
     }
}   