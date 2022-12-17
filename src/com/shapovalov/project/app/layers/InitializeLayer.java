package com.shapovalov.project.app.layers;

import com.shapovalov.project.entities.utils.JSONCountriesInitializer;
import com.shapovalov.project.utils.JSONReader;
import org.json.simple.JSONObject;

public class InitializeLayer {

    public void run() {
        JSONReader JSONReader = new JSONReader();
        JSONObject obj = JSONReader.initialize();
        JSONCountriesInitializer init = new JSONCountriesInitializer();
        init.initialize(obj);
    }
}
