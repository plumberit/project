package com.shapovalov.app.backend.function.functions.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class ReadableNum {

    public String toReadableNum(String number) {
        //строку в массив символов
        //но так как строка фактически является числом
        //то абстрактно это разбитие числа на цифры
        char[] digitsChar = number.toCharArray();
        String[] digitsString = new String[digitsChar.length];

        //массив символов в массив строк
        //строки нужны далее для работы
        for (int i = 0; i < number.length(); i++) {
            digitsString[i] = String.valueOf(digitsChar[i]);
        }
        //массив в коллекцию
        ArrayList<String> digits =
                new ArrayList<String> (Arrays.asList(digitsString));

        //есть число - 42435768
        //читабельный вид - 42 435 768
        //в этом числе две полные "пачки" - набор из трех
        //и одна неполная (она всегда одна или вообще отсутствует)

        //количество цифр в неполной "пачке"
        int rest = number.length() % 3;
        //количество полных "пачек"
        int fullPacksNum = (number.length() - rest) / 3;

        //количество "пачек" всего
        int packsNum;
        if (rest == 0) {
            packsNum = fullPacksNum;
        } else {
            packsNum = fullPacksNum + 1;
        }

        //строка для НЕполной "пачки"
        String notFullPack = "";
        //массив из строк
        //на месте каждого элемента будет ПОЛНАЯ "пачка"
        String[] fullPacks = new String[fullPacksNum];
        //инциализация строк из массива, чтобы они не были null
        Arrays.fill(fullPacks, "");

        //если есть НЕполная "пачка"
        if (rest != 0) {
            //формируем первую НЕполную "пачку"
            for (int i = 0; i < rest; i++) {
                notFullPack = notFullPack.concat(digitsString[i]);
            }
            //удаляем цифры, которые уже использовали
            for (int i = 0; i < rest; i++) {
                digits.remove(0);
            }
        }
        //формируем полные пачки
        for (int i = 0; i < fullPacksNum; i++) {
            //берём первые 3 цифры
            fullPacks[i] = fullPacks[i].concat(digits.get(0));
            fullPacks[i] = fullPacks[i].concat(digits.get(1));
            fullPacks[i] = fullPacks[i].concat(digits.get(2));
            //удаляем эти самые 3 цифры (после того как используем)
            digits.remove(0);
            digits.remove(0);
            digits.remove(0);
        }

        //если есть НЕполная "пачка"
        if (rest != 0) {
            //добавляем пробел к НЕполной "пачке"
            notFullPack = notFullPack.concat(" ");
        }
        //добавляем пробелы ко всем полным "пачкам" кроме последней
        for (int i = 0; i < fullPacksNum - 1; i++) {
            fullPacks[i] = fullPacks[i].concat(" ");
        }

        //собираем всё во едино
        String finalResult = notFullPack;
        for (int i = 0; i < fullPacksNum; i++) {
            finalResult = finalResult.concat(fullPacks[i]);
        }
        return finalResult;
    }
}
