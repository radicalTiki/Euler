package com.euler;

import com.euler.examples.ClosestLocation;
import com.euler.examples.FilmSequence;
import com.euler.examples.PairInt;
import com.euler.problem.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FilmSequence problem = new FilmSequence();
//        Arrays.asList('a','b','c')
        problem.getFilmSequence(Arrays.asList('a','b','c','a','b','c','a','c','d','e','f','e','f','g','h','i','j')).forEach(e -> System.out.println(e));
    }
}