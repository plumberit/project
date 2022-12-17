package com.shapovalov.project.app.layers;

import com.shapovalov.project.utils.JSONReader;

public class InitializeLayer {

    public void run() {
        JSONReader JSONReader = new JSONReader();
        JSONReader.init();
    }
}
