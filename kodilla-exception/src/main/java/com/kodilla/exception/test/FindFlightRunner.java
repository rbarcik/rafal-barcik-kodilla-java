package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args){
        FindFlight findFlight = new FindFlight();

        try{
            boolean result = findFlight.findFlight(new Flight("Denver1", "Los Angeles"));
            if(result) {
                System.out.println("The airport is ready and waiting for the plane.");
            } else {
                System.out.println("The airport is busy. Please select one from above.");
            }
        } catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
