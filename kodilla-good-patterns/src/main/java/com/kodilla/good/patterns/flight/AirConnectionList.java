package com.kodilla.good.patterns.flight;

import java.util.LinkedList;

public class AirConnectionList {

    static LinkedList<AirConnection> getAirConnectionList(){
        LinkedList<AirConnection> airConnectionList = new LinkedList<>();
        AirportCity gdansk = new AirportCity("Gdańsk");
        AirportCity szczecin = new AirportCity("Szczecin");
        AirportCity bialystok = new AirportCity("Białystok");
        AirportCity poznan = new AirportCity("Poznań");
        AirportCity warszawa = new AirportCity("Warszawa");
        AirportCity lodz = new AirportCity("Łódź");
        AirportCity lublin = new AirportCity("Lublin");
        AirportCity wroclaw = new AirportCity("Wrocław");
        AirportCity katowice = new AirportCity("Katowice");
        AirportCity krakow = new AirportCity("Kraków");
        AirportCity rzeszow = new AirportCity("Rzeszów");

        airConnectionList.add(new AirConnection(szczecin, warszawa));
        airConnectionList.add(new AirConnection(warszawa, szczecin));
        airConnectionList.add(new AirConnection(gdansk, warszawa));
        airConnectionList.add(new AirConnection(warszawa, gdansk));
        airConnectionList.add(new AirConnection(bialystok, warszawa));
        airConnectionList.add(new AirConnection(warszawa, bialystok));
        airConnectionList.add(new AirConnection(lublin, warszawa));
        airConnectionList.add(new AirConnection(warszawa, lublin));
        airConnectionList.add(new AirConnection(rzeszow, warszawa));
        airConnectionList.add(new AirConnection(warszawa, rzeszow));
        airConnectionList.add(new AirConnection(krakow, warszawa));
        airConnectionList.add(new AirConnection(warszawa, krakow));
        airConnectionList.add(new AirConnection(katowice, warszawa));
        airConnectionList.add(new AirConnection(warszawa, katowice));
        airConnectionList.add(new AirConnection(wroclaw, warszawa));
        airConnectionList.add(new AirConnection(warszawa, wroclaw));
        airConnectionList.add(new AirConnection(poznan, warszawa));
        airConnectionList.add(new AirConnection(warszawa, poznan));
        airConnectionList.add(new AirConnection(lodz, warszawa));
        airConnectionList.add(new AirConnection(warszawa, lodz));

        return airConnectionList;
    }
}
