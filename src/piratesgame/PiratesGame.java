/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesgame;


import byui.cit260.piratesgame.model.*;
import citbyui.cit260.piratesgame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author rominapainter
 */



public class PiratesGame {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    private static BufferedReader input;
    private static PrintWriter output;
    
    
    public static void main(String[] args) {

       try {
        input = new BufferedReader(new InputStreamReader(System.in));
        output = new PrintWriter(System.out, true);
        logFile = new PrintWriter("logFile.txt");
           
           
       PiratesGame.inFile =
               new BufferedReader(new InputStreamReader(System.in));
       PiratesGame.outFile = new PrintWriter(System.out, true);

       
       
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.display();
       
       return; 
       } catch (Throwable e){
       System.out.println("Exception: " + e.toString() +
               "\nCause: " + e.getCause() +
               "\nMessage: " + e.getMessage());
       
             e.printStackTrace();;
       
       } finally{
           
           try{
               
            if (input != null){
                input.close();
            }
            
            if (output != null){
                output.close();
            }
               
            if (logFile != null){
           logFile.close();
           }
            
           } catch(IOException ex){
               System.console().printf("%s%s", "Error closing the input/output files.");
               return;
           }
           
           try {
               PiratesGame.inFile.close();
           }
    catch (IOException ex) {
               System.out.println("Error processing game at the moment.");
               return;
           }
       PiratesGame.outFile.close();
       }
       
       
       
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PiratesGame.logFile = logFile;
    }
    
    

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PiratesGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PiratesGame.inFile = inFile;
    }
    
  
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PiratesGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PiratesGame.player = player;
    }
    
}
