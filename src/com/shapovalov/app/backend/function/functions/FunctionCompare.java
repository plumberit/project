package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.backend.function.functions.utils.ReadableNum;
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

        




        return result;
    }

}
