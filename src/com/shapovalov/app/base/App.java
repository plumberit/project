package com.shapovalov.app.base;

import com.shapovalov.app.base.layers.AppComponent;
import com.shapovalov.app.base.layers.InitializeLayer;
import com.shapovalov.app.base.layers.ProcessLayer;
import com.shapovalov.app.base.layers.StartLayer;

public class App {

    public void run() {
        AppComponent initializeLayer = new InitializeLayer();
        initializeLayer.run();
        AppComponent startLayer = new StartLayer();
        startLayer.run();
        AppComponent processLayer = new ProcessLayer();
        processLayer.run();
        }
}
