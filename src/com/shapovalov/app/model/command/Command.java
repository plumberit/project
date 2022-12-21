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

    public void setId(int id) {
        this.id = id;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }


    public boolean isParameter() {
        return isParameter;
    }

    public void setParameter(boolean parameter) {
        isParameter = parameter;
    }
}
