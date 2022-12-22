package com.shapovalov.app.model.command;

import java.util.ArrayList;

public final class CommandReal extends Command{
    private String description;
    private ArrayList<String> examples;

    public CommandReal(int id, String commandName, boolean isParameter, String description, ArrayList<String> examples) {
        super(id, commandName, isParameter);
        this.description = description;
        this.examples = examples;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getExamples() {
        return examples;
    }
}