package com.euler.problem;

import java.util.Arrays;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public long getLargestPrime() {
        long number = 600851475143L;
        long[] primes = new long[10];
        int count = 0;

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primes[count++] = i;
                number /= i;
            }
        }

        return Arrays.stream(primes).max().getAsLong();
    }
}
