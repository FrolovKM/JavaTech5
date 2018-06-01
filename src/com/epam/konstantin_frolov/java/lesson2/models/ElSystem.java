package com.epam.konstantin_frolov.java.lesson2.models;

import com.epam.konstantin_frolov.java.lesson2.interfaces.ESystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ElSystem implements ESystem {
    private List<Something> something = null;

    public ElSystem() {
        this.something = new ArrayList<>();
    }

    public List<Something> getSomething() {
        return something;
    }

    public void add(Something something) {
        this.something.add(something);
    }

    public void sort() {
        this.something.sort((firstSomething, secondSomething) -> {
            Integer firstWeight = firstSomething.getWeight();
            Integer secondWeight = secondSomething.getWeight();
            return firstWeight.compareTo(secondWeight);
        });
    }

    public int getElSystemPower() {
        return this.something.stream()
                .map(Something::getPower)
                .reduce(0, (a, b) -> a + b);
    }

    public List<Something> findSomethingByWeight(int min, int max) {
        return this.something.stream().filter(something -> {
            int weight = something.getWeight();
            return weight >= min && weight <= max;
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "[Object] ElSystem";
    }
}