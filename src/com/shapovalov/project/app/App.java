package com.shapovalov.project.app;

import com.shapovalov.project.app.layers.InitializeLayer;
import com.shapovalov.project.app.layers.ProcessLayer;

public class App {

    public void run() {

        InitializeLayer initializeLayer = new InitializeLayer();
        initializeLayer.run();
        ProcessLayer processLayer = new ProcessLayer();
        processLayer.run();
        }
}
