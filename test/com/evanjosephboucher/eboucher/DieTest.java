/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.evanjosephboucher.eboucher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evan Boucher
 */
public class DieTest {
    
    public DieTest() {
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
     * Test of roll method, of class Die.
     */
    @Test
    public void testRolledValues() {
        Die test = Die.getDie(6);
        for (int i = 0; i < 1000; i ++) {
            test.roll();
            int current = test.getCurrentValue();
            if (current > 6 || current < 1) {
                fail("Returning value outside of expected range: " + current);
            }
        }
    }

    /**
     * Test of toString method, of class Die.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Die instance = Die.getDie(1);
        instance.setCurrentValue(2);
        String expResult = "2";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Die.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Die otherDie = Die.getDie(1);
        otherDie.setCurrentValue(2);
        Die instance = Die.getDie(1);
        instance.setCurrentValue(2);
        int expResult = 0;
        int result = instance.compareTo(otherDie);
        assertEquals(expResult, result);
    }
    
}
