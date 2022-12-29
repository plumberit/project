package com.shapovalov.app.base.layers;

import com.shapovalov.app.data.handler.CountriesInitializer;
import com.shapovalov.app.data.handler.FunctionsInitializer;
import com.shapovalov.utilities.JSONReader;
import org.json.simple.JSONObject;

public class InitializeLayer {

    public void run() {
        JSONReader reader = new JSONReader();
        JSONObject obj = reader.read("resources/data.json");

        CountriesInitializer initC = new CountriesInitializer();
        initC.initialize(obj);
        FunctionsInitializer initF = new FunctionsInitializer();
        initF.initialize();

    }
}
