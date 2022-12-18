package com.shapovalov.project.utils;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.Scanner;

public class JSONReader {

    public JSONObject read(String filePath) {
        String JSONFileText = JSONFileReader(filePath);
        JSONObject object = JSONObjectCreator(JSONFileText);
        return object;
    }

    private static String JSONFileReader(String filePath) {
        StringBuilder str = new StringBuilder();
        try {
            FileReader fr = new FileReader(filePath);
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
}
