package com.example.android.fizzbuzzkata;

class ConversionManager {
    static String convertNumber(int input) {

        if (input <= 0) {
            return "";
        }

        boolean isFizzable = FizzManager.isInputFizzable(input);
        boolean isBuzzable = BuzzManager.isInputBuzzable(input);

        if (isFizzable && isBuzzable) {
            return FizzManager.returnFizzString() + BuzzManager.returnBuzzString();
        }

        if (isFizzable) {
            return FizzManager.returnFizzString();
        }

        if (isBuzzable) {
            return BuzzManager.returnBuzzString();
        }

        return Integer.toString(input);
    }
}
