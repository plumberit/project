package com.shapovalov.project.entities.utils;

import com.shapovalov.project.entities.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class JSONCountriesInitializer {

    //временная копия
    ArrayList<Country> countries = new ArrayList<>();

    public JSONCountriesInitializer(JSONObject JSONObject) {
        initializeList(JSONObject);
    }

    void initializeList(JSONObject obj) {
        JSONArray arr = (JSONArray) obj.get("countries 2020");
        for (Object o : arr) {
            JSONObject object = (JSONObject) o;
            countries.add(new Country(
                    (int) object.get("id"),
                    (String) object.get("name"),
                    (long) object.get("population"),
                    (int) object.get("square"),
                    (long) object.get("udp")
            ));
        }
    }
}
