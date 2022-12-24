package com.shapovalov.app.model.functional.entities;

import java.util.ArrayList;

public class Function {
    private String functionName;
    private boolean isParameter;
    private String description;
    private ArrayList<String> examples;

    public Function(String functionName, boolean isParameter, String description, ArrayList<String> examples) {
        this.functionName = functionName;
        this.isParameter = isParameter;
        this.description = description;
        this.examples = examples;
    }

    public String getFunctionName() {
        return functionName;
    }

    public boolean isParameter() {
        return isParameter;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getExamples() {
        return examples;
    }
}