package com.shapovalov.app.base;

import com.shapovalov.app.base.components.*;

public class App {

    public void run() {
        runComponent(new InitializeComponent());
        runComponent(new StartComponent());
        runComponent(new ProcessComponent());
    }

    private void runComponent(Component component) {
        component.run();
    }

    public interface Component {
        public void run();
    }
}