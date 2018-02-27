/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author rominapainter
 */
public class StartProgramView implements Serializable{

    public StartProgramView() {

    }
    
    private ArrayList<StartProgramView> inputs = new ArrayList<StartProgramView>();
    
    public void displayStartProgramView() {
        
           boolean endView = false;
           
            do {
                   String[] inputs = this.getInputs();
                   
            if (inputs[0].length() < 1 || inputs[0].equals('Q')){
                return;
               }
            endView = doAction(inputs);
            doAction(inputs);
            
            }
            while (endView != true);
    }

    private String[] getInputs() {
        

        String[] inputs = new String[1];
        System.out.println("banner message here");

        boolean valid = false;

        while (valid == false){

             System.out.println("Enter the player’s name");
             Scanner name = new Scanner(System.in);
             String playername = name.nextLine();
             String playertrim = playername.trim();
             
        if(playername.length() < 2 ){
            System.out.println("You must enter a better name.");
            continue;
        }
        
        inputs[0] = playertrim;
        valid = true;
        }

        return inputs;
        }


    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called****");
        System.out.println("\tinputs = " + inputs[0]);

        return true;
    }

}

 