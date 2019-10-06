package com.example.android.fizzbuzzkata;

class Utilities {
    static boolean isDivisibleByThree(int input){
        return isNumberADivisibleByNumberB(input, 3);
    }

    static boolean hasThreeInIt(int input){
        return doesNumberAContainNumberB(input, 3);
    }

    static boolean isDivisibleByFive(int input){
        return isNumberADivisibleByNumberB(input, 5);
    }

    static boolean hasFiveInIt(int input){
        return doesNumberAContainNumberB(input, 5);
    }

    static boolean isNumberADivisibleByNumberB(int numberA, int numberB){
        if (numberA <= 0 || numberB <= 0) {
            return false;
        }

        return (numberA % numberB) == 0;
    }

    static boolean doesNumberAContainNumberB(int numberA, int numberB) {
        String firstNumberAsString = Integer.toString(numberA);
        String secondNumberAsString = Integer.toString(numberB);

        return firstNumberAsString.contains(secondNumberAsString);
    }
}
