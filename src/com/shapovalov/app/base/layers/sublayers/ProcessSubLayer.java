package com.shapovalov.app.base.layers.sublayers;

import com.shapovalov.app.backend.function.FunctionCenter;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.view.View;

public class ProcessSubLayer {
    public void run() {
        View view = new View();
        String input = view.getInput();
        FunctionCenter functionCenter = new FunctionCenter();
        Result result = functionCenter.handle(input);
        view.showResult(result.getStrokes());
    }
}
