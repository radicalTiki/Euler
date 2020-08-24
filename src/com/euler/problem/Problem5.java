package com.euler.problem;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public long getDivisibleNum() {
        long i = 2000;
        boolean found = false;

        while (!found) {
            boolean isDividable = true;
            for (int x = 1; x <= 20; x++) {
                if (i % x != 0) {
                    isDividable = false;
                    i++;
                    break;
                }
            }
            if (isDividable)
                found = true;
        }
        return i;
    }
}
