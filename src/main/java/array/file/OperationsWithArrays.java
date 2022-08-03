package main.java.array.file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static main.java.array.file.Printer.print;

public class OperationsWithArrays {

    public void removeDivisibleByThree() {

        ArrayList<Integer> value = new ArrayList();
        value.add(3);
        value.add(9);
        value.add(11);
        value.add(18);
        value.add(20);
        value.add(22);

        print("The ArrayList has the next values: " + value);

        value.removeIf(i -> (i % 3 == 0));

        print("The ArrayList after removing numbers divisible by 3 is: " + value);
    }

    public void replaceString() {

        ArrayList<String> value = new ArrayList();
        value.add("One");
        value.add("Two");
        value.add("Tree");
        value.add("Four");

        print("The created ArrayList is: " + value);

        value.set(2, "Three");

        print("The ArrayList after replacement is as follows: " + value);
    }

    public void defineAverage() {
        int sum = 0, avg;

        Integer[] numbers1 = new Integer[]{25, 15, 60, 200};

        print("The array contains the next numbers: " + Arrays.toString(numbers1));

        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];
        }
        avg = sum / numbers1.length;

        print("The average of the above mentioned list of numbers is " + avg);
    }

    public void sortInDescOrder() {

        Integer[] numbers = new Integer[]{2, 3, 1, 7, 11};

        print("The array before sorting is: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());

        print("The array after sorting in descending order is following: " + Arrays.toString(numbers));
    }

    public void sumUpPositiveNum() {

        Integer[] numbers = new Integer[]{9, -5, 3, -8, 75, 115};

        print("The Array contains the following numbers: " + Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        print("The sum of all positive numbers is: " + sum);
    }
}
