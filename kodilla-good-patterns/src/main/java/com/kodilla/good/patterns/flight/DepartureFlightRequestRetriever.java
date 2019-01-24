package com.kodilla.good.patterns.flight;

public class DepartureFlightRequestRetriever implements FlightRequestRetriever {
    public DepartureFlightRequest retrieve(){

        AirportCity departureCity = new AirportCity("Warszawa");

        return new DepartureFlightRequest(departureCity);
    }

}
