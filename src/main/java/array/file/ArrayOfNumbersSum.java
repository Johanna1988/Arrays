package main.java.array.file;

import java.util.Arrays;

public class ArrayOfNumbersSum {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{9, -5, 3, -8, 75, 115};

        System.out.println("The Array contains the following numbers: " + Arrays.toString(numbers));

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }

            System.out.println("The sum of all positive numbers is: " + sum);
        }
    }
}
