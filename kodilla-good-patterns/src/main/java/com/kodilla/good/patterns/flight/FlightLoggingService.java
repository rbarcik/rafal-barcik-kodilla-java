package com.kodilla.good.patterns.flight;

public class FlightLoggingService implements LoggingService{
    public void writeLog(FlightRequest flightRequest){
        System.out.println("Writing connection" + flightRequest.toString() + " to searching log.");
    }
}
