package com.shapovalov.app.backend.command;

public class CommandCenter {

    public void handle(String command) {
        CommandFormatter commandFormatter = new CommandFormatter();
        commandFormatter.format(command);
    }
}
