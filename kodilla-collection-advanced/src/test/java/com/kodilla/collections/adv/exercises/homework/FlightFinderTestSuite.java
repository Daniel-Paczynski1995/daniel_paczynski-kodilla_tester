package com.kodilla.collections.adv.exercises.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testAddFlight() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Barcelona");
        flightFinder.findFlightsFrom("Moskwa");
        flightFinder.findFlightsTo("Las Vegas");
    }


}