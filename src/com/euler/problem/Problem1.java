package com.euler.problem;

import java.util.Arrays;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {
    public int getMultiples(int x, int y, int limit) {
        int [] multiples = new int[999];
        int count = 0;
        for (int z = x; z < limit; z++){
            if (z % x == 0 || z % y == 0) {
                multiples[count] = z;
                count++;
            }
        }
        //sum multiples
        return Arrays.stream(multiples).sum();
    }
}
