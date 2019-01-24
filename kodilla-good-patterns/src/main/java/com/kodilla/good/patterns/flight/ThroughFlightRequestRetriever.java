package com.kodilla.good.patterns.flight;

public class ThroughFlightRequestRetriever implements FlightRequestRetriever {
    public ThroughFlightRequest retrieve(){

        AirportCity departureCity = new AirportCity("Gdańsk");
        AirportCity throughCity = new AirportCity("Warszawa");
        AirportCity arrivalCity = new AirportCity("Wrocław");


        return new ThroughFlightRequest(departureCity, throughCity, arrivalCity);
    }
}
