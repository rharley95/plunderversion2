/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import byui.cit260.piratesgame.exceptions.GameControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rominapainter
 */
public class TexasRiddleTest {
    
    public TexasRiddleTest() {
    }

    /**
     * Test of TexasRiddle method, of class TexasRiddle.
     */
    @Test
    public void testTexasRiddle() throws GameControlException {
        System.out.println("TexasRiddle");
        double answer = 6000;
        TexasRiddle instance = new TexasRiddle();
        double expResult = 6000;
        double result = instance.TexasRiddle(answer);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of TexasRiddle method, of class TexasRiddle.
     */
    @Test
    public void testTexasRiddleTwo() throws GameControlException {
        System.out.println("TexasRiddle");
        double answer = 6001;
        TexasRiddle instance = new TexasRiddle();
        double expResult = -1;
        double result = instance.TexasRiddle(answer);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     @Test
    public void testTexasRiddleThree() throws GameControlException {
        System.out.println("TexasRiddle");
        double answer = 5999;
        TexasRiddle instance = new TexasRiddle();
        double expResult = -1;
        double result = instance.TexasRiddle(answer);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
