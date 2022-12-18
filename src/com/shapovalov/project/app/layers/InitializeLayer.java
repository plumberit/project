package com.shapovalov.project.app.layers;

import com.shapovalov.project.data.Countries;
import com.shapovalov.project.data.handler.JSONCountriesInitializer;
import com.shapovalov.project.utils.JSONReader;
import org.json.simple.JSONObject;

public class InitializeLayer {

    public void run() {
        //подправить
        JSONReader reader = new JSONReader();
        JSONObject obj = reader.read();
        JSONCountriesInitializer init = new JSONCountriesInitializer();
        init.initialize(obj);


        for (int i = 0; i < Countries.countries.size(); i++) {
            System.out.println(Countries.countries.get(i).getName());
        }
    }
}
