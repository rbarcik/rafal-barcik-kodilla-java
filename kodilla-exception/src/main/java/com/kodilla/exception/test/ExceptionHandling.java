package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();{
            try {
                String result = secondChallenge.probablyIWillThrowException(3.0, 1.6);
                System.out.println(result);
            } catch (Exception e){
                System.out.println("Arror input data " + e);

            } finally {
                System.out.println("\n Thank you.");
            }
            }
        }
    }

