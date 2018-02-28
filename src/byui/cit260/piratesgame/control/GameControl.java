/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.model.Player;
import java.io.Serializable;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class GameControl implements Serializable{
    
    public static Player savePlayer(String name){
        Player player = new Player();
        player.setName(name);
        PiratesGame.setPlayer(player);
        
      if (name== null  ){
         return null;
      }
      
      player = new Player();
      return player;
    }
    
    
    
    
}
