package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("Las Palmas", false);
        airports.put("Warsaw", true);
        return airports;
    }

    public boolean IsAirportInUs(String airport) throws AirPortNotFoundException {
        if (getListOfAirports().containsKey(airport)) ;
        return getListOfAirports().get(airport);

    }
}
