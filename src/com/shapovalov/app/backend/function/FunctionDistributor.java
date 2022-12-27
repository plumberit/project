package com.shapovalov.app.backend.function;

import com.shapovalov.app.backend.function.functions.*;
import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;

public class FunctionDistributor {

    public Result distribute(FunctionCall struct) {
        String functionName = struct.getFunctionName();
        ArrayList<String> parameters = struct.getParameters();
        if(functionName.equals(Commands.commands.get(0).getFunctionName())) {
            FunctionCompare func = new FunctionCompare();
            return func.handle(parameters);
        }
        if(functionName.equals(Commands.commands.get(1).getFunctionName())) {
            FunctionCreateUnion func = new FunctionCreateUnion();
            return func.handle(parameters);
        }
        if(functionName.equals(Commands.commands.get(2).getFunctionName())) {
            FunctionDeleteUnion func = new FunctionDeleteUnion();
            return func.handle(parameters);
        }
        if(functionName.equals(Commands.commands.get(3).getFunctionName())) {
            FunctionDetail func = new FunctionDetail();
            return func.handle(parameters);
        }
        if(functionName.equals(Commands.commands.get(4).getFunctionName())) {
            FunctionShow func = new FunctionShow();
            return func.handle();
        }
        Result result = new Result();
        result.getStrokes().add("Function does not exist.");
        result.setError(true);
        return result;
    }
}
