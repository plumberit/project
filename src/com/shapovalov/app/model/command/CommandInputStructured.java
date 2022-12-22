package com.shapovalov.app.model.command;

import java.util.ArrayList;

public class CommandInputStructured extends Command {
    public ArrayList<String> parameters;

    public CommandInputStructured(int id, String commandName, boolean isParameter, ArrayList<String> parameters) {
        super(id, commandName, isParameter);
        this.parameters = parameters;
    }


}
