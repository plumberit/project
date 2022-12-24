package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.functional.entities.Function;
import com.shapovalov.app.model.functional.entities.FunctionCall;

public class CommandIsExist {

    enum Status {
        EXIST,
        COMMAND_NOT_EXIST,
        PARAMETER_REQUIRED,
        PARAMETER_NOT_REQUIRED
    }

    Status validate(FunctionCall struct) {
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

    private boolean hasParameter(FunctionCall struct) {
        boolean hasParameter;
        if(struct.getParameters()==null) {
            hasParameter = false;
        } else {
            hasParameter = true;
        }
        return hasParameter;
    }

    private boolean isCommandExist(FunctionCall struct) {
        for (Function command : Commands.commands) {
            if (command.getFunctionName().
                    equals(struct.getFunctionName())) {
                return true;
            }
        }
        return false;
    }

    private boolean noParameter(FunctionCall struct) {
        for (Function command : Commands.commands) {
            if (
                    command.getFunctionName()
                            .equals(struct.getFunctionName())
            && command.getParameters()==null) {
                return true;
            }
        }
        return false;
    }

    private boolean yesParameter(FunctionCall struct) {
        for (Function command : Commands.commands) {
            if (
                    command.getFunctionName()
                            .equals(struct.getFunctionName())
                            && command.getParameters()!=null) {
                return true;
            }
        }
        return false;
    }
}
