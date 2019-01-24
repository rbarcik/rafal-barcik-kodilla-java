package com.kodilla.good.patterns.flight;

public class FlightInformationService implements InformationService {
    public void inform(FlightRequest flightRequest){
        System.out.println("Flights" + flightRequest.toString() + " has been found.");
    }
}
