/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.SolveRiddle;
import byui.cit260.piratesgame.exceptions.GameControlException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author madug
 */
public  class RiddleSoView extends View{

    /**
     *
    
     */
    public void displayRiddleSoView() throws GameControlException {
        boolean endView = false;

        do {
            try {
                String[] inputs = this.getInputs();
                
                if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                    return;
                }
                endView = doAction(inputs);
            } catch (NumberFormatException ex) {
                this.console.println(ex.getMessage());
            }

        } while (endView != true);
        
        
    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[2];

        boolean valid = false;
        while (valid == false) {
            
            Random rand = new Random();
            int value = rand.nextInt(51);
            this.console.println(" I was thrown off the ship\n"
                    + " in a circular motion thrown over a diameter of " + value +"m.\n"
                    + " Find the distance over the circle \n"
                    + "and fast\n");

            Scanner userResponse = new Scanner(System.in);

            String response = userResponse.nextLine();
            String UserInputs;
            UserInputs = response.trim();
            inputs[0] = UserInputs;
            
            inputs[1] = Integer.toString(value);
            return inputs;

        }
        return null;

    }

    /**
     *
     * @param inputs
     * @return 

     */
    @Override
    public boolean doAction (String[] inputs)throws NumberFormatException{
        
        double userResponse = Double.parseDouble(inputs[0]);
        
        double response = userResponse;
        try {
            response = SolveRiddle.solveRiddle(25, response);
        } catch (NumberFormatException ex) {
              ErrorView.display(this.getClass().getName(),"You need to give the right answer to move on");
        } catch (GameControlException ex) {
             ErrorView.display(this.getClass().getName(),"You need to give the right answer to move on");
    
        double diameter = Double.parseDouble(inputs[1]);
                
        if  (response < 16 || response > 79) {
        

              ErrorView.display(this.getClass().getName(),"You are speaking in an unknown language");
              return false;
                    
        } 
        
        else if(diameter < 10 || diameter > 50) {
           
            ErrorView.display(this.getClass().getName(),"I am dumb");
            return false;  
        }
        else return true;
    }
        return false;


    }

}
      

        

  