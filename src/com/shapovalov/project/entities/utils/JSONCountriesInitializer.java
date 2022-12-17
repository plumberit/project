package com.shapovalov.project.entities.utils;

import com.shapovalov.project.entities.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class JSONCountriesInitializer {

    //временная копия
    ArrayList<Country> countries = new ArrayList<>();

    JSONCountriesInitializer(JSONObject JSONObject) {
        initializeList(JSONObject);
    }

    void initializeList(JSONObject obj) {
        JSONArray arr = (JSONArray) obj.get("countries 2020");
        Iterator iterator = arr.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            countries.add(new Country());
            JSONObject object = (JSONObject) iterator.next();
            countries.get(i).setId((int) object.get("id"));
            i++;
        }
    }
}
