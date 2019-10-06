package com.example.android.fizzbuzzkata;

class BuzzManager {

    private static final String BUZZ_STRING_VALUE = "Buzz";

    static String returnBuzzString() {
        return BUZZ_STRING_VALUE;
    }

    static boolean isInputBuzzable(int input) {
        boolean isBuzzable = false;
        if (Utilities.isDivisibleByFive(input) || Utilities.hasFiveInIt(input)) {
            isBuzzable = true;
        }
        return isBuzzable;
    }
}
