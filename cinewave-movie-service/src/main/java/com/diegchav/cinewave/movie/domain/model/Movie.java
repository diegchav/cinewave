package com.diegchav.cinewave.movie.domain.model;

import java.util.UUID;

public record Movie(
        UUID id,
        String title,
        String genre,
        String language,
        int duration,
        String rating,
        String description
) {}
