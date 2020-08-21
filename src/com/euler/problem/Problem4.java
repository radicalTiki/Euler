package com.euler.problem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public int getLargestPalindrome() {
        int start = 100;
        int limit = 999;
        int largest = 0;

        for (int x = 0; x <= 999; x++)  {
            for (int i = 0; i <= 999; i++){
                int num = x * i;
                int check = num;
                int reversed = 0;

                while(num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }

                if (check == reversed & check > largest)
                    largest = check;
            }
        }
        return largest;
    }
}
