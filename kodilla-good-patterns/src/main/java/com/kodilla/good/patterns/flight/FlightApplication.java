package com.kodilla.good.patterns.flight;


public class FlightApplication {
    public static void main(String args[]) {
        System.out.println("Flights from Warszawa.");
        FlightRequestRetriever departureFlightRequestRetriever = new DepartureFlightRequestRetriever();
        FlightRequest departureFlightRequest = departureFlightRequestRetriever.retrieve();
        FindFlightProcessor departureFlightProcessor = new FindFlightProcessor(new FlightInformationService(), new DepartureFlightService(), new FlightLoggingService());
        departureFlightProcessor.process(departureFlightRequest);

        System.out.println(" ");
        System.out.println("Flights to Kraków.");
        FlightRequestRetriever arrivalFlightRequestRetriever = new ArrivalFlightRequestRetriever();
        FlightRequest arrivalFlightRequest = arrivalFlightRequestRetriever.retrieve();
        FindFlightProcessor arrivalFlightProcessor = new FindFlightProcessor(new FlightInformationService(), new ArrivalFlightService(), new FlightLoggingService());
        arrivalFlightProcessor.process(arrivalFlightRequest);


        System.out.println(" ");
        System.out.println("Flights from Gdańsk through Warszawa to Wrocław.");
        FlightRequestRetriever throughFlightRequestRetriever = new ThroughFlightRequestRetriever();
        FlightRequest throughFlightRequest = throughFlightRequestRetriever.retrieve();
        FindFlightProcessor throughFlightProcessor = new FindFlightProcessor(new FlightInformationService(), new ThroughFlightService(), new FlightLoggingService());
        throughFlightProcessor.process(throughFlightRequest);
    }
}
