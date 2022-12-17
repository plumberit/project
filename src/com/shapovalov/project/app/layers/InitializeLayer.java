package com.shapovalov.project.app.layers;

import com.shapovalov.project.entities.utils.JSONCountriesInitializer;
import com.shapovalov.project.utils.JSONReader;

public class InitializeLayer {

    public void run() {
        JSONReader JSONReader = new JSONReader();
        JSONCountriesInitializer init =
                new JSONCountriesInitializer(JSONReader.initialize());
    }
}
