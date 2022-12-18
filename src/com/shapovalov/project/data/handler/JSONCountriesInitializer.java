package com.shapovalov.project.data.handler;

import com.shapovalov.project.data.Countries;
import com.shapovalov.project.entities.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;


public class JSONCountriesInitializer {

    public void initialize(JSONObject JSONObject) {
        JSONArray arr = (JSONArray) JSONObject.get("countries 2020");
        /*for (Object o : arr) {
            JSONObject object = (JSONObject) o;
            Countries.countries.add(new Country(
                    (int) object.get("id"),
                    (String) object.get("name"),
                    (long) object.get("population"),
                    (int) object.get("square"),
                    (long) object.get("udp")
            ));
        }*/

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
