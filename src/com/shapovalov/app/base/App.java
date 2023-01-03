package com.shapovalov.app.base;

import com.shapovalov.app.base.components.AppComponent;
import com.shapovalov.app.base.components.InitializeComponent;
import com.shapovalov.app.base.components.ProcessComponent;
import com.shapovalov.app.base.components.StartComponent;

public class App {

    public void run() {
        runInitializeComponent();
        runStartComponent();
        runProcessComponent();
    }

    private void runInitializeComponent() {
        AppComponent initializeComponent = new InitializeComponent();
        initializeComponent.run();
    }

    private void runStartComponent() {
        AppComponent startComponent = new StartComponent();
        startComponent.run();
    }

    private void runProcessComponent() {
        AppComponent processComponent = new ProcessComponent();
        processComponent.run();
    }
}