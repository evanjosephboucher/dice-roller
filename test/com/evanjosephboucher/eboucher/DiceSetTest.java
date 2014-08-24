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
public class DiceSetTest {
    
    public DiceSetTest() {
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
     * Test of calculateTotal method, of class DiceSet.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        DiceSet instance = DiceSet.getDiceSet(1, 1, 5);
        instance.calculateTotal();
        int expResult = 6;
        assertEquals(expResult, instance.getTotalValue());
    }

    /**
     * Test of toString method, of class DiceSet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DiceSet instance = DiceSet.getDiceSet(1, 1, 5);
        String expResult = "1d1 + 5 = 6";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
