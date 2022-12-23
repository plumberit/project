package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.command.CommandStructure;

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

    CommandStructure format(String commandInputRaw) {
        CommandStructure struct;
        boolean hasParameter = hasParameter(commandInputRaw);
         struct = rawToStructured(commandInputRaw, hasParameter);
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

    private CommandStructure rawToStructured
            (String commandInputRaw, boolean hasParameter) {
        if (!hasParameter) {
            return noParameterHandle(commandInputRaw);
        } else {
            return yesParameterHandle(commandInputRaw);
        }
    }

    private CommandStructure noParameterHandle(String commandInputRaw) {
        String commandInputName = commandInputRaw;

        CommandStructure struct = new CommandStructure();
        struct.setCommandName(commandInputName);
        struct.setParameters(null);
        return struct;
    }

    private CommandStructure yesParameterHandle(String commandInputRaw) {
        //разбиение введенной команды на символы и помещение их в массив
        int indexSeparator = 0;
        char[] symbolsOfInput = commandInputRaw.toCharArray();
        for (int i = 0; i < symbolsOfInput.length; i++) {
            if (symbolsOfInput[i] == '[') {
                indexSeparator = i;
                break;
            }
        }

        String commandInputName = commandInputRaw.substring(0, indexSeparator - 1);
        String parameters = commandInputRaw.substring(indexSeparator, symbolsOfInput.length);

        String[] parametersArr = parameters.split(" ");
        ArrayList<String> parametersList = new ArrayList<>(Arrays.asList(parametersArr));

        CommandStructure struct = new CommandStructure();
        struct.setCommandName(commandInputName);
        struct.setParameters(parametersList);
        return struct;
    }

}