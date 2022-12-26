package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;


public class CountriesInitializer {

    public void initialize(JSONObject JSONObject) {

        JSONArray arr = (JSONArray) JSONObject.get("country packs");

        Iterator<JSONObject> iterator = arr.iterator();
        while (iterator.hasNext()) {
            JSONObject object = iterator.next();

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
