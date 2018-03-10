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
class GameMenuView {
    public void displayGameMenuView() {
        
            boolean endView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endView = doAction(inputs);
            

        } while (endView != true);
    }

    private String[] getInputs() {
        System.out.println("You must enter non-blank value.");
        String[] inputs = new String[1];
        inputs[0] = "hi";
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("You must enter non-blank value.");
        System.out.println("\tinputs = " + inputs[0]);

        return true;
    }
    
    
    
}
