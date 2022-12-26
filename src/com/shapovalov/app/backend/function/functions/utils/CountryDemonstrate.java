package com.shapovalov.app.backend.function.functions.utils;

import com.shapovalov.app.model.Country;
import com.shapovalov.app.model.Result;

public class CountryDemonstrate {
    public Result format(Country country) {
        Result result = new Result();
        result.getStrokes().add(country.getName());

        ReadableNum obj = new ReadableNum();

        result.getStrokes().add(
                obj.toReadableNum(String.valueOf(country.getPopulation()))
        );
        result.getStrokes().add(
                obj.toReadableNum(String.valueOf(country.getSquare()))
        );
        result.getStrokes().add(
                obj.toReadableNum(String.valueOf(country.getGDP()))
        );
        return result;
    }
}
