package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.functional.entities.FunctionCall;

public class CommandCenter {

    public void handle(String inputRaw) {
        CommandFormatter commandFormatter = new CommandFormatter();
        FunctionCall struct = commandFormatter.format(inputRaw);
        CommandIsExist commandIsExist = new CommandIsExist();
        CommandIsExist.Status status = commandIsExist.validate(struct);
        if(status == CommandIsExist.Status.EXIST) {
            //свзять каркас команды с реальной
        } else {
            //обработать все статусы
        }
    }
}
