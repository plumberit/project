package com.shapovalov.project.app;

public class AppLayerHandler {

    boolean firstCall = false;

    enum AppLayer {
        START_LAYER,
        PROCESS_LAYER;
    }

    AppLayer appLayer = AppLayer.START_LAYER;

    AppLayer appLayerSwitcher() {
        if (!firstCall) {

        }
    }

    AppLayer getAppLayer() {
        return appLayer;
    }
}
