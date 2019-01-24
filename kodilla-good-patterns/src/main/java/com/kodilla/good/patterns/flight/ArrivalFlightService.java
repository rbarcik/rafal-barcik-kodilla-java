package com.kodilla.good.patterns.flight;

import java.util.List;
import java.util.stream.Collectors;

public class ArrivalFlightService implements FlightService {
    public boolean findFlight(FlightRequest flightRequest){


        List<AirConnection> arrivalConnectionList = AirConnectionList.getAirConnectionList().stream()
                .filter(c -> c.getArrivalCity().equals(flightRequest.getArrivalCity()))
                .collect(Collectors.toList());

        if (arrivalConnectionList.size() > 0){

            for(Object acL : arrivalConnectionList){
                System.out.println(acL);
            }
            return true;
        } else {
            return false;
        }
    }
}
