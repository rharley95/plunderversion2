/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260piratesgame.control;

/**
 *
 * @author madug
 */
public class CrewControl {
  
    public double catchCrewMemeber(double length,double height){

         if (length < 1 || length > 10){
         return -1;
        }


          if (height <1 || height > 10){
         return -2;  
         }


          double theorem = (length*length) + (height*height);

         double distance = Math.round(Math.sqrt(theorem));
         
       

         return distance;
    }
}
