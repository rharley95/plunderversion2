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
 * @author madug
 */
public class SolveRiddleTest {
    
    public SolveRiddleTest() {
    }

    /**
     * Test of solveRiddle method, of class SolveRiddle.
     */
    @Test
    public void testSolveRiddle() throws GameControlException {
        
        System.out.println("solveRiddle");
        
        System.out.println("\tTest case 1");
        
        // inputs
        
        double diameter = 20.0;
        double guess = 31.0;
        
        SolveRiddle instance = new SolveRiddle();
        double expResult = 31.0;
        
        //call method
        
        double result = instance.solveRiddle(diameter, guess);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    
      
        System.out.println("\tTest case 2");
        
        // inputs
        
         diameter = 50.0;
         guess = 80.0;
       
         // EXPECTED RESULTS
         
         expResult = -2.0;
        
        //call method
        
         result = instance.solveRiddle(diameter, guess);
         
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 3");
        
        // inputs
        
         diameter = 50.0;
         guess = -5.0;
       
         // EXPECTED RESULTS
         
         expResult = -2.0;
        
        //call method
        
         result = instance.solveRiddle(diameter, guess);
         
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 4");
        
        // inputs
        
         diameter = -20.0;
         guess = 78.0;
       
         // EXPECTED RESULTS
         
         expResult = -1.0;
        
        //call method
        
         result = instance.solveRiddle(diameter, guess);
         
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 5");
        
        // inputs
        
         diameter = 55.0;
         guess = 78.0;
       
         // EXPECTED RESULTS
         
         expResult = -1.0;
        
        //call method
        
         result = instance.solveRiddle(diameter, guess);
         
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 6");
        
        // inputs
        
         diameter = 10.0;
         guess = 16.0;
       
         // EXPECTED RESULTS
         
         expResult = 16.0;
        
        //call method
        
         result = instance.solveRiddle(diameter, guess);
         
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 7");
        
        // inputs
        
         diameter = 50.0;
         guess = 79.0;
       
         // EXPECTED RESULTS
         
         expResult = 79.0;
        
        //call method
        
         result = instance.solveRiddle(diameter, guess);
         
        assertEquals(expResult, result, 0.0);
    }    
        
}
