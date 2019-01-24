package com.kodilla.good.patterns.flight;

public class AirConnection {
    private final AirportCity departureCity;
    private final AirportCity arrivalCity;

    public AirConnection(AirportCity departureCity, AirportCity arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public AirportCity getDepartureCity() {
        return departureCity;
    }

    public AirportCity getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return "AirConnection from " +
                departureCity +
                " to " + arrivalCity;
    }
}
