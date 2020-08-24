package com.euler.problem;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001 prime number?
 */
public class Problem7 {
    public int get10001PrimeNum() {
        int count = 6;
        int checkNum = 13;

        while (count <= 10000) {
            checkNum++;
            if (isPrime(checkNum)) {
                count ++;
            }
        }
        return checkNum;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++)
            if (num% i == 0)
                return false;
        return true;
    }
}
