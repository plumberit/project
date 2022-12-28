package com.shapovalov.app.data.handler;

import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.functional.entities.Function;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class FunctionsInitializer {
    public void initialize(JSONObject obj) {
        JSONObject functionPacks = (JSONObject) obj.get("function packs");
        JSONArray functions = (JSONArray) functionPacks.get("functions v1");


        for (Object function : functions) {
            JSONObject object = (JSONObject) function;

            JSONArray examples = (JSONArray) object.get("examples");
            ArrayList<String> strokes = new ArrayList<>();
            for (Object example : examples) {
                strokes.add((String) example);
            }

            Functions.functions.add(new Function(
                    (String) object.get("name"),
                    (String) object.get("description"),
                    strokes
            ));
        }


    }
}
