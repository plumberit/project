package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.functional.entities.Function;
import com.shapovalov.app.model.functional.entities.FunctionCall;

public class CommandBuilder {

    void build(FunctionCall struct) {
        Function command = null;
        for (int i = 0; i < Commands.commands.size(); i++) {
            if(struct.getFunctionName().equals(Commands.commands.get(i).getFunctionName())) {
                command = Commands.commands.get(i);
                break;
            }
        }
        CommandInput input = new CommandInput();
        input.id = command.getId();
    }
}
