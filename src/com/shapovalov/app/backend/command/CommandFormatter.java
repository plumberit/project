package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.command.Command;
import com.shapovalov.app.model.command.CommandInputStructured;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandFormatter {

    public enum CommandFormatterState {
        SUCCESS,
        COMMAND_NOT_EXIST_ERROR,
        COMMAND_HAS_PARAMETERS_ERROR,
        COMMAND_HAS_NOT_PARAMETERS_ERROR
    }

    static CommandFormatterState status;

    CommandInputStructured format(String commandInputRaw) {
        boolean hasParameter =
                hasParameter(commandInputRaw);
        CommandInputStructuredDemo demo =
                rawToStructured(commandInputRaw, hasParameter);
        if (!isCommandExist(demo)) {
            status = CommandFormatterState.COMMAND_NOT_EXIST_ERROR;
            return null;
        }
        if(!hasParameter && !getParameterStatus(demo)) {
            status = CommandFormatterState.COMMAND_HAS_PARAMETERS_ERROR;
            return null;
        }
        if(hasParameter && !getParameterStatus(demo)) {
            status = CommandFormatterState.COMMAND_HAS_NOT_PARAMETERS_ERROR;
            return null;
        }

        return createStructured(demo);

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

    private CommandInputStructuredDemo rawToStructured
            (String commandInputRaw, boolean hasParameter) {
        if (!hasParameter) {
            return noParameterHandle(commandInputRaw);
        } else {
            return yesParameterHandle(commandInputRaw);
        }
    }

    private CommandInputStructuredDemo noParameterHandle(String commandInputRaw) {
        String commandInputName = commandInputRaw;

        CommandInputStructuredDemo commandInputStructuredDemo =
                new CommandInputStructuredDemo();
        commandInputStructuredDemo.commandInputName = commandInputName;
        commandInputStructuredDemo.parameters = null;
        commandInputStructuredDemo.hasParameter = false;
        return commandInputStructuredDemo;
    }

    private CommandInputStructuredDemo yesParameterHandle(String commandInputRaw) {
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

        CommandInputStructuredDemo commandInputStructuredDemo =
                new CommandInputStructuredDemo();
        commandInputStructuredDemo.commandInputName = commandInputName;
        commandInputStructuredDemo.parameters = parametersList;
        commandInputStructuredDemo.hasParameter = true;
        return commandInputStructuredDemo;
    }

    private CommandInputStructured createStructured
            (CommandInputStructuredDemo demo) {
        Command command = null;
        for (int i = 0; i < Commands.commands.size(); i++) {
            if(demo.commandInputName.equals(Commands.commands.get(i).getCommandName())) {
                command = Commands.commands.get(i);
            }
        }
            CommandInputStructured commandInputStructured =
                    new CommandInputStructured(
                            command.getId(),
                            command.getCommandName(),
                            command.isParameter(),
                            null
                    );
            return commandInputStructured;

    }


    private boolean isCommandExist(CommandInputStructuredDemo demo) {
        for (Command command : Commands.commands) {
            if (demo.commandInputName.equals(command.getCommandName())) {
                return true;
            }
        }
        return false;
    }

    private boolean getParameterStatus(CommandInputStructuredDemo demo) {
        for (Command command : Commands.commands) {
            if (!demo.hasParameter && !command.isParameter()
                    && demo.commandInputName.equals(command.getCommandName())) {
                return true;
            }
            if (demo.hasParameter && command.isParameter()
                    && demo.commandInputName.equals(command.getCommandName())) {
                return true;
            }
        }
        return false;
    }



    private static class CommandInputStructuredDemo {
        private String commandInputName;
        private ArrayList<String> parameters;
        private boolean hasParameter;
    }


}