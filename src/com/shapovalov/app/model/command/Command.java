package com.shapovalov.app.model.command;

public abstract class Command {
    private int id;
    private String commandName;
    private boolean isParameter;

    public Command(int id, String commandName, boolean isParameter) {
        this.id = id;
        this.commandName = commandName;
        this.isParameter = isParameter;
    }

    public int getId() {
        return id;
    }

    public String getCommandName() {
        return commandName;
    }

    public boolean isParameter() {
        return isParameter;
    }
}
