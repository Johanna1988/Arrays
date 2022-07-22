package main.java.array.file;

import java.util.ArrayList;

public class ArrayListDiv {
    public static void main(String[] args) {

        ArrayList<Integer> value = new ArrayList();
        value.add(3);
        value.add(9);
        value.add(11);
        value.add(18);
        value.add(20);
        value.add(22);

        System.out.println("The ArrayList has the next values: " + value);

        value.removeIf(i -> (i % 3 == 0));
        System.out.println("The ArrayList after removing numbers divisible by 3 is: " + value);
    }
}

