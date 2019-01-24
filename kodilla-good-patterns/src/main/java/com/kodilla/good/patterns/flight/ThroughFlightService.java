package com.kodilla.good.patterns.flight;

import java.util.List;
import java.util.stream.Collectors;

public class ThroughFlightService implements FlightService {
    public boolean findFlight(FlightRequest flightRequest){

        List<AirConnection> connectionList1 = AirConnectionList.getAirConnectionList().stream()
                .filter(d -> d.getDepartureCity().equals(flightRequest.getDepartureCity()))
                .filter(t -> t.getArrivalCity().equals(flightRequest.getThroughCity()))
                .collect(Collectors.toList());

        List<AirConnection> connectionList2 = AirConnectionList.getAirConnectionList().stream()
                .filter(d -> d.getDepartureCity().equals(flightRequest.getThroughCity()))
                .filter(t -> t.getArrivalCity().equals(flightRequest.getArrivalCity()))
                .collect(Collectors.toList());

        if (connectionList1.size() > 0 && connectionList2.size() > 0){
            System.out.println(connectionList1);
            System.out.println(connectionList2);
            return true;
        } else {
            return false;
        }
    }
}
