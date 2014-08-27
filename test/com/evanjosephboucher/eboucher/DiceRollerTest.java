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
public class DiceRollerTest {
    
    public DiceRollerTest() {
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

    @Test
    public void testRandomNumberGenerator() {
        int numberOfZeroes = 0;
        int numberOfOnes = 0;
        for (int i = 1; i < 10000; i ++) {
            int newRandomNumber = DiceRoller.randomNumberGenerator.nextInt(2);
            switch(newRandomNumber) {
                case 0: 
                    numberOfZeroes ++;
                    break;
                case 1:
                    numberOfOnes ++;
                    break;
                default:
                    fail("Generator is returning numbers outside expected range");
                    break;
            }
        }
        int differenceBetweenZeroesAndOnes = Math.abs(numberOfZeroes - numberOfOnes);
        if (differenceBetweenZeroesAndOnes > 100) {
            fail("Generator is not random enough: " + "Zeroes: " + numberOfZeroes + ", Ones: " + numberOfOnes);
        }
    }
}
