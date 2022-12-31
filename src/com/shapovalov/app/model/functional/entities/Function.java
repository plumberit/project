package com.shapovalov.app.model.functional.entities;

import java.util.ArrayList;

public class Function {
    private final String functionName;
    private final String description;
    private final ArrayList<String> examples = new ArrayList<>();

    public Function(String functionName, String description) {
        this.functionName = functionName;
        this.description = description;
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
