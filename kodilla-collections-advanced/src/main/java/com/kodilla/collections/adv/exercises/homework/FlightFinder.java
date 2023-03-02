package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> findFrom = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable(departure, departure)) {
            if (flight.getDeparture().equals(departure)) {
                findFrom.add(flight);
            }
        }
        return findFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> findTo = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable(arrival, arrival)) {
            if (flight.getArrival().equals(arrival)) {
                findTo.add(flight);
            }
        }
        return findTo;
    }
}
