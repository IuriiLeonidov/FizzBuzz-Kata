package com.example.android.fizzbuzzkata;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuzzManagerTest {

    @Test
    public void BuzzStringBeingReturned() {
        assertEquals("Buzz", BuzzManager.returnBuzzString());
    }

    @Test
    public void negativeNumberIsBuzzableReturnsFalse() {
        assertFalse(BuzzManager.isInputBuzzable(-1));
    }

    @Test
    public void zeroIsBuzzableReturnsFalse() {
        assertFalse(BuzzManager.isInputBuzzable(0));
    }

    @Test
    public void oneIsBuzzableReturnsFalse() {
        assertFalse(BuzzManager.isInputBuzzable(1));
    }

    @Test
    public void fiveIsBuzzableReturnsTrue() {
        assertTrue(BuzzManager.isInputBuzzable(5));
    }

    @Test
    public void hasFiveIsBuzzableReturnsTrue() {
        assertTrue(BuzzManager.isInputBuzzable(1115111));
    }

    @Test
    public void doesNotHaveFiveAndIsNotFiveIsBuzzableReturnsFalse() {
        assertFalse(BuzzManager.isInputBuzzable(1111111));
    }
}