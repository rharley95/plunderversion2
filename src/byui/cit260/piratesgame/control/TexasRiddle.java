/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

/**
 *
 * @author rominapainter
 */
public class TexasRiddle {
    public double TexasRiddle(double answer){

          if (answer != 6000){
         return -1;
        }
          
          double width = 10;
          double length = 30;
          double height = 20;
          
          
          double volume = width * length * height;

          
         if (answer == volume) {

            return answer;

         }
         
        return answer;
         
}
}
