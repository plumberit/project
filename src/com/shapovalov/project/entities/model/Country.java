package com.shapovalov.project.entities.model;

public class Country {
    private int id;
    private String name;
    private long population;
    private int square;
    private long UDP;

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

    public long getUDP() {
        return UDP;
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
    public void setUDP(long UDP) {
        this.UDP = UDP;
    }
}
