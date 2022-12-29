package com.shapovalov.app.data.handler;

import org.json.simple.JSONObject;

public class CollectionInitializer {

    public void initialize(JSONObject obj) {
        CountriesInitializer initC = new CountriesInitializer();
        initC.initialize(obj);
        FunctionsInitializer initF = new FunctionsInitializer();
        initF.initialize();
    }
}
