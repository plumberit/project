package com.shapovalov.app.backend.function;

import com.shapovalov.app.backend.function.functions.*;
import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;

public class FunctionDistributor {

    public Result distribute(FunctionCall struct) {
        String name = struct.getFunctionName();
        ArrayList<String> parameters = struct.getParameters();
        FunctionRealisation realisation;
        if (name.equals("HELP")) {
            realisation = new FunctionHelp();
        } else if (name.equals(Functions.FUNCTIONS.get(0).getFunctionName())) {
            realisation = new FunctionCompare();
        }else if (name.equals(Functions.FUNCTIONS.get(1).getFunctionName())) {
            realisation = new FunctionCreateUnion();
        }else if (name.equals(Functions.FUNCTIONS.get(2).getFunctionName())) {
            realisation = new FunctionDeleteUnion();
        }else if (name.equals(Functions.FUNCTIONS.get(3).getFunctionName())) {
            realisation = new FunctionDetail();
        }else if (name.equals(Functions.FUNCTIONS.get(4).getFunctionName())) {
            realisation = new FunctionShow();
        } else {
            Result result = new Result();
            result.setError(true);
            result.getStrokes().add("Function is exist.");
            return result;
        }
        return realisation.handle(parameters);
    }
}