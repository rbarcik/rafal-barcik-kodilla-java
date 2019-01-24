package com.kodilla.good.patterns.flight;

public interface FlightRequest {
    AirportCity getDepartureCity();
    AirportCity getThroughCity();
    AirportCity getArrivalCity();
}
