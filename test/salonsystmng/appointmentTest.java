/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonsystmng;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class appointmentTest {
    
    public appointmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkService method, of class appointment.
     */
    @Test
    public void testCheckService() {
        System.out.println("checkService");
        int i = 15;
        appointment instance = new appointment("9-jan",  new customer("assma", "omar", "88712354", "rhf766", "rhf@gmail.com", "0531761744"));
        
        boolean result = instance.checkService(i);
       assertFalse(result);
    }

    /**
     * Test of getService method, of class appointment.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        appointment instance = null;
        instance.getService();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of availableDate method, of class appointment.
     */
    @Test
    public void testAvailableDate() {
        System.out.println("availableDate");
        appointment instance = null;
        instance.availableDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serviecesList method, of class appointment.
     */
    @Test
    public void testServiecesList() {
        System.out.println("serviecesList");
        appointment instance = null;
        instance.serviecesList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayBill method, of class appointment.
     */
    @Test
    public void testDisplayBill() {
        System.out.println("displayBill");
        user cust = null;
        appointment instance = new appointment("3", new customer("rahaf", "khaled", "1906766", "rhf766", "rhf@gmail.com", "0501456783"));
        instance.displayBill( new customer("rahaf", "khaled", "1906766", "rhf766", "rhf@gmail.com", "0501456783"));
        
    }
    
}
