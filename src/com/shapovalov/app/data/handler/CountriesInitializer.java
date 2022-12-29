package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CountriesInitializer {

    public void initialize(JSONObject obj) {
        JSONObject countryPacks = (JSONObject) obj.get("country packs");
        JSONArray countries = (JSONArray) countryPacks.get("countries v1");

        for (Object country : countries) {
            JSONObject object = (JSONObject) country;
            Countries.countries.add(new Country(
                    ((Long) object.get("id")).intValue(),
                    ((String) object.get("name")).toUpperCase(),
                    (long) object.get("population"),
                    ((Long) object.get("square")).intValue(),
                    (long) object.get("GDP")
            ));
        }
    }

}
