package com.euler.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * a,b,c,a,b,c,a,c,d,e,f,e,f,g,h,i,j
 * 7,4,4
 *
 * a,b,c
 * 1,1,1
 *
 * lowest size to include frames where sequence would include all frames
 * return List of integers that represent the size of the sequences created.
 */
public class FilmSequence {
    public List<Integer> getFilmSequence(List<Character> film) {
        List<Integer> filmSequences = new ArrayList();

        int nextIndex = 0;

        while(nextIndex < film.size()) {
            Character nextChar = film.get(nextIndex);
            int firstIndex = film.indexOf(nextChar);
            int lastIndex = film.lastIndexOf(nextChar);

            if (Collections.frequency(film, nextChar) == 1) {
                if (lastIndex + 1 != film.size()) {
                    while (Collections.frequency(film, film.get(lastIndex + 1)) == 1) {
                        lastIndex++;
                        if (lastIndex + 1 == film.size())
                            break;
                    }
                }
            }

            List<Character> nonDupes = new ArrayList(new LinkedHashSet(film.subList(firstIndex, lastIndex)));

            for (Character checkChar: nonDupes) {
                int checkIndex = film.lastIndexOf(checkChar);

                if (checkIndex > lastIndex) {
                    lastIndex = checkIndex;
                }
            }

            filmSequences.add(lastIndex - firstIndex + 1);
            nextIndex = lastIndex + 1;
        }

        return filmSequences;
    }
}
