package com.kodilla.good.patterns.flight;

public class ArrivalFlightRequestRetriever implements FlightRequestRetriever {
    public ArrivalFlightRequest retrieve(){

        AirportCity arrivalCity = new AirportCity("Kraków");

        return new ArrivalFlightRequest(arrivalCity);
    }
}
