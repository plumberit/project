package com.shapovalov.app.model;

import java.util.ArrayList;

public class Command {
    private String command;
    private String description;
    private boolean parameter;
    private ArrayList<String> examples = new ArrayList<>();

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean isParameter() {
        return parameter;
    }

    public void setParameter(boolean parameter) {
        this.parameter = parameter;
    }
}
