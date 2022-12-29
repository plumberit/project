package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.backend.function.functions.utils.CountryDemonstrate;
import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import com.shapovalov.app.model.Result;

import java.util.ArrayList;

public class FunctionDetail implements FunctionRealisation {
    @Override
    public Result handle(ArrayList<String> parameters) {
        String countryName = parameters.get(0);
        Country country = null;

        for (Country countryI : Countries.countries) {
            if (countryI.getName().equals(countryName)) {
                country = countryI;
            }
        }

        if(country == null) {
            Result result = new Result();
            result.getStrokes().add("Country name is invalid.");
            result.setError(true);
            return result;
        }

        CountryDemonstrate tool = new CountryDemonstrate();
        ArrayList<String> countryStrokes = tool.format(country);

        Result result = new Result();
        for (int i = 0; i < countryStrokes.size(); i++) {
            result.getStrokes().add(countryStrokes.get(i));
        }
        return result;
    }
}
