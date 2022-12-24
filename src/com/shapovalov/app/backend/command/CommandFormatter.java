package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.functional.entities.FunctionCall;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Задача класса заклюачается в следующем
 * превратить "сырой" инпут
 * в чётко структурируемый объект
 * котором можно отдельно обратиться к названию команды или к отдельному параметру
 * в этом классе НЕ стоит задача связать полученный объект с настоящей командой
 * */

public class CommandFormatter {

    FunctionCall format(String inputRaw) {
        FunctionCall struct;

        //сделать "убиратель" пробелов

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
        String functionName = spaceDeleter(inputRaw);

        FunctionCall struct = new FunctionCall();
        struct.setFunctionName(functionName);
        struct.setParameters(null);
        return struct;
    }

    private FunctionCall yesParameterHandle(String inputRaw) {
        //разбиение введенной команды на символы и помещение их в массив
        int indexSeparator = 0;
        char[] symbolsOfInput = inputRaw.toCharArray();
        for (int i = 0; i < symbolsOfInput.length; i++) {
            if (symbolsOfInput[i] == '[') {
                indexSeparator = i;
                break;
            }
        }

        String commandInputName = inputRaw.substring(0, indexSeparator - 1);
        String parameters = inputRaw.substring(indexSeparator, symbolsOfInput.length);

        String[] parametersArr = parameters.split(" ");
        ArrayList<String> parametersList = new ArrayList<>(Arrays.asList(parametersArr));

        FunctionCall struct = new FunctionCall();
        struct.setFunctionName(commandInputName);
        struct.setParameters(parametersList);
        return struct;
    }


    private String spaceDeleter(String inputRaw) {
        String [] extraSpaces = {"  ", "   ", "    ", "     "};
        String inputClear = inputRaw;
        for (String i : extraSpaces) {
            inputClear = inputRaw.replace(i, "");
        }

        if(inputClear.charAt(0)==' ') {
            inputClear = inputClear.substring(1);
        }
        if(inputClear.charAt(inputClear.length()-1)==' ') {
            inputClear = inputClear.substring(0, inputClear.length()-1);
        }
        return inputClear;
    }

}