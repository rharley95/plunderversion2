/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.exceptions;

/**
 *
 * @author madug
 */
public class CrewControlException extends Exception{ 

    public CrewControlException() {
    }

    public CrewControlException(String string) {
        super(string);
    }

    public CrewControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CrewControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CrewControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
