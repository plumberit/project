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

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public void setSquare(int square) {
        this.square = square;
    }
    public void setGDP(long GDP) {
        this.GDP = GDP;
    }
}
