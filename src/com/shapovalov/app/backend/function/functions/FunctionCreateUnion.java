package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.model.Result;

import java.util.ArrayList;

public class FunctionCreateUnion implements FunctionRealisation {
    @Override
    public Result handle(ArrayList<String> parameters) {
        Result result = new Result();
        result.setError(true);
        result.getStrokes().add("Function is temporary not realized");
        return result;
    }
}
