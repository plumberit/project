package com.shapovalov.app.base;

import com.shapovalov.app.base.layers.AppComponent;
import com.shapovalov.app.base.layers.InitializeLayer;
import com.shapovalov.app.base.layers.ProcessLayer;
import com.shapovalov.app.base.layers.StartLayer;

public class App {

    public void run() {

        AppComponent initializeLayer, startLayer, processLayer;

        initializeLayer = new InitializeLayer();
        startLayer = new StartLayer();
        processLayer = new ProcessLayer();

        initializeLayer.run();
        startLayer.run();
        processLayer.run();
    }
}
