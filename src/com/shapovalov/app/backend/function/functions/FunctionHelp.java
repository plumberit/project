package com.shapovalov.app.backend.function.functions;

import com.shapovalov.app.data.Functions;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.model.functional.entities.Function;

import java.util.ArrayList;

public class FunctionHelp implements FunctionRealisation {
    @Override
    public Result handle(ArrayList<String> parameters) {
        Result result = new Result();
        result.getStrokes().add("LIST OF FUNCTIONS");
        result.getStrokes().add("");
        for (Function function : Functions.FUNCTIONS) {
            result.getStrokes().add(function.getFunctionName());
            result.getStrokes().add(function.getDescription());
            result.getStrokes().add("");
            result.getStrokes().add("Examples of usage:");
            for (String str : function.getExamples()) {
                result.getStrokes().add(str);
            }
            result.getStrokes().add("");
            result.getStrokes().add("");
            result.getStrokes().add("");
        }
        result.getStrokes().add("Названия функций и стран можно вводить в любом регистре.");
        result.getStrokes().add("Например: cOmParE : gerMANy, iTAlY");

        return result;
    }
}
