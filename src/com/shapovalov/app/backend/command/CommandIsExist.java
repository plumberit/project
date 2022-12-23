package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.command.CommandApp;
import com.shapovalov.app.model.command.CommandStructure;

public class CommandIsExist {

    enum Status {
        EXIST,
        COMMAND_NOT_EXIST,
        PARAMETER_REQUIRED,
        PARAMETER_NOT_REQUIRED
    }

    Status validate(CommandStructure struct) {
        //проверка существует ли введенный
        //COMMAND_NAME в базе
        if(!isCommandExist(struct)) {
            return Status.COMMAND_NOT_EXIST;
        }
        //есть ли у инпута параметры
        boolean hasParameter = hasParameter(struct);
        //проверка для инпута без параметров
        //не ввел ли пользователь параметры (которые не нужны)
        if(!hasParameter && noParameter(struct)) {
            return Status.PARAMETER_NOT_REQUIRED;
        }
        //проверка для инпута с параметрами
        //ввел ли пользователь параметры
        if(hasParameter && yesParameter(struct)) {
            return Status.PARAMETER_REQUIRED;
        }
        return Status.EXIST;
    }

    private boolean hasParameter(CommandStructure struct) {
        boolean hasParameter;
        if(struct.getParameters()==null) {
            hasParameter = false;
        } else {
            hasParameter = true;
        }
        return hasParameter;
    }

    private boolean isCommandExist(CommandStructure struct) {
        for (CommandApp command : Commands.commands) {
            if (command.getCommandName().
                    equals(struct.getCommandName())) {
                return true;
            }
        }
        return false;
    }

    private boolean noParameter(CommandStructure struct) {
        for (CommandApp command : Commands.commands) {
            if (
                    command.getCommandName()
                            .equals(struct.getCommandName())
            && command.getParameters()==null) {
                return true;
            }
        }
        return false;
    }

    private boolean yesParameter(CommandStructure struct) {
        for (CommandApp command : Commands.commands) {
            if (
                    command.getCommandName()
                            .equals(struct.getCommandName())
                            && command.getParameters()!=null) {
                return true;
            }
        }
        return false;
    }
}
