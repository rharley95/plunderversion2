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
public class CrewControl {
  
    public double catchCrewMemeber(double length,double height){

         if (length < 1 || length > 11){
         return -1;
        }


          if (height <1 || height > 11){
         return -2;  
         }


          double theorem = (length*length) + (height*height);

         double distance = Math.round(Math.sqrt(theorem));
         
       

         return distance;
    }
}
