package com.kodilla.good.patterns.flight;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartureFlightService implements FlightService {
    public boolean findFlight(FlightRequest flightRequest){

        List<AirConnection> connectionList = AirConnectionList.getAirConnectionList().stream()
                .filter(c -> c.getDepartureCity().equals(flightRequest.getDepartureCity()))
                .collect(Collectors.toList());

        if (connectionList.size() > 0){

            for(Object cL : connectionList){
                System.out.println(cL);
            }
            return true;
        } else {
            return false;
        }
    }
}
