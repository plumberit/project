package com.shapovalov.app.backend.function;

import com.shapovalov.app.backend.function.functions.*;
import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.Function;
import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;

public class FunctionDistributor {

    public Result distribute(FunctionCall struct) {
        String name = struct.getFunctionName();
        ArrayList<String> parameters = struct.getParameters();
        for (Function func : Functions.FUNCTIONS) {
            if(func.getFunctionName().equals(struct.getFunctionName())) {
                return (Result) func.execute(struct.getParameters());
            }
        }
        if (name.equals("HELP")) {
            FunctionRealisation realisation = new FunctionHelp();
            return realisation.handle(parameters);
        } else {
            Result result = new Result();
            result.setError(true);
            result.getStrokes().add("Function is exist.");
            return result;
        }
    }
}