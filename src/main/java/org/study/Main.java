package org.study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static List<Integer> getIntegers(){
        return Arrays.asList(10,4,3,2,7,6,9);
    }

    public static Map<String,Integer> getNonEmptyMap(){
        Map<String,Integer> nonEmptyMap = new HashMap<>();
        nonEmptyMap.put("Alisha",25100);
        nonEmptyMap.put("Deborah",10000);
        nonEmptyMap.put("Frank",33000);
        nonEmptyMap.put("Sheela",25000);
        return nonEmptyMap;
    }
}