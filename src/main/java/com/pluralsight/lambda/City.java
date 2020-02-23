package com.pluralsight.lambda;

public class City {
    private String name;

    public City() {};
    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{name=" + name + "}";
    }
}
