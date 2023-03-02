package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    @Test
    public void shouldFindFlightByDeparture() {
        //given
        FlightFinder findFromWhere = new FlightFinder();
        getFlightsTable("Amsterdam NLD", "New York USA").add(new Flight("Amsterdam NLD", "New York USA"));
        //when
        List<Flight> result = findFromWhere.findFlightsFrom("Amsterdam NLD");
        //then
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Amsterdam NLD", "New York USA"));
        assertEquals(result, expected);
    }

    @Test
    public void shouldFindFlightByArrival() {
        //given
        FlightFinder findToWhere = new FlightFinder();
        getFlightsTable("Tokio JPN", "Sydney AUS").add(new Flight("Tokio JPN", "Sydney AUS"));
        //when
        List<Flight> result = findToWhere.findFlightsTo("Sydney AUS");
        //then
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("Tokio JPN", "Sydney AUS"));
        assertEquals(result, expected);
    }
}