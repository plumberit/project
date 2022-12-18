package com.shapovalov.project.app.layers;

import com.shapovalov.project.app.layers.logic.AppCycleProcess;

public class ProcessLayer {

    public void run() {
        while (true) {
            AppCycleProcess appCycleProcess = new AppCycleProcess();
            appCycleProcess.run();
        }
    }
}
