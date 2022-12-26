package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.backend.function.functions.utils.CountryDemonstrate;
import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import com.shapovalov.app.model.Result;

import java.util.ArrayList;

public class FunctionCompare implements FunctionLogic {


    @Override
    public Result handle() {
        return null;
    }

    @Override
    public Result handle(ArrayList<String> parameters) {
        String country1 = parameters.get(0);
        String country2 = parameters.get(1);
        Country country1obj = null;
        Country country2obj = null;

        for (Country country : Countries.countries) {
            if (country.getName().equals(country1)) {
                country1obj = country;
            }
            if (country.getName().equals(country2)) {
                country2obj = country;
            }
        }

        CountryDemonstrate tool = new CountryDemonstrate();
        Result result1 = tool.format(country1obj);
        Result result2 = tool.format(country2obj);

        Result result = new Result();
        for (int i = 0; i < result1.getStrokes().size(); i++) {
            result.getStrokes().add(result1.getStrokes().get(i));
        }
        result.getStrokes().add("");
        for (int i = 0; i < result2.getStrokes().size(); i++) {
            result.getStrokes().add(result2.getStrokes().get(i));
        }
        return result;
    }
    // COMPARE [Ukraine] [Germany]

}
