package com.shapovalov.project.entities.model;

public class Country {

    public Country(int id, String name, long population, int square, long UDP) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.square = square;
        this.UDP = UDP;
    }

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
