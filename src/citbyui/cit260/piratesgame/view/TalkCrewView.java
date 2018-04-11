/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import byui.cit260.piratesgame.control.SolveRiddle;
import java.util.Scanner;

/**
 *
 * @author madug
 */
public class TalkCrewView extends View{

    void displayTalkCrewView() {

         boolean endView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].length() < 1 || inputs[0].equals('Q')) {
                return;
            }
            endView = doAction(inputs);

        } while (endView != true);

    }
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {

            this.console.println("  H - Hank\n"
                    + "  B - Bo\n"
                    + "  Z – Zebra \n"
                    + "  T - Texas Pit\n"
                    + "  R - Restart game\n");

            Scanner userResponse = new Scanner(System.in);
            String response = userResponse.nextLine();
            String userInput = response.trim();

            if (userInput.length() < 1) {
                ErrorView.display(this.getClass().getName(),"You must select a valid initial for the Member you want help from.");
                continue;
            }

            inputs[0] = userInput;
            valid = true;
        }

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        switch (menuItem) {
            case "H":
                Hank();
                break;
            case "B":
                Bo();
                break;
            case "Z":
                Zebra();
                break;
            case "T":
                TexasPit();
                break;
            case "G":
                BacktoGame();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Please enter a valid option.");
        }

        return false;
    }

    private void Hank() {
        

//        protected String display message  = "Enter your guess ";
//        String[] inputs;
//
//        boolean done = false;
//        
//        String Value = this.get;
//
//            do {
//                Action(string[]
//            }  InputValues);
//
//            double solveRiddle = piratesgame.control
//                    inputValues[0]
//        
//            if (diameter < 10 || diameter > 50) {
//                return -1;
//            }
//
//            if (guess < 16 || guess > 79) {
//                return -2;
//            }
//        }
    }

       

    private void Bo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Zebra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void TexasPit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void BacktoGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    }

