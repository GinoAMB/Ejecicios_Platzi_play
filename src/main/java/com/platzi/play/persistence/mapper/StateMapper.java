package com.platzi.play.persistence.mapper;

import org.mapstruct.Named;

public class StateMapper {

    @Named("stringToState")
    public static Boolean stringToState(String estado){
        if(estado == null) {
            return null;
        }
        return switch (estado){
          case "D" -> true;
          case "N" -> false;
            default -> null;
        };
    }

    @Named("booleanToState")
    public static String booleanToState(Boolean state){
        return state == null ? null : (state ? "D" : "N");
    }
}
