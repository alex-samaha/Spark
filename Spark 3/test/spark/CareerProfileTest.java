/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class CareerProfileTest {
    
    public CareerProfileTest() {
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
     * Test of getChosenPersonality method, of class CareerProfile.
     */
    @Test
    public void testGetChosenPersonality() {
        System.out.println("getChosenPersonality");
        CareerProfile instance = new CareerProfile("Nerd", "I wanna pay you lots of money!");
        String expResult = "Nerd";
        String result = instance.getChosenPersonality();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setChosenPersonality method, of class CareerProfile.
     */
    @Test
    public void testSetChosenPersonality() {
        System.out.println("setChosenPersonality");
        String chosenPersonality = "Genius";
        CareerProfile instance = new CareerProfile("Nerd", "I wanna pay you lots of money!");
        instance.setChosenPersonality(chosenPersonality);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class CareerProfile.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        CareerProfile instance = new CareerProfile("Nerd", "I wanna pay you lots of money!");
        String expResult = "I wanna pay you lots of money!";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class CareerProfile.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "You will be my coding monkey";
        CareerProfile instance = new CareerProfile("Nerd", "I wanna pay you lots of money!");
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of personalityExist method, of class CareerProfile.
     */
    @Test
    public void testPersonalityExist() {
        System.out.println("personalityExist");
        CareerProfile instance = new CareerProfile("Nerd", "I wanna pay you lots of money!");
        boolean expResult = true;
        boolean result = instance.personalityExist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
