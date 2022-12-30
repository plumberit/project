package com.shapovalov.app.base.layers;

import com.shapovalov.app.view.Display;
import com.shapovalov.app.view.View;

public class StartLayer implements AppComponent {
    public void run() {
        View view = new View();
        view.setGreeting();
        view.setTip();

        Display display = new Display();
        display.output(view.getStrokes());
    }
}
