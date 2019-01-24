package com.kodilla.good.patterns.flight;

public class DepartureFlightRequest implements FlightRequest{

    private final AirportCity departureCity;

    public DepartureFlightRequest(AirportCity departureCity) {
        this.departureCity = departureCity;
    }

    public AirportCity getDepartureCity() {
        return departureCity;
    }
    public AirportCity getThroughCity() {
        return null;
    }
    public AirportCity getArrivalCity() {
        return null;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartureFlightRequest that = (DepartureFlightRequest) o;

        return departureCity != null ? departureCity.equals(that.departureCity) : that.departureCity == null;
    }

    @Override
    public int hashCode() {
        return departureCity != null ? departureCity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return " from " + departureCity;
    }
}
