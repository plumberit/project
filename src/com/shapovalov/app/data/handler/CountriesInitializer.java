package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;


public class CountriesInitializer {

    public void initialize(JSONObject JSONObject) {
        JSONObject countryPacks = (JSONObject) JSONObject.get("country packs");
        JSONArray countries = (JSONArray) countryPacks.get("countries v1");

        Iterator<JSONObject> iterator = countries.iterator();
        while (iterator.hasNext()) {
            JSONObject object = iterator.next();
            Countries.countries.add(new Country(
                    ((Long) object.get("id")).intValue(),
                    (String) object.get("name"),
                    (long) object.get("population"),
                    ((Long) object.get("square")).intValue(),
                    (long) object.get("GDP")
            ));
        }
    }

}
