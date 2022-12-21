package com.shapovalov.app.backend.command;

import com.shapovalov.app.data.Commands;
import com.shapovalov.app.model.command.Command;

import java.util.ArrayList;

public class CommandFormatter {
    Command format(String inputRaw) {
        //разбиение введенной команды на символы и помещение их в массив
        char[] arr = inputRaw.toCharArray();
        //количество символов в массиве - пригодится потом
        int maxSize = arr.length;

        //создание массива из названий команд
        String[] commandNames = new String[Commands.commands.size()];
        for (int i = 0; i < Commands.commands.size(); i++) {
            commandNames[i] = Commands.commands.get(i).getCommandName();
        }

        //создание коллекции из массивов, которые хранят символы
        //массив с символами - название команды, разбитое посимвольно
        ArrayList<char[]> arraysWithSymbolsOfCommandNames = new ArrayList<>();
        for (int i = 0; i < Commands.commands.size(); i++) {
            arraysWithSymbolsOfCommandNames.add(commandNames[i].toCharArray());
        }

        //создание урезанной коллекции
        //алгоритм предусматривает, что названия команд
        //поочередно будут сравнивать (посимвольно) с командой, которую ввели
        //но иногда введенная команда является более короткой
        //чем команды существующие
        //для этого нам надо обрезать названия команд
        //до размера введенной команды
        ArrayList<char[]> cut = new ArrayList<>();
        //в этом цикле мы только декларируем размеры массивов
        for (int i = 0; i < commandNames.length; i++) {
            if (arraysWithSymbolsOfCommandNames.get(i).length > maxSize) {
                cut.add(new char[maxSize]);
            } else {
                cut.add(new char[arraysWithSymbolsOfCommandNames.get(i).length]);
            }
        }
        //а тут мы инициализируем эти массивы
        for (int i = 0; i < cut.size(); i++) {
            for (int j = 0; j < cut.get(i).length; j++) {
                cut.get(i)[j] = arraysWithSymbolsOfCommandNames.get(i)[j];
            }
        }

        //непосредственно сравнение команд с введенной
        //команды, которые не прошли - помечаем в массиве названий команд - null
        for (int i = 0; i < commandNames.length; i++) {
            for (int j = 0; j < cut.get(i).length; j++) {
                if (cut.get(i)[j] != arr[j]) {
                    commandNames[i] = null;
                }
            }
        }

        //перебираем массив названий команд
        //если не null, то вывести команду на экран
        for (int i = 0; i < commandNames.length; i++) {
            if (commandNames[i]!=null) {
                System.out.println(commandNames[i]);
            }
        }


        return null;
    }
}
