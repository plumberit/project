package com.shapovalov.app.base.layers;

import com.shapovalov.app.data.handler.CollectionInitializer;
import com.shapovalov.utilities.JSONReader;
import org.json.simple.JSONObject;

public class InitializeLayer {

    public void run() {
        //подправить
        JSONReader reader = new JSONReader();
        JSONObject obj = reader.read("resources/data.json");


        CollectionInitializer init = new CollectionInitializer();
        init.initialize(obj);


    }
}
