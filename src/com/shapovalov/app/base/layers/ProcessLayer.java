package com.shapovalov.app.base.layers;

import com.shapovalov.app.base.layers.sublayers.ProcessSubLayer;

public class ProcessLayer implements AppComponent {

    public void run() {
        while (true) {
            AppComponent appProcess = new ProcessSubLayer();
            appProcess.run();
        }
    }
}
