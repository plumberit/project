package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.command.Command;

public class CommandCenter {

    public void handle(String inputRaw) {
        CommandFormatter commandFormatter = new CommandFormatter();
        Command command = commandFormatter.format(inputRaw);
    }
}
