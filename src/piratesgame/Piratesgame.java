/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesgame;


import byui.cit260.piratesgame.model.Player;
import byui.cit260.piratesgame.model.Actor;

import java.awt.Point;

/**
 *
 * @author rominapainter
 */
public class Piratesgame {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Kekeli");
        playerOne.setBestTime(8.00);
        playerOne.setRole("Main Character");
        String actorName = Actor.eric.getName();
        String actorDescription = Actor.eric.getDescription();
        Point actorCoordinates = Actor.eric.getCoordinates();
        
        System.out.println("Name = " + actorName + " Description = " + actorDescription + " Coordinates = " + actorCoordinates);
        
        String playerOneName = playerOne.getName();
        double playerOneBestTime = playerOne.getBestTime();
        String playerOneRole = playerOne.getRole();

       
        System.out.println("Name = " + playerOneName +
                       ", time = " + playerOneBestTime + ", role =" + playerOneRole);
    }
    
}
