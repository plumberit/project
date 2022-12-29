package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import com.shapovalov.app.model.Result;

import java.util.ArrayList;

public class FunctionShow implements FunctionRealisation {

    @Override
    public Result handle(ArrayList<String> parameters) {
        Result result = new Result();
        for (Country country : Countries.countries) {
            result.getStrokes().add(country.getName());
        }
        return result;
    }
}
