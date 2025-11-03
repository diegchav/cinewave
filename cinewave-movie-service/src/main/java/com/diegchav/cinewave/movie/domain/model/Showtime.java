package com.diegchav.cinewave.movie.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public record Showtime(
    UUID id,
    UUID movieId,
    UUID theaterId,
    LocalDateTime startTime,
    LocalDateTime endTime,
    double price
) {}
