package com.shapovalov.app.view;

import java.util.ArrayList;

public class View {

    private ArrayList<String> information = new ArrayList<>();

    public void setGreeting() {
        information.add("COUNTRIES COMPARISON TOOL");
        information.add("");
    }

    public void setTip() {
        information.add("Type command HELP to see more");
        information.add("");
    }

    public void setResult(ArrayList<String> result) {
        information.addAll(result);
        information.add("");
        information.add("");
    }

    public void setError(ArrayList<String> result) {
        information.addAll(result);
        information.add("");
    }

    public ArrayList<String> getStrokes() {
        return information;
    }
}
