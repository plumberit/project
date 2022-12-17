package com.shapovalov.project.entities.utils;

import com.shapovalov.project.entities.Countries;
import com.shapovalov.project.entities.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JSONCountriesInitializer {

    public void initialize(JSONObject JSONObject) {
        JSONArray arr = (JSONArray) JSONObject.get("countries 2020");
        for (Object o : arr) {
            JSONObject object = (JSONObject) o;
            Countries.countries.add(new Country(
                    (int) object.get("id"),
                    (String) object.get("name"),
                    (long) object.get("population"),
                    (int) object.get("square"),
                    (long) object.get("udp")
            ));
        }
    }

}
