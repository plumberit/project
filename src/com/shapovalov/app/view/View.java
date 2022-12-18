package com.shapovalov.app.view;

import java.util.Scanner;

public class View {

    public void greeting() {
        System.out.println("COUNTRIES COMPARISON TOOL");
        System.out.println();
    }

    public void tip() {
        //добавить кавычки
        System.out.println("Type command HELP to see more");
        System.out.println();
    }

    public String getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
