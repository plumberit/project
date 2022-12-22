package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.command.Command;
import com.shapovalov.app.model.command.CommandInputStructured;

public class CommandCenter {

    public void handle(String inputRaw) {
        CommandFormatter commandFormatter = new CommandFormatter();
        CommandInputStructured command = commandFormatter.format(inputRaw);

        System.out.println(command.getCommandName());
        if(command.parameters != null) {
            for (String str:
                    command.parameters) {
                System.out.println(str);
            }
        }


    }
}
