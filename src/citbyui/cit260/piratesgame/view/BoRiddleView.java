/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;
import byui.cit260.piratesgame.control.CrewControl;
import byui.cit260.piratesgame.exceptions.NumberFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author madug
 */
public abstract class BoRiddleView extends View {

    @Override
    public String[] getInputs() {
        
       String[] inputs = new String[2];
       
       this.console.println("This is a value with two inputs");
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
     distance = CrewControl.catchCrewMember(length, height);
      if (distance == -1){
      ErrorView.display(this.getClass().getName(),
              "Invalid length");
       return false;
      }
       if (distance == -2){
     ErrorView.display(this.getClass().getName(),
             "Invalid height");
       return false;
       }else
            {this.console.println("You are succesfull");
                return true;
            }
           
    }
               
       }  
    
