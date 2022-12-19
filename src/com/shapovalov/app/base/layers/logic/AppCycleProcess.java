package com.shapovalov.app.base.layers.logic;

import com.shapovalov.app.backend.command.CommandCenter;
import com.shapovalov.app.view.View;

public class AppCycleProcess {
    public void run() {
        View view = new View();
        String input = view.getInput();
        CommandCenter commandCenter = new CommandCenter();
        commandCenter.handle(input);
    }
}
