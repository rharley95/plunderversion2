/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.exceptions.NumberFormatException;

/**
 *
 * @author madug
 */
public class CrewControl {
  
    public static double catchCrewMember(double length,double height)throws NumberFormatException{

         if (length < 1 || length > 11){
          throw new NumberFormatException("Not right! Try another length!");
        }


          if (height <1 || height > 11){
          throw new NumberFormatException("If I were you I would try another height number there.");  
         }


          double theorem = (length*length) + (height*height);

         double distance = Math.round(Math.sqrt(theorem));
         
       

         return distance;
    }
}
