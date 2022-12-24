package com.shapovalov.app.base.layers.logic;

import com.shapovalov.app.backend.command.FunctionCenter;
import com.shapovalov.app.view.View;

public class AppCycleProcess {
    public void run() {
        View view = new View();
        String input = view.getInput();
        FunctionCenter functionCenter = new FunctionCenter();
        functionCenter.handle(input);
    }
}
