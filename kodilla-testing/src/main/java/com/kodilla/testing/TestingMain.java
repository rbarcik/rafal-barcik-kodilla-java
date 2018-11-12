package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int result = calculator.add(5,7);

        if(result == 12){
            System.out.println("Test add ok");
        } else {
            System.out.println("Add error!");
        }

        result = calculator.substract(7,5);

        if(result == 2){
            System.out.println("Test substract ok");
        } else {
            System.out.println("Substract error!");
        }
    }
}
