/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260piratesgame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author madug
 */
public class CrewControlTest {
    
    public CrewControlTest() {
    }

    /**
     * Test of catchCrewMemeber method, of class CrewControl.
     */
    @Test
    public void testCatchCrewMemeber() {
        System.out.println("catchCrewMemeber");
        
        //-testcase--
        
        System.out.println("\tTest case 1");
        
           //input variables     

        
        double length = 9.0;
        double height = 5.0;
        
        CrewControl instance = new CrewControl();
        double expResult = 10;
        
        // call method
        double result = instance.catchCrewMemeber(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
        
    }
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     