package com.shapovalov.app.backend.function;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.functional.entities.Function;
import com.shapovalov.app.model.functional.entities.FunctionCall;

public class FunctionIsExist {

    boolean validate(FunctionCall struct) {
        if(!isCommandExist(struct)) {
            return false;
        }
        return true;
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
}
