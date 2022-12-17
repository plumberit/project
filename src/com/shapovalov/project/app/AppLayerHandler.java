package com.shapovalov.project.app;

import java.util.ArrayList;

public class AppLayerHandler {

    private enum AppLayer {
        START_LAYER,
        PROCESS_LAYER;
    }

    private ArrayList<AppLayer> layerOrder = new ArrayList<>();

    private AppLayer appLayer;

    AppLayerHandler() {
        appLayer = AppLayer.START_LAYER;

        layerOrder.add(AppLayer.START_LAYER);
        layerOrder.add(AppLayer.PROCESS_LAYER);
    }

    public AppLayer updateAppLayer() {
        for (int i = 0; i < layerOrder.size(); i++) {
            if(layerOrder.get(i)==appLayer) {
                appLayer = layerOrder.get(i + 1);
                break;
            }
        }
        return appLayer;
    }
}
