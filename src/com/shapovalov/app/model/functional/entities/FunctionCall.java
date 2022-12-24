package com.shapovalov.app.model.functional.entities;

import java.util.ArrayList;

public class FunctionCall {
    private String functionName;
    private ArrayList<String> parameters;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }
}
