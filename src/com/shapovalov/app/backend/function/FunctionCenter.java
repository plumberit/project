package com.shapovalov.app.backend.function;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.functional.entities.FunctionCall;

public class FunctionCenter {

    public void handle(String inputRaw) {
        FunctionFormatter functionFormatter = new FunctionFormatter();
        FunctionCall struct = functionFormatter.format(inputRaw);
        FunctionDistributor distributor = new FunctionDistributor();
        boolean isExist = distributor.isExist(struct);
        if(isExist) {
            switch (struct.getFunctionName()) {
                //case Commands.commands.get(0).getFunctionName():

            }
        } else {

        }
    }
}
