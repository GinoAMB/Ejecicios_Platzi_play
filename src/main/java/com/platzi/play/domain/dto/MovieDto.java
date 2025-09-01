package com.platzi.play.domain.dto;

import com.platzi.play.domain.Genre;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record MovieDto(
        Long id,

        @NotBlank(message = "El titulo es obligatorio")
        String title,

        @PositiveOrZero(message = "La duracion tiene que ser mayor o igual a 0 ")
        Integer duration,

        @NotNull(message = "El genero es obligatorio")
        Genre genre,

        @PastOrPresent(message = "La fecha de lanzamiento debe ser anterior a la fecha actual")
        LocalDate releaseDate,

        @Min(value = 0, message = "El rating no puede ser menor a 0")
        @Max(value = 5, message = "El rating no puede ser mayor a 5")
        Double rating,

        @Pattern(regexp = "^(true|false)$", message = "El estado soo puede ser true o false")
        String state

) {
}
