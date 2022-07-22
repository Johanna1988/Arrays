package main.java.array.file;

import java.util.ArrayList;

public class ArrayListReplacement {

    public static void main(String[] args) {

        ArrayList<String> value = new ArrayList();
        value.add("One");
        value.add("Two");
        value.add("Tree");
        value.add("Four");

        System.out.println("The created ArrayList is: " + value);

        value.set(2, "Three");

        System.out.println("The ArrayList after replacement is as follows: " + value);
    }
}
