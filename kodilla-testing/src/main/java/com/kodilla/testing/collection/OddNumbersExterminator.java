package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int n = 0; n < numbers.size(); n++) {
            Integer temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0) {
                evenNumbers.add(new Integer(temporaryValue));
            } else {
            }
        }
        return evenNumbers;
    }
}
