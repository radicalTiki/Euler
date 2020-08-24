package com.euler.problem;

/**
 * The sum of the squares of the first ten natural numbers is,
 *  1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 - 385 = 2640
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    public int getDifferenceSquares() {
        int sumSquares = 0;
        int sumToSquare = 0;
        for (int x = 0; x <= 100; x++) {
            sumToSquare += x;
            sumSquares += x * x;
        }

        return (sumToSquare * sumToSquare) - sumSquares;
    }
}
