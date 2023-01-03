package com.shapovalov.app.base.components;

import com.shapovalov.app.data.handler.*;
import com.shapovalov.utilities.JSONObjectCreator;
import org.json.simple.JSONObject;

public class InitializeComponent implements AppComponent {

    public void run() {
        FunctionsInitializer.initialize();

        JSONObject obj = JSONObjectCreator.create("resources/data.json");
        CountriesInitializer.initialize(obj);
    }
}