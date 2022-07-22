package main.java.array.file;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOfIntegersSorting {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{2, 3, 1, 7, 11};

        System.out.println("The array before sorting is: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("The array after sorting in descending order is following: " + Arrays.toString(numbers));
    }
}
