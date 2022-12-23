package com.shapovalov.app.model.command;

import java.util.ArrayList;

public class CommandStructure {
    private String commandName;
    private ArrayList<String> parameters;

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }
}
