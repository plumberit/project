package com.shapovalov.app.model.functional.entities;

import java.util.ArrayList;

public class Function {
    private String functionName;
    private String description;
    private ArrayList<String> examples;

    public Function(String functionName, String description, ArrayList<String> examples) {
        this.functionName = functionName;
        this.description = description;
        this.examples = examples;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getExamples() {
        return examples;
    }
}