package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.model.Result;

import java.util.ArrayList;

public interface FunctionLogic {
    public Result handle();
    public Result handle(ArrayList<String> parameters);

}
