package com.example.android.fizzbuzzkata;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzManagerTest {

    @Test
    public void fizzStringBeingReturned() {
        assertEquals("Fizz", FizzManager.returnFizzString());
    }

    @Test
    public void negativeNumberIsFizzableReturnsFalse() {
        assertFalse(FizzManager.isInputFizzable(-1));
    }

    @Test
    public void zeroIsFizzableReturnsFalse() {
        assertFalse(FizzManager.isInputFizzable(0));
    }

    @Test
    public void oneIsFizzableReturnsFalse() {
        assertFalse(FizzManager.isInputFizzable(1));
    }

    @Test
    public void threeIsFizzableReturnsTrue() {
        assertTrue(FizzManager.isInputFizzable(3));
    }

    @Test
    public void hasThreeIsFizzableReturnsTrue() {
        assertTrue(FizzManager.isInputFizzable(1113111));
    }

    @Test
    public void doesNotHaveThreeAndIsNotThreeIsFizzableReturnsFalse() {
        assertFalse(FizzManager.isInputFizzable(1111111));
    }
}