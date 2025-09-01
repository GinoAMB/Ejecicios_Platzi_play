package com.platzi.play.domain.exception;

public class MovieNotFound extends RuntimeException {
    public MovieNotFound(Long id) {

        super("La pelicula con id: "+id+", no existe");
    }
}
