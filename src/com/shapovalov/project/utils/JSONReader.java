package com.shapovalov.project.utils;

import com.shapovalov.project.entities.model.Country;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JSONReader {

    //временная копия
    ArrayList<Country> countries = new ArrayList<>();

    public void init() {
        String JSONFileText = JSONFileReader();
        JSONObject JSONObject = JSONObjectCreator(JSONFileText);
        initializeList(JSONObject);
    }

    private static String JSONFileReader() {
        StringBuilder str = new StringBuilder();
        try {
            FileReader fr = new FileReader("resources/data.json");
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                str.append(scan.nextLine());
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    private static JSONObject JSONObjectCreator(String str) {
        JSONParser parser = new JSONParser();
        JSONObject obj = null;
        try {
            obj = (JSONObject) parser.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    void initializeList(JSONObject obj) {
        JSONArray arr = (JSONArray) obj.get("countries 2020");
        Iterator iterator = arr.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            countries.add(new Country());
            JSONObject object = (JSONObject) iterator.next();
            countries.get(i).setId((int) object.get("id"));
            i++;
        }
    }
}
