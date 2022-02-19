package com.epam.task_1.logic;

import com.epam.task_1.logic.comparator.WeightComparator;
import com.epam.task_1.entity.Vegetable;

import java.util.*;

public class Salat {
    private String name;
    private  List<Vegetable> ingredients = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addIngredient(Vegetable vegetable) {
        this.ingredients.add(vegetable);
    }

    public void showRecipe() {
        if (this.ingredients.isEmpty()) {
            System.out.println("You haven't added any ingredients yet!");
        } else {
            System.out.println("The salad " + this.name + " contains:");

            for (Vegetable vegetable : this.ingredients) {
                System.out.println(vegetable.getName() + " " + (int) vegetable.getWeight() + " gramm");
            }
            System.out.println("Total energy: " + this.countingCalories() + " calories");
        }
    }


    public void sortWeight(WeightComparator comparator) {
       Collections.sort(ingredients,comparator);
        System.out.println("Sort products by weight.......");
    }


    public int countingCalories() {
        int calories = 0;
        Vegetable vegetable;
        for (Iterator<Vegetable> var4 = this.ingredients.iterator();
             var4.hasNext();
             calories += vegetable.getTotalCalories())
            vegetable = var4.next();
        return calories;
    }

    public void showIngredientsByCalories(int lowerCalories, int upperCalories) {

        if (lowerCalories > upperCalories) {
            int t = lowerCalories;
            lowerCalories = upperCalories;
            upperCalories = t;
        }

        System.out.println("Ingredients for calories [" + lowerCalories + ", " + upperCalories + "]");

        for (Vegetable vegetable : this.ingredients) {
            int calories = (int) vegetable.getTotalCalories();
            if (calories >= lowerCalories & calories <= upperCalories) {
                System.out.println(vegetable.getName() + ", " + (int) vegetable.getTotalCalories() + " calories ");
            } else {
                System.out.println("I'm sorry, but there are no such products");
                break;
            }
        }
    }
}



