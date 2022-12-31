package com.shapovalov.app.model;

public final class Country {

    public Country(int id, String name, long population, int square, long GDP) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.square = square;
        this.GDP = GDP;
    }

    private int id;
    private String name;
    private long population;
    private int square;
    private long GDP;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public int getSquare() {
        return square;
    }

    public long getGDP() {
        return GDP;
    }
}
