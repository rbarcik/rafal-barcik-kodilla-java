package com.kodilla.good.patterns.flight;

public class FlightDto {
    private AirportCity airportCity;
    private boolean flightExist;

    public FlightDto(AirportCity airportCity, boolean flightExist) {
        this.airportCity = airportCity;
        this.flightExist = flightExist;
    }

    public AirportCity getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(AirportCity airportCity) {
        this.airportCity = airportCity;
    }

    public boolean getFlightExist() {
        return flightExist;
    }

    public void setFlightExist(boolean flightExist) {
        this.flightExist = flightExist;
    }
}
