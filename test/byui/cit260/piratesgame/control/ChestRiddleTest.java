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
public class ChestRiddleTest {
    
    public ChestRiddleTest() {
    }

    /**
     * Test of chestRiddle method, of class ChestRiddle.
     */
    @Test
    public void testChestRiddle() {
        System.out.println("chestRiddle");
        double width = 10;
        double length = 30;
        double height = 20;
        ChestRiddle instance = new ChestRiddle();
        double expResult = 6000;
        double result = instance.chestRiddle(volume, answer);
        assertEquals(expResult, result, 6000);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
