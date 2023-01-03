package com.shapovalov.app.backend.function;

import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.FunctionCall;

public class FunctionCenter {

    public Result handle(String inputRaw) {
        FunctionFormatter functionFormatter = new FunctionFormatter();
        FunctionCall struct = functionFormatter.format(inputRaw);
        FunctionDistributor distributor = new FunctionDistributor();
        return distributor.distribute(struct);
    }
}
