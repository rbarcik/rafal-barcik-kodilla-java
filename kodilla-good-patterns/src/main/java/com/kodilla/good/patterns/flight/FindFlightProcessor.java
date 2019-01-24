package com.kodilla.good.patterns.flight;

public class FindFlightProcessor {
    private InformationService informationService;
    private FlightService flightService;
    private LoggingService loggingService;

    public FindFlightProcessor(final InformationService informationService,
                               final FlightService flightService,
                               final LoggingService loggingService) {
        this.informationService = informationService;
        this.flightService = flightService;
        this.loggingService = loggingService;
    }

    public FlightDto process(final FlightRequest flightRequest) {
        boolean flightExist = flightService.findFlight(flightRequest);

        if(flightExist) {
            informationService.inform(flightRequest);
            loggingService.writeLog(flightRequest);
            return new FlightDto(flightRequest.getDepartureCity(), true);
        } else {
            System.out.println("There is no connection " + flightRequest.toString());
            return new FlightDto(flightRequest.getDepartureCity(), false);
        }
    }
}
