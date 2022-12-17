package com.shapovalov.project.app;

public class App {

    public void run() {
        appLayer = appLayerSwitcher();
    }

    enum AppLayer {
        START_LAYER,
        PROCESS_LAYER;
    }

    AppLayer appLayer;

    AppLayer appLayerSwitcher() {

    }
}
