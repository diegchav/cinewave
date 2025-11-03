package com.diegchav.cinewave.movie.domain.model;

import java.util.Map;
import java.util.UUID;

public record Theater(
        UUID id,
        String name,
        String location,
        int numOfScreens,
        Map<String, Object> seatMap
) {}
