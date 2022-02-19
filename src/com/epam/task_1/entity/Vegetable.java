package com.epam.task_1.entity;

import com.epam.task_1.logic.validator.Validator;

import java.util.Objects;

public class Vegetable {
    private String name;
    private int calories;
    private int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return calories == vegetable.calories && weight == vegetable.weight && Objects.equals(name, vegetable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories, weight);
    }


    public Vegetable(String name, int calories, int gramm) {
        Validator.validateweight(gramm);
        Validator.validatecalories(calories);
        this.name = name;
        this.calories = calories;
        this.weight = gramm;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getTotalCalories() {
        return this.calories * this.weight / 100.0D;
    }
}

