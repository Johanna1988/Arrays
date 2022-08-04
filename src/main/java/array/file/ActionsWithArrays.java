package main.java.array.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static main.java.array.file.Printer.print;

public class ActionsWithArrays {

    List<Integer> number = new ArrayList<>();
    List<String> value = new ArrayList<>();

    public void defineAverage() {
        number.add(9);
        number.add(-5);
        number.add(200);
        number.add(115);
        number.add(-8);
        number.add(20);

        print("The array contains the next numbers: " + number);

        int sum = 0, avg;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        avg = sum / number.size();

        print("The average of the above mentioned list of numbers is " + avg);
    }

    public void sumUpPositiveNum() {

        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) > 0) {
                sum += number.get(i);
            }
        }
        print("The sum of all positive numbers is: " + sum);
    }

    public void removeDivisibleByThree() {

        number.removeIf(i -> (i % 3 == 0));

        print("The list after removing numbers divisible by 3 is: " + number);
    }

    public void sortInDescOrder() {

        number.sort(Collections.reverseOrder());

        print("The array after sorting in descending order is following: " + number);
    }

    public void replaceString() {

        value.add("One");
        value.add("Two");
        value.add("Tree");
        value.add("Four");

        print("The created ArrayList is: " + value);

        value.set(2, "Three");

        print("The ArrayList after replacement is as follows: " + value);
    }
}
