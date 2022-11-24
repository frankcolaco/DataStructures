package org.study.datastructures.problems.arrays;

import org.study.Main;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  Find duplicates in the array
 */
public class DuplicatesInArrayMain {

    public static void main(String[] args) {

        List<Integer> integers = Main.getIntegers();
        Set<Integer> duplicateElements = new HashSet<>();

        integers.stream().filter(i -> {
            return !duplicateElements.add(i);
        });
        System.out.println(duplicateElements.isEmpty()? "No duplicates":duplicateElements);

    }
}
