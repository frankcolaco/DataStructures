package org.study.datastructures.problems.arrays;

import java.util.Arrays;

/**
 * Java program to check the equality of two arrays.
 */
public class ArrayEqualityMain {

    public static void main(String[] args) {

        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};

        System.out.println(equalityWithIterative(arrayOne,arrayTwo));

        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        System.out.println(equalityWithEquals(s1,s2));

    }

    public static boolean equalityWithIterative(int[] arr,int[] arr1){
        boolean equalOrNot = true;

        if(arr.length == arr1.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr1[i]){
                    equalOrNot=false;
                }
            }
        }else{
            equalOrNot=false;
        }

        return equalOrNot;
    }

    public static boolean equalityWithEquals(String[] arr,String[] arr1){
        return Arrays.equals(arr,arr1);
    }
}
