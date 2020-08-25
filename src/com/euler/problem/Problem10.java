package com.euler.problem;

import sun.security.util.BitArray;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 * 1179908154 -> sum of all non prime
 * 1659299205 -> sum of prime
 * 142913828922
 *
 * 727379967
 * 1179908154
 */
public class Problem10 {

    public int getSumPrimeNum() {
        int upperLimit = 2000000;

//        int sieveBound = (upperLimit - 1) / 2;
//        int upperSqrt = ((int)Math.sqrt(upperLimit) - 1) / 2;
//
//        BitSet PrimeBits = new BitSet(sieveBound + 1);
//
//        for (int i = 1; i <= upperSqrt; i++) {
//            if (!PrimeBits.get(i)) {
//                for (int j = i * 2 * (i + 1); j <= sieveBound; j += 2 * i + 1) {
//                    PrimeBits.set(j, true);
//                }
//            }
//        }
//
        int sum = 0;
//
//        for (int i = 1; i <= sieveBound; i++) {
//            if (!PrimeBits.get(i)) {
//                sum += (2 * i + 1);
//            }
//        }

        boolean prime[] = new boolean[upperLimit+1];
        for(int i=0;i<upperLimit;i++)
            prime[i] = true;

        for(int p = 2; p*p <=upperLimit; p++) {
            // If prime[p] is not changed, then it is a prime
            if(prime[p]) {
                // Update all multiples of p
                for(int i = p*p; i <= upperLimit; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= upperLimit; i++) {
            if(prime[i] == true)
                sum += i;
        }

        return sum;
    }
}
