package com.shapovalov.app.base.layers;

import com.shapovalov.app.base.layers.sublayers.ProcessSubLayer;

public class ProcessLayer implements AppComponent {

    public void run() {
        while (true) {
            ProcessSubLayer appCycleProcess = new ProcessSubLayer();
            appCycleProcess.run();
        }
    }
}
