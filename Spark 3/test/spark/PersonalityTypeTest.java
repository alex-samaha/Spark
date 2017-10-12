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
public class PersonalityTypeTest {
    
    public PersonalityTypeTest() {
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
     * Test of getName method, of class PersonalityType.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        PersonalityType instance = new PersonalityType("Jerk", "You are mean");
        String expResult = "Jerk";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class PersonalityType.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Meanie";
        PersonalityType instance = new PersonalityType("Jerk", "You are mean");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class PersonalityType.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        PersonalityType instance = new PersonalityType("Jerk", "You are mean");
        String expResult = "You are mean";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class PersonalityType.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "You are not nice";
        PersonalityType instance = new PersonalityType("Jerk", "You are mean");
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of typicalJob method, of class PersonalityType.
     */
    @Test
    public void testTypicalJob() {
        System.out.println("typicalJob");
        String thePT = "Nerd";
        PersonalityType instance = new PersonalityType("Nerd", "You are smart");
        String expResult = "Java Devloper";
        String result = instance.typicalJob(thePT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
