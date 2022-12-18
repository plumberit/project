package com.shapovalov.project.app;

import com.shapovalov.project.app.layers.InitializeLayer;
import com.shapovalov.project.app.layers.ProcessLayer;
import com.shapovalov.project.app.layers.StartLayer;

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
