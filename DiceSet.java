/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.evanjosephboucher.eboucher;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Evan Boucher
 */
public class DiceSet {
    private int numberOfDice;
    private int facesPerDie;
    private int constant;
    private int totalValue;
    private ArrayList<Die> dice;
    
    
    // Constructor
    private DiceSet(int numberOfDice, int facesPerDie, int constant) {
        this.numberOfDice = numberOfDice;
        this.facesPerDie = facesPerDie;
        this.constant = constant;
        this.dice = new ArrayList<>(numberOfDice);
        for (int i = 0; i < numberOfDice; i ++) {
            this.dice.add(Die.getDie(facesPerDie));
        }
    }
    
    public static DiceSet getDiceSet(int numberOfDice, int facesPerDie, int constant) {
        DiceSet newDiceSet = new DiceSet(numberOfDice, facesPerDie, constant);
        newDiceSet.calculateTotal();
        return newDiceSet;
    }
    
    public void rollAllDice() {
        getDice().stream().forEach((aDie) -> {
            aDie.roll();
        });
    }
    
    // Sorts the dice from lowest to highest.
    public void sortDice() {
        Collections.sort(dice);
    }
    
    // Calculates the total of all dice plus the constant
    public void calculateTotal() {
        int result = 0;
        result = getDice().stream().map((aDie) -> aDie.getCurrentValue()).reduce(result, Integer::sum);
        result += this.getConstant();
        this.totalValue = result;
    }
    
    @Override
    public String toString() {
        return (Integer.toString(this.numberOfDice) + "d" + Integer.toString(this.facesPerDie) + " + " + Integer.toString(this.constant) + " = " + Integer.toString(this.totalValue));
    }
    
    /**
     * @return the numberOfDice
     */
    public int getNumberOfDice() {
        return numberOfDice;
    }

    /**
     * @param numberOfDice the numberOfDice to set
     */
    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    /**
     * @return the facesPerDie
     */
    public int getFacesPerDie() {
        return facesPerDie;
    }

    /**
     * @param facesPerDie the facesPerDie to set
     */
    public void setFacesPerDie(int facesPerDie) {
        this.facesPerDie = facesPerDie;
    }

    /**
     * @return the constant
     */
    public int getConstant() {
        return constant;
    }

    /**
     * @param constant the constant to set
     */
    public void setConstant(int constant) {
        this.constant = constant;
    }

    /**
     * @return the totalValue
     */
    public int getTotalValue() {
        return totalValue;
    }

    /**
     * @param totalValue the totalValue to set
     */
    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * @return the dice
     */
    public ArrayList<Die> getDice() {
        return dice;
    }

    /**
     * @param Dice the dice to set
     */
    public void setDice(ArrayList<Die> Dice) {
        this.dice = Dice;
    }

}
