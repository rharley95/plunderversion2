/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

/**
 *
 * @author madug
 */
public class MainMenuView {
    
   public void displayMainMenuView(){
       boolean endView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                return;
            }
            endView = doAction(inputs);
            

        } while (endView != true);
   }

    private String[] getInputs() {
        System.out.println("Display message");
        
        String[]inputs = new String[1];
        inputs[0] = "testInput";
        
        return inputs;
    }
    

    private boolean doAction(String[] inputs) {
        System.out.println("Display message");
      
        
        System.out.println("***doAction() called ***");
        System.out.println("tinputs =" + inputs[0]);
        return true;
    }
}
