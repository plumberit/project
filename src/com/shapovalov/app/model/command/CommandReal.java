package com.shapovalov.app.model.command;

import java.util.ArrayList;

public class CommandReal extends Command{
    private String description;
    private ArrayList<String> examples = new ArrayList<>();

    public CommandReal(int id, String commandName, boolean isParameter, String description, ArrayList<String> examples) {
        super(id, commandName, isParameter);
        this.description = description;
        this.examples = examples;
    }

    public ArrayList<String> getExamples() {
        return examples;
    }

    public void setExamples(ArrayList<String> examples) {
        this.examples = examples;
    }
}