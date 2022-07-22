package main.java.array.file;

import java.util.Arrays;

public class AverageOfNumbers {
    public static void main(String[] args) {

        int sum = 0, avg;

        Integer[] numbers1 = new Integer[]{25, 15, 60, 200};

        System.out.println("The array contains the next numbers: " + Arrays.toString(numbers1));

        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];
        }
        avg = sum / numbers1.length;

        System.out.println("The average of the above mentioned list of numbers is " + avg);
    }
}
