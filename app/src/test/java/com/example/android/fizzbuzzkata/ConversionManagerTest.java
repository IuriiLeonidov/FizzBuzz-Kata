package com.example.android.fizzbuzzkata;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConversionManagerTest {

    @Test
    public void negativeNumberConvertsToEmptyString(){
        assertEquals("", ConversionManager.convertNumber(-1));
    }

    @Test
    public void zeroConvertsToEmptyString(){
        assertEquals("", ConversionManager.convertNumber(0));
    }

    @Test
    public void oneConvertsToOne(){
        assertEquals("1", ConversionManager.convertNumber(1));
    }

    @Test
    public void threeConvertsToFizz(){
        assertEquals("Fizz", ConversionManager.convertNumber(3));
    }

    @Test
    public void hasThreeConvertsToFizz(){
        assertEquals("Fizz", ConversionManager.convertNumber(1113111));
    }

    @Test
    public void fiveConvertsToBuzz(){
        assertEquals("Buzz", ConversionManager.convertNumber(5));
    }

    @Test
    public void hasFiveConvertsToBuzz(){
        assertEquals("Buzz", ConversionManager.convertNumber(1115111));
    }

    @Test
    public void fifteenConvertsToFizzBuzz(){
        assertEquals("FizzBuzz", ConversionManager.convertNumber(15));
    }
}