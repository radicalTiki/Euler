package com.euler.problem;

/**
 * The primes 3, 7, 109, and 673, are quite remarkable.
 * By taking any two primes and concatenating them in any order the result will always be prime.
 * For example, taking 7 and 109, both 7109 and 1097 are prime. The sum of these four primes, 792,
 * represents the lowest sum for a set of four primes with this property.
 *
 * Find the lowest sum for a set of five primes for which any two primes concatenate to produce another prime.
 */
public class Problem60 {
    public int lowestPrimeSum() {
        //double array to hold arrays of prime to find 5 that all concate to prime
        int[][] primes = new int[999][999];
        long number = 600851475143L;

        int count = 0;

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
//                primes[count++] = i;
                number /= i;
            }
        }
        return 1;
    }
}
