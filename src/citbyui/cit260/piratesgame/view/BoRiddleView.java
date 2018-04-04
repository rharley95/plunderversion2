/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;
import byui.cit260.piratesgame.control.CrewControl;
import byui.cit260.piratesgame.exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author madug
 */
public class BoRiddleView extends View {

    @Override
    public String[] getInputs() {
        
       String[] inputs = new String[2];
       
       System.out.println("This is a value with two inputs");
       String Value = this.getInput("Enter the length");
        if (Value.trim().toUpperCase().equals("Q")) {
            return inputs;
        }
        String height = this.getInput("Enter the height");
        if (height.trim().toUpperCase().equals("Q")) {
            return inputs;
                }
        return inputs;
    }
    
        
    @Override
    public boolean doAction(String[] inputs) {
        
        //call the two inputs
       
      double length = Double.parseDouble(inputs[0]); 
      double height = Double.parseDouble(inputs[1]);
      
      //call control method
      
     double distance = 0;
        try {
            distance = CrewControl.catchCrewMember(length, height);
            
        } catch (byui.cit260.piratesgame.exceptions.NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
      if (distance == -1){
      System.out.println("Invalid length");
       return false;}
       if (distance == -2){
      System.out.println("Invalid height");
       return false;
       }else
            {System.out.println("You are succesfull");
                return true;
            }
           
    }
               
       }  
    
