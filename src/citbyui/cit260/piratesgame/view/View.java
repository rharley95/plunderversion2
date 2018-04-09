/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesgame.PiratesGame;

/**
 *
 * @author rominapainter
 */
public abstract class View implements ViewInterface{
    
    private String message;
    protected final BufferedReader keyboard = PiratesGame.getInFile();
    protected final PrintWriter console = PiratesGame.getOutFile();
    
    
    public View(){
    }
    
    @Override
    public void display(){
              boolean endView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endView = doAction(inputs);

        } while (endView != true);
    }
    
    ///ask about public or private
     @Override
        public String getInput(String promptMessage){
//        System.out.println("promptMessage");

        String[] input = new String[1];

        boolean valid = false;
        while (valid == false) {

            System.out.println(promptMessage);

            String response = null;
            try {
                response = this.keyboard.readLine();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            String userInput = response.trim();

            if (userInput.length() < 1) {
                System.out.println("You must enter non-blank value.");
                continue;
            }

            input[0] = userInput;
            valid = true;
        }

        return input[0];

    }
        
}
