package com.shapovalov.project.app;

public class App {

    public void run() {
        appLayerSwitcher();
    }

    enum AppLayer {
        START_LAYER,
        PROCESS_LAYER;
    }

    AppLayer appLayer = AppLayer.START_LAYER;

    AppLayer appLayerSwitcher() {

    }
}
