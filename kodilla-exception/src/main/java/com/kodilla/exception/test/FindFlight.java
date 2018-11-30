package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;

public class FindFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airPorts = new HashMap<>();
        airPorts.put("Atlanta", true);
        airPorts.put("Chicago", false);
        airPorts.put("Los Angeles", true);
        airPorts.put("Dallas", false);
        airPorts.put("Denver", true);
        airPorts.put("New York", true);
        airPorts.put("San Francisco", false);
        airPorts.put("Las Vegas", true);

        HashMap<String, Boolean> airPortsNew = new HashMap<>(airPorts);
        List<String> availableAirPorts = airPortsNew.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        List<String> airPortsReady = airPortsNew.entrySet().stream()
                .filter(a -> a.getValue() == true)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        String departureAirport = flight.getDepartureAirport();

        if(airPorts.containsKey(departureAirport)){
            if(airPorts.get(departureAirport)){
                return airPorts.get(departureAirport);
            } else {
                System.out.println("Ready airports " + airPortsReady);
                return airPorts.get(departureAirport);
            }
        } else {
            throw new RouteNotFoundException("There is no \"" + departureAirport + "\" airport on the Airports list.\n"
                    + "You can choose one of the following " + availableAirPorts);
        }
    }
}
