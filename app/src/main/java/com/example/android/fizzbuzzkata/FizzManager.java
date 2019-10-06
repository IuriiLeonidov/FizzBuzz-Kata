package com.example.android.fizzbuzzkata;

class FizzManager {

    private static final String FIZZ_STRING_VALUE = "Fizz";

    static String returnFizzString() {
        return FIZZ_STRING_VALUE;
    }

    static boolean isInputFizzable(int input) {
        boolean isFizzable = false;
        if (Utilities.isDivisibleByThree(input) || Utilities.hasThreeInIt(input)) {
            isFizzable = true;
        }
        return isFizzable;
    }
}
