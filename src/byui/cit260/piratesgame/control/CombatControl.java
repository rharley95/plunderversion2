/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.exceptions.GameControlException;

/**
 *
 * @author rominapainter
 */
public class CombatControl {
  public String monsterRiddle(String riddle, String userAnswer) throws GameControlException{
      
       String answer = "river";
       
        if (userAnswer != answer) {
            throw new GameControlException("That seems to be the wrong answer! Try a new answer! So easy!");
        }
         
        String celebration = "Good Job!!";
        riddle = "What has a bed but doesn’t sleep and a mouth but never eats?";


        if (userAnswer == answer) {

            return answer;

         }
      return answer;

     }
}
