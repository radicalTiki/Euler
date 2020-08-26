package com.euler.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {
    public int getPythagTripletProduct() {
        boolean found = false;
        int a = 1, b = 1;
        double c = 1;

        outer:
        for (int x = 1; x <= 500; x++) {
            a = x;
            int[] test = new int[99];
            int[] test2 = new int[test.length];
            test2[test2.length -1] = 3;

            new ArrayList<>(Arrays.asList(test2));

            for (int y = 0; x < test2.length; x++) {
                System.out.println(test2[x]);
            }

//            for (int y = 1; y <= 500; y++) {
//                b = y;
//                c = (a * a) + (b * b);
//                c = Math.sqrt(c);
//                System.out.println("Trying: a:" + a + " b: " + b + " c:" + c + " total: " + (a + b + c));
//
//                if ((a + b + c) == 1000) {
//                    break outer;
//                }
//            }
        }

        return a * b * (int)c;
    }
}
