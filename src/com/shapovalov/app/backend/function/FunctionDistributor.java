package com.shapovalov.app.backend.function;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.Function;
import com.shapovalov.app.model.functional.entities.FunctionCall;

public class FunctionDistributor {

    public Result distribute(FunctionCall struct) {
        if(struct.getFunctionName().equals(
                Commands.commands.get(0).getFunctionName())
        ) {

        }
        if(struct.getFunctionName().equals(
                Commands.commands.get(1).getFunctionName())
        ) {

        }if(struct.getFunctionName().equals(
                Commands.commands.get(2).getFunctionName())
        ) {

        }if(struct.getFunctionName().equals(
                Commands.commands.get(3).getFunctionName())
        ) {

        }if(struct.getFunctionName().equals(
                Commands.commands.get(4).getFunctionName())
        ) {

        }
    }

    public void distributor() {

    }
}
