package com.shapovalov.app.backend.function;

import com.shapovalov.app.backend.function.functions.*;
import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;

public class FunctionDistributor {

    public Result distribute(FunctionCall struct) {
        String functionName = struct.getFunctionName();
        ArrayList<String> parameters = struct.getParameters();
        FunctionRealisation func = null;
        if(functionName.equals(Functions.FUNCTIONS.get(0).getFunctionName())) {
            func = new FunctionCompare();
        } else if(functionName.equals(Functions.FUNCTIONS.get(1).getFunctionName())) {
            func = new FunctionCreateUnion();
        }else if(functionName.equals(Functions.FUNCTIONS.get(2).getFunctionName())) {
            func = new FunctionDeleteUnion();
        } else if(functionName.equals(Functions.FUNCTIONS.get(3).getFunctionName())) {
            func = new FunctionDetail();
        }else if(functionName.equals(Functions.FUNCTIONS.get(4).getFunctionName())) {
            func = new FunctionShow();
        } else {
            Result result = new Result();
            result.getStrokes().add("Function does not exist.");
            result.setError(true);
            return result;
        }
        return func.handle(parameters);
    }
}
