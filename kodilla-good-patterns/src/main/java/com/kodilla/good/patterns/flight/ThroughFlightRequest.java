package com.kodilla.good.patterns.flight;

public class ThroughFlightRequest implements FlightRequest{
    private final AirportCity departureCity;
    private final AirportCity throughCity;
    private final AirportCity arrivalCity;

    public ThroughFlightRequest(AirportCity departureCity, AirportCity throughCity, AirportCity arrivalCity) {
        this.departureCity = departureCity;
        this.throughCity = throughCity;
        this.arrivalCity = arrivalCity;
    }

    @Override
    public AirportCity getDepartureCity() {
        return departureCity;
    }

    public AirportCity getThroughCity() {
        return throughCity;
    }

    public AirportCity getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return "from " + departureCity +
                " through " + throughCity +
                " to " + arrivalCity;
    }
}
