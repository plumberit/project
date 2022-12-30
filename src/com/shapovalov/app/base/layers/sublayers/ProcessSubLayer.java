package com.shapovalov.app.base.layers.sublayers;

import com.shapovalov.app.backend.function.FunctionCenter;
import com.shapovalov.app.base.layers.AppComponent;
import com.shapovalov.app.model.Result;
import com.shapovalov.app.view.Display;
import com.shapovalov.app.view.View;

public class ProcessSubLayer implements AppComponent {
    public void run() {
        Display display = new Display();
        String input = display.input();
        FunctionCenter functionCenter = new FunctionCenter();
        Result result = functionCenter.handle(input);
        View view = new View();
        if(result.isError()) {
            view.setError(result.getStrokes());
        } else {
            view.setResult(result.getStrokes());
        }
        display.output(view.getStrokes());
    }
}
