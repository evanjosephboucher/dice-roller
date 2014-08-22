/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.evanjosephboucher.eboucher;

/**
 *
 * @author Evan Boucher
 */
public class Die implements Comparable<Die> {
    
    private int numberOfFaces;
    private int currentValue;
   
    // Constructor
    private Die(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }
    
    public static Die getDie(int numberOfFaces) {
        Die newDie = new Die(numberOfFaces);
        newDie.roll();
        return newDie;
    }
    
    // Rolls this die.
    public void roll() {
        this.currentValue = DiceRoller.randomNumberGenerator.nextInt((this.getNumberOfFaces() + 1));
    }

    /**
     * @return the numberOfFaces
     */
    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    /**
     * @param numberOfFaces the numberOfFaces to set
     */
    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    /**
     * @return the currentValue
     */
    public int getCurrentValue() {
        return currentValue;
    }

    /**
     * @param currentValue the currentValue to set
     */
    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }
    
    @Override
    public String toString() {
        return Integer.toString(currentValue);
    }

    @Override
    public int compareTo(Die otherDie) {
        int facesDifference = this.getNumberOfFaces() - otherDie.getNumberOfFaces();
        if (facesDifference != 0) {
            return facesDifference;
        }
        else {
            int valuesDifference = this.getCurrentValue() - otherDie.getCurrentValue();
            return valuesDifference;
        }
    }
}
