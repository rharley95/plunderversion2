/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

/**
 *
 * @author rominapainter
 * Individual assignment from romina number 12.
 */
public class PrintingReport extends View{

    @Override
    public String[] getInputs() {
         String [] inputs = new String[1];       
        this.console.println("\nPrints the list of locations.");

      String playerinput = this.getInput("\n\nEnter the file Path for the file you want to print");
           inputs[0] = playerinput;
       
       return inputs;   
    }

    @Override
    public boolean doAction(String[] inputs) {
        
         String filePath = inputs[0];
         
         
     
         this.console.println("Your report is printed!");
        return true;
    }
    
}
