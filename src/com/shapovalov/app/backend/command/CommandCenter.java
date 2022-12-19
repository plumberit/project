package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.Command;

public class CommandCenter {

    public void handle(String command) {
        CommandFormatter commandFormatter = new CommandFormatter();
        Command commandObj = commandFormatter.format(command);
    }
}
