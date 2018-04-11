/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesgame.view;

import java.io.PrintWriter;
import piratesgame.PiratesGame;

/**
 *
 * @author madug
 */
public class ErrorView {
    private static PrintWriter console = PiratesGame.getOutFile();
    private static PrintWriter log = PiratesGame.getLogFile();
    
    public static void display(String className,String errorMessage) {
        console.println(
        "\n-- ERROR----------------------------------------------"
        +"\n" + errorMessage
        +"\n-----------------------------------------------------");
        
        log.printf("%n%n%s",className + " - " + errorMessage);
    }
}
