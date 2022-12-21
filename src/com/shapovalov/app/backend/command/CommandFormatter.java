package com.shapovalov.app.backend.command;

import com.shapovalov.app.model.command.Command;

public class CommandFormatter {
    Command format(String inputRaw) {
        char [] arr = inputRaw.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                for (int j = 0; j < i; j++) {
                    
                }
            }
        }
        return null;
    }
}
