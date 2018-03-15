/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260piratesgame.control;

import byui.cit260.piratesgame.control.CrewControl;
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
     * Test of catchCrewMember method, of class CrewControl.
     */
    @Test
    public void testCatchCrewMemeber() {
        System.out.println("catchCrewMemeber");
        
        //-testcase--
        
        System.out.println("\tTest case 1");
        
           //input variables     

        
        double length = 11.0;
        double height = 5.0;
        
        CrewControl instance = new CrewControl();
        double expResult = 12;
        
        // call method
        double result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
       
         System.out.println("\tTest case 2");
        
           //input variables     

        
         length = -2;
         height = 10;
        
       
         expResult = -1;
        
        // call method
         result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
                

         //-testcase--
        
        System.out.println("\tTest case 3");
        
           //input variables     

        
         length = 11.0;
         height = -4;
        
      
         expResult = -2;
        
        // call method
        result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("\tTest case 4");
        
           //input variables     

        
         length = 17.0;
         height = 9;
        
      
         expResult = -1;
        
        // call method
        result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 5");
        
           //input variables     

        
         length = 1;
         height = 10;
        
      
         expResult = 10;
        
        // call method
        result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 6");
        
           //input variables     

        
         length = 11.0;
         height = 1;
        
      
         expResult = 11;
        
        // call method
        result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case 7");
        
           //input variables     

        
         length = 11.0;
         height = 10;
        
      
         expResult = 15;
        
        // call method
        result = instance.catchCrewMember(length, height);
        
        //test results
        
        assertEquals(expResult, result, 0.0);
   
    }
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     