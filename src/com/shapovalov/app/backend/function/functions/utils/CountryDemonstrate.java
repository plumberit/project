package com.shapovalov.app.backend.function.functions.utils;

import com.shapovalov.app.model.Country;
import com.shapovalov.app.model.Result;

public class CountryDemonstrate {
    public Result format(Country country) {
        Result result = new Result();
        result.getStrokes().add(country.getName());

        ReadableNum obj = new ReadableNum();

        result.getStrokes().add(
                "Population: " + obj.toReadableNum(String.valueOf(country.getPopulation()))
        );
        result.getStrokes().add(
                "Square: " + obj.toReadableNum(String.valueOf(country.getSquare())) + " km^2"
        );
        result.getStrokes().add(
                "GDP: " + obj.toReadableNum(String.valueOf(country.getGDP())) + "$"
        );
        return result;
    }
}
