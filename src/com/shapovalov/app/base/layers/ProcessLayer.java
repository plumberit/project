package com.shapovalov.app.base.layers;

import com.shapovalov.app.base.layers.logic.AppCycleProcess;

public class ProcessLayer {

    public void run() {
        while (true) {
            AppCycleProcess appCycleProcess = new AppCycleProcess();
            appCycleProcess.run();
        }
    }
}
