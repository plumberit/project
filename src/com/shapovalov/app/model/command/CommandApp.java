package com.shapovalov.app.model.command;

import java.util.ArrayList;

public class CommandApp extends CommandStructure {
    private int id;
    private boolean isParameter;
    private String description;
    private ArrayList<String> examples;

    public CommandApp(int id, boolean isParameter, String description, ArrayList<String> examples) {
        this.id = id;
        this.isParameter = isParameter;
        this.description = description;
        this.examples = examples;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isParameter() {
        return isParameter;
    }

    public void setParameter(boolean parameter) {
        isParameter = parameter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getExamples() {
        return examples;
    }

    public void setExamples(ArrayList<String> examples) {
        this.examples = examples;
    }
}