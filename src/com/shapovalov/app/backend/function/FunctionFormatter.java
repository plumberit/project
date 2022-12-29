package com.shapovalov.app.backend.function;

import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;

public class FunctionFormatter {

    FunctionCall format(String inputRaw) {
        FunctionCall struct;

        inputRaw = deleteExtraSpaces(inputRaw);

        boolean hasParameter = hasParameter(inputRaw);
        struct = rawToStructured(inputRaw, hasParameter);
        return struct;
    }


    private boolean hasParameter(String commandInputRaw) {
        if(commandInputRaw.contains(":")) {
            return true;
        } else {
            return false;

        }
    }

    private FunctionCall rawToStructured
            (String inputRaw, boolean hasParameter) {
        if (!hasParameter) {
            return noParameterHandle(inputRaw);
        } else {
            return yesParameterHandle(inputRaw);
        }
    }

    private FunctionCall noParameterHandle(String inputRaw) {
        String functionName = deleteAroundSpaces(inputRaw);
        functionName = functionName.toUpperCase();

        FunctionCall struct = new FunctionCall();
        struct.setFunctionName(functionName);
        struct.setParameters(null);
        return struct;
    }

    private FunctionCall yesParameterHandle(String inputRaw) {
        //разбиение введенной команды на символы и помещение их в массив
        int indexSeparator = inputRaw.indexOf(':');

        String functionName = inputRaw.substring(0, indexSeparator);
        functionName = deleteAroundSpaces(functionName);
        functionName = functionName.toUpperCase();
        String parameters = inputRaw.substring(indexSeparator+1);
        ArrayList <String> parametersList = parametersHandle(parameters);

        FunctionCall struct = new FunctionCall();
        struct.setFunctionName(functionName);
        struct.setParameters(parametersList);
        return struct;
    }


    private String deleteAroundSpaces(String stroke) {

        //удаление пробелов в первом и последнем символе
        if(stroke.charAt(0)==' ') {
            stroke = stroke.substring(1);
        }
        if(stroke.charAt(stroke.length()-1)==' ') {
            stroke = stroke.substring(0, stroke.length()-1);
        }
        return stroke;
    }

    private String deleteExtraSpaces(String stroke) {
        //удаление лишних пробелов
        String space = " ";
        String doubleSpace = "  ";
        while (stroke.contains(doubleSpace)) {
            stroke = stroke.replace(doubleSpace, space);
        }
        return stroke;
    }

    private ArrayList<String> parametersHandle(String parameters) {
        ArrayList<String> params = new ArrayList<>();
        while (parameters.contains(",")) {
            int index = parameters.indexOf(',');
            params.add(parameters.substring(0, index));
            parameters = parameters.substring(index+1);
        }
        //добавить последний параметр
        params.add(parameters);
        ArrayList<String> paramsNew = new ArrayList<>();
        for (int i = 0; i <params.size(); i++) {
            paramsNew.add(deleteAroundSpaces(params.get(i).toUpperCase()));
        }
        return paramsNew;
    }

}