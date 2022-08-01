package main.java.array;

import main.java.array.file.OperationsWithArrays;

public class ArrayApp {
    public static void main(String[] args) {

        OperationsWithArrays results = new OperationsWithArrays();
        results.removeDivisibleByThree();
        results.replaceString();
        results.defineAverage();
        results.sortInDescOrder();
        results.sumUpPositiveNum();

    }
}