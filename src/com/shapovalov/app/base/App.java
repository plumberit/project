package com.shapovalov.app.base;

import com.shapovalov.app.base.components.AppComponent;
import com.shapovalov.app.base.components.InitializeComponent;
import com.shapovalov.app.base.components.ProcessComponent;
import com.shapovalov.app.base.components.StartComponent;

public class App {

    public void run() {

        //объявление компонентов программы
        AppComponent initializeComponent, startComponent, processComponent;

        //инициализация компонентов
        initializeComponent = new InitializeComponent();
        startComponent = new StartComponent();
        processComponent = new ProcessComponent();

        //последовательное исполнение компонентов
        initializeComponent.run();
        startComponent.run();
        processComponent.run();
    }
}