package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.functional.entities.FunctionCall;

public class FunctionCenter {

    public void handle(String inputRaw) {
        FunctionFormatter functionFormatter = new FunctionFormatter();
        FunctionCall struct = functionFormatter.format(inputRaw);
        FunctionIsExist functionIsExist = new FunctionIsExist();
        boolean isExist = functionIsExist.validate(struct);
        if(isExist) {

        } else {
            
        }
    }
}
