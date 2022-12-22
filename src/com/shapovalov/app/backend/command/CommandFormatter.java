package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.command.Command;
import com.shapovalov.app.model.command.InputStructured;

import java.util.ArrayList;

public class CommandFormatter {

    InputStructured format(String inputRaw) {
        //функция возвращает команду, если у введенной команды
        //не было параметров
        //и команда была валидна
        Command input = isCommandHasParameter(inputRaw);
        if (input != null) {
            InputStructured inputStructured =
                    new InputStructured(
                            input.getId(),
                            input.getCommandName(),
                            input.isParameter(),
                            null
                    );
            return inputStructured;
        }
        //значит функция с параметрами (или не валидна)
        else {
            String [] arr = separateCommandAndParameter(inputRaw);
            Command commandTemporary=null;
            for(Command command : Commands.commands) {
                if(command.getCommandName().equals(arr[0])) {
                    commandTemporary = command;
                }
            }

            InputStructured inputStructured =
                    new InputStructured(
                            commandTemporary.getId(),
                            commandTemporary.getCommandName(),
                            commandTemporary.isParameter(),
                            new ArrayList<>()
                    );

            for (int i = 1; i < arr.length; i++) {
                inputStructured.parameters.add(arr[i]);
            }

            return inputStructured;
        }
    }

    private Command isCommandHasParameter(String inputRaw) {
        for (Command command : Commands.commands) {
            if (!command.isParameter() && inputRaw.equals(command.getCommandName())) {
                return command;
            }
        }
        return null;
    }

    private String[] separateCommandAndParameter(String inputRaw) {
        //разбиение введенной команды на символы и помещение их в массив
        int a=0;
        char[] symbolsOfInput = inputRaw.toCharArray();
        for (int i = 0; i <symbolsOfInput.length ; i++) {
            if(symbolsOfInput[i]=='[') {
                a = i;
                break;
            }
        }

        String command = inputRaw.substring(0, a-1);
        String parameters = inputRaw.substring(a, symbolsOfInput.length);

        String [] parametersArr = parameters.split(" ");
        String [] specArr = new String[parameters.length()+1];
        specArr[0] = command;
        for (int i = 0; i < parametersArr.length; i++) {
            specArr[i+1] = parametersArr[i];
        }
        return specArr;
    }


}
