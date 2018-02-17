/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesgame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rominapainter
 */
public class SolveRiddleTest {
    
    public SolveRiddleTest() {
    }

    /**
     * Test of solveRiddle method, of class SolveRiddle.
     */
    @Test
    public void testSolveRiddle() {
        System.out.println("solveRiddle");
        double diameter = 0.0;
        double guess = 0.0;
        SolveRiddle instance = new SolveRiddle();
        double expResult = 0.0;
        double result = instance.solveRiddle(diameter, guess);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
