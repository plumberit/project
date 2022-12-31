package com.shapovalov.app.base.layers;

import com.shapovalov.app.data.handler.*;
import com.shapovalov.utilities.JSONAdapter;
import org.json.simple.JSONObject;

public class InitializeLayer implements AppComponent {

    public void run() {
        JSONAdapter json = new JSONAdapter();
        JSONObject obj = json.get("resources/data.json");

        CountriesInitializer initC = new CountriesInitializer();
        initC.initialize(obj);
        FunctionsInitializer initF = new FunctionsInitializer();
        initF.initialize();

    }
}