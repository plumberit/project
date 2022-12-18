package com.shapovalov.project.app.layers;

import com.shapovalov.project.view.View;

public class StartLayer {
    public void run() {
        View view = new View();
        view.greeting();
        view.tip();
    }
}
