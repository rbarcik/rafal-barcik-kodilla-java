package com.kodilla.good.patterns.flight;

public class ArrivalFlightRequest implements FlightRequest {
    private final AirportCity arrivalCity;

    public ArrivalFlightRequest(AirportCity arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    @Override
    public AirportCity getArrivalCity() {
        return arrivalCity;
    }

    public AirportCity getDepartureCity() {
        return null;
    }

    public AirportCity getThroughCity() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrivalFlightRequest that = (ArrivalFlightRequest) o;

        return arrivalCity != null ? arrivalCity.equals(that.arrivalCity) : that.arrivalCity == null;
    }

    @Override
    public int hashCode() {
        return arrivalCity != null ? arrivalCity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return " to " + arrivalCity;
    }
}
