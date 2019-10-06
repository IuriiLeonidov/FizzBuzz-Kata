package com.example.android.fizzbuzzkata;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    /**********************************************************************
     ******************** isNumberADivisibleByNumberB ********************
     *********************************************************************/

    @Test
    public void negativeDivisibleByNegativeReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(-1, -1));
    }

    @Test
    public void negativeDivisibleByPositiveReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(-1, 1));
    }

    @Test
    public void zeroDivisibleByNegativeReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(0, -1));
    }

    @Test
    public void zeroDivisibleByPositiveReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(0, 1));
    }

    @Test
    public void positiveDivisibleByNegativeReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(1, -1));
    }

    @Test
    public void positiveDivisibleByZeroReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(1, 0));
    }

    @Test
    public void numberDivisibleByOneReturnsTrue() {
        assertTrue(Utilities.isNumberADivisibleByNumberB(1, 1));
    }

    @Test
    public void numberNotDivisibleByOtherNumberReturnsFalse() {
        assertFalse(Utilities.isNumberADivisibleByNumberB(3, 2));
    }

    @Test
    public void numberDivisibleByOtherNumberReturnsTrue() {
        assertTrue(Utilities.isNumberADivisibleByNumberB(3, 3));
    }

    /**********************************************************************
     ************************* isDivisibleByThree *************************
     *********************************************************************/

    @Test
    public void oneDivisibleByThreeReturnsFalse() {
        assertFalse(Utilities.isDivisibleByThree(1));
    }

    @Test
    public void threeDivisibleByThreeReturnsTrue() {
        assertTrue(Utilities.isDivisibleByThree(3));
    }

    /**********************************************************************
     ************************* isDivisibleByFive *************************
     *********************************************************************/

    @Test
    public void oneDivisibleByFiveReturnsFalse() {
        assertFalse(Utilities.isDivisibleByFive(1));
    }

    @Test
    public void fiveDivisibleByFiveReturnsTrue() {
        assertTrue(Utilities.isDivisibleByFive(5));
    }

    /**********************************************************************
     ********************* doesNumberAContainNumberB *********************
     *********************************************************************/

    @Test
    public void numberContainsOtherIdenticalNumberReturnsTrue() {
        assertTrue(Utilities.doesNumberAContainNumberB(1, 1));
    }

    @Test
    public void numberContainsOtherMultiDigitNumberAtTheStartReturnsTrue() {
        assertTrue(Utilities.doesNumberAContainNumberB(12345, 123));
    }

    @Test
    public void numberContainsOtherMultiDigitNumberInTheMiddleReturnsTrue() {
        assertTrue(Utilities.doesNumberAContainNumberB(12345, 234));
    }

    @Test
    public void numberContainsOtherMultiDigitNumberAtTheEndReturnsTrue() {
        assertTrue(Utilities.doesNumberAContainNumberB(12345, 345));
    }

    @Test
    public void numberDoesNotContainOtherNumberReturnsFalse() {
        assertFalse(Utilities.doesNumberAContainNumberB(1, 2));
    }

    /**********************************************************************
     **************************** hasThreeInIt ****************************
     *********************************************************************/

    @Test
    public void numberDoesNotHaveThreeInItReturnsFalse() {
        assertFalse(Utilities.hasThreeInIt(1111));
    }

    @Test
    public void numberHasThreeInItReturnsTrue() {
        assertTrue(Utilities.hasThreeInIt(1133311));
    }

    /**********************************************************************
     ***************************** hasFiveInIt ****************************
     *********************************************************************/

    @Test
    public void numberDoesNotHaveFiveInItReturnsFalse() {
        assertFalse(Utilities.hasFiveInIt(1111));
    }

    @Test
    public void numberHasFiveInItReturnsTrue() {
        assertTrue(Utilities.hasFiveInIt(1155511));
    }
}