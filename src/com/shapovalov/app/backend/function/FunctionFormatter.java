package com.shapovalov.app.backend.function;

import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;

/*
 * Задача класса заклюачается в следующем
 * превратить "сырой" инпут
 * в чётко структурируемый объект
 * котором можно отдельно обратиться к названию команды или к отдельному параметру
 * в этом классе НЕ стоит задача связать полученный объект с настоящей командой
 * */

public class FunctionFormatter {

    FunctionCall format(String inputRaw) {
        FunctionCall struct;

        inputRaw = deleteExtraSpaces(inputRaw);

        boolean hasParameter = hasParameter(inputRaw);
        struct = rawToStructured(inputRaw, hasParameter);
        return struct;
    }


    private boolean hasParameter(String commandInputRaw) {
        //заменить на более краткий String метод
        char[] symbolsOfInput = commandInputRaw.toCharArray();
        for (int i = 0; i < symbolsOfInput.length; i++) {
            if (symbolsOfInput[i] == '[') {
                return true;
            }
        }
        return false;
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

        FunctionCall struct = new FunctionCall();
        struct.setFunctionName(functionName);
        struct.setParameters(null);
        return struct;
    }

    private FunctionCall yesParameterHandle(String inputRaw) {
        //разбиение введенной команды на символы и помещение их в массив
        int indexSeparator = inputRaw.indexOf('[');

        String functionName = inputRaw.substring(0, indexSeparator);
        functionName = deleteAroundSpaces(functionName);
        String parameters = inputRaw.substring(indexSeparator);

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
        while (parameters.contains("[")||parameters.contains("]")) {
            int firstCrap = parameters.indexOf('[');
            int secondCrap = parameters.indexOf(']');
            params.add(parameters.substring(firstCrap+1, secondCrap));
            parameters = parameters.substring(secondCrap+1);
        }
        ArrayList<String> paramsNew = new ArrayList<>();
        for (int i = 0; i <params.size(); i++) {
            paramsNew.add(deleteAroundSpaces(params.get(i)));
        }
        return paramsNew;
    }

}