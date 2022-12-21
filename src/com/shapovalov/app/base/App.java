package com.shapovalov.app.base;

import com.shapovalov.app.base.layers.InitializeLayer;
import com.shapovalov.app.base.layers.ProcessLayer;
import com.shapovalov.app.base.layers.StartLayer;

public class App {

    public void run() {
        InitializeLayer initializeLayer = new InitializeLayer();
        initializeLayer.run();
        StartLayer startLayer = new StartLayer();
        startLayer.run();
        ProcessLayer processLayer = new ProcessLayer();
        processLayer.run();
        }
}
