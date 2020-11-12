package ro.fasttrackit.temaCurs8.number_powers;

import ro.fasttrackit.temaCurs8.anagram_exception.InvalidAnagramException;

public class MyCalculator {
    public static long power(int number, int power) throws Exception {
        long result = 1;

        if (number == 0 && power == 0) {
            throw new NegativeNumberException("NUMBER and POWER should not be negative.");
        } else if (number < 0 || power < 0) {
            throw new IllegalArgumentException("Number or Power should not be negative.");
        } else {
            return (long) Math.pow(number, power);
        }

    }
}
