package com.shapovalov.project.app.layers;

import com.shapovalov.project.data.Countries;
import com.shapovalov.project.data.handler.CountriesInit;
import com.shapovalov.utilities.JSONReader;
import org.json.simple.JSONObject;

public class InitializeLayer {

    public void run() {
        //подправить
        JSONReader reader = new JSONReader();
        JSONObject obj = reader.read("resources/data.json");
        CountriesInit init = new CountriesInit();
        init.initialize(obj);


        for (int i = 0; i < Countries.countries.size(); i++) {
            System.out.println(Countries.countries.get(i).getName());
        }
    }
}
