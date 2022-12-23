package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.command.CommandApp;
import com.shapovalov.app.model.command.CommandInput;
import com.shapovalov.app.model.command.CommandStructure;

public class CommandBuilder {

    void build(CommandStructure struct) {
        CommandApp command = null;
        for (int i = 0; i < Commands.commands.size(); i++) {
            if(struct.getCommandName().equals(Commands.commands.get(i).getCommandName())) {
                command = Commands.commands.get(i);
                break;
            }
        }
        CommandInput input = new CommandInput();
        input.id = command.getId();
    }
}
