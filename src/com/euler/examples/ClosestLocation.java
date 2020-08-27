package com.euler.examples;

import java.util.*;
import java.util.stream.Collectors;

/*
    totalCrates total number of packing crates in the facility
    allLocations list where each element consists of a pair of integers representing x, y coords of packing crates
    truckCapacity an integer representing the number of packing creates that will be moved to the new facility

    return:
        list of pair of integers representing the x and y coordinates of the packing crates that will be moved to the new facility
        if there are no possible pairs return a list with empty pair not just empty list
*/

public class ClosestLocation {

    public List<PairInt> closestLocations(int totalCrates, List<PairInt> allLocations, int truckCapacity) {
        //distance of truck from a warehouse location (x, y) is the square root of x^2 + y^2
        //if there are ties then return any of the locations as long as you satisfy the M points
        List<PairInt> cratesInClosestOrder = new ArrayList(allLocations);

        Collections.sort(cratesInClosestOrder, new Comparator<PairInt>() {
            public int compare (PairInt pair1, PairInt pair2) {
                return Double.compare(Math.sqrt(Math.abs(pair1.first) * Math.abs(pair1.first) + ((Math.abs(pair1.second) * Math.abs(pair1.first)))),
                        Math.sqrt(Math.abs(pair2.first) * Math.abs(pair2.first) + Math.abs(pair2.second) * Math.abs(pair2.first)));
            }
        });

        return cratesInClosestOrder.stream()
                .limit(truckCapacity)
                .collect(Collectors.toList());
    }
}
