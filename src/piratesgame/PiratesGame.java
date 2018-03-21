/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesgame;


import byui.cit260.piratesgame.model.*;
import citbyui.cit260.piratesgame.view.StartProgramView;



/**
 *
 * @author rominapainter
 */



public class PiratesGame {

    private static Game currentGame = null;
    private static Player player = null;
    
    
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.display();
       
       
    }
    
  
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PiratesGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PiratesGame.player = player;
    }
    
}
