package com.shapovalov.project.app;

public class App {

    AppLayerHandler appLayerHandler = new AppLayerHandler();

    public void run() {
        //состояние слоев нужно обновлять постоянно

        while (true) {
           AppCycleProcess appCycleProcess = new AppCycleProcess();
           appCycleProcess.run();
        }
    }
}
