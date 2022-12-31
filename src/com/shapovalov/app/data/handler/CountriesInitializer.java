package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Countries;
import com.shapovalov.app.model.Country;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CountriesInitializer {

    public void initialize(JSONObject obj) {
        JSONObject countryPacksJSON = (JSONObject) obj.get("country packs");
        JSONArray countriesJSON = (JSONArray) countryPacksJSON.get("countries v1");

        for (Object country : countriesJSON) {
            JSONObject object = (JSONObject) country;
            Countries.countries.add(new Country(
                    ((Long) object.get("id")).intValue(),
                    ((String) object.get("name")).toUpperCase(),
                    (long) object.get("population"),
                    ((Long) object.get("square")).intValue(),
                    (long) object.get("GDP")
            ));
        }
        Countries.toReadMode();
    }

}