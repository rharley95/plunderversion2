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
public class ZebraRiddle {
    public String zebraRiddle(String riddle, String userAnswer) throws GameControlException{
      
       String answer = "fish";
       
        if (userAnswer != answer) {
            throw new GameControlException("That seems to be the wrong answer! Try a new answer! So easy!");
        }
         
        String celebration = "Good Job!!";
        riddle = "....What is 2 + 2....";


        if (userAnswer == answer) {

            return answer;

         }
      return answer;

     }
}
