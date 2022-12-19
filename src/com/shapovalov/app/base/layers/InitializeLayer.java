package com.shapovalov.app.base.layers;

import com.shapovalov.app.data.handler.CountriesInitializer;
import com.shapovalov.utilities.JSONReader;
import org.json.simple.JSONObject;

public class InitializeLayer {

    public void run() {
        //подправить
        JSONReader reader = new JSONReader();
        JSONObject obj = reader.read("resources/data.json");


        CountriesInitializer init = new CountriesInitializer();
        init.initialize(obj);


    }
}
