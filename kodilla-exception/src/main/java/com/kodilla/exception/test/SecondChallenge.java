package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception("Caution !!! x must be in <1, 2) and y cannot be 1.5 ");
        }
        return "Done!";
    }
}
