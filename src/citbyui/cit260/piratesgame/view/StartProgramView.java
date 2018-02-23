/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

/**
 *
 * @author rominapainter
 */
public class StartProgramView {
        
        public StartProgramView() {
            
}
        
        public void DisplayStartProgramView() {
//            endView = false
//            DO
//                    inputs = getInputs();
//            if (no inputs OR first input is "Q")
//                RETURN
//                endView = doAction(inputs)
//            WHILE endView != true
            String[] inputs = this.getInputs();
        }

    private String[] getInputs() {
        System.out.println("**** getInputs() called****"); 
        
        String[] inputs = new String[1];
        inputs[0] = "testInputs";
        
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called****"); 
        System.out.println("\tinputs = " + inputs[0]); 

        
        return true;
    }
        
            
}
