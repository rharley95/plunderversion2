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
    
    public void displayStartProgramView() {
           boolean endView = false;
            do {
                   String[] inputs = getInputs();
           if (inputs[].length < 1 || inputs[0] == "Q")
           {
                return endView = doAction(inputs);
               }
            while (endView != true);
    
    getInputs(): String[] {

 inputs = new String array one element long
 Display the welcome banner

valid = false
WHILE valid == false (while input value is not valid)

Display the prompt message, "Enter the player’s name"
Get the value entered from the keyboard
Trim off leading and trailing blanks from the value
IF length of the value < 2 then
Display "You must enter a value.”
Continue (move to the top of the loop and repeat)
ENDIF
Assign the value to the first position in the inputs array
valid = true
ENDWHILE

RETURN inputs
}
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

    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
