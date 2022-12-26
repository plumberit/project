package com.shapovalov.app.model;

import java.util.ArrayList;

public class Result {
    ArrayList<String> strokes = new ArrayList<>();
    boolean error;

    public ArrayList<String> getStrokes() {
        return strokes;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
