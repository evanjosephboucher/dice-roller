/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.evanjosephboucher.eboucher;

import java.util.Random;

/**
 *
 * @author Evan Boucher
 */
public class DiceRoller {
    
    public static Random randomNumberGenerator = new Random(System.currentTimeMillis());
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiceSet testDiceSet = DiceSet.getDiceSet(5, 6, 1);
        System.out.println(testDiceSet.toString());
    }
    
}
