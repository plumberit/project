package com.shapovalov.app.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    public void output(ArrayList<String> strokes) {
        for(String stroke : strokes) {
            System.out.println(stroke);
        }
    }

    public String input() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
