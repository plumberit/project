package com.shapovalov.app.base.layers;

import com.shapovalov.app.view.View;

public class StartLayer {
    public void run() {
        View view = new View();
        view.greeting();
        view.tip();
    }
}
