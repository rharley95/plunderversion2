/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.SolveRiddle;
import byui.cit260.piratesgame.exceptions.GameControlException;
import byui.cit260.piratesgame.exceptions.NumberFormatException;
import java.util.Random;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author madug
 */
public class RiddleSoView {

    /**
     *
     */
    public void displayRiddleSoView() {
        boolean endView = false;

        do {
            try {
                String[] inputs = this.getInputs();
                
                if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                    return;
                }
                endView = doAction(inputs);
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }

        } while (endView != true);
        
        
    }

    private String[] getInputs() {

        String[] inputs = new String[2];

        boolean valid = false;
        while (valid == false) {
            
            Random rand = new Random();
            int value = rand.nextInt(51);
            System.out.println(" I was thrown off the ship\n"
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

    private boolean doAction(String[] inputs) throws NumberFormatException {
        double userResponse = Double.parseDouble(inputs[0]);
        
        double response = 0;
        response = SolveRiddle.solveRiddle(25, userResponse );
    
        double diameter = Double.parseDouble(inputs[1]);
                
        if  (response < 16 || response > 79) {
        

              System.out.println("You are speaking in an unknown language");
              return false;
                    
        } 
        
        else if(diameter < 10 || diameter > 50) {
           
            System.out.println("I am dumb");
            return false;  
        }
        else return true;
    }




}
      

        

  