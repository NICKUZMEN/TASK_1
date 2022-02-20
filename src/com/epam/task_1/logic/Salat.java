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

    /***
     * go through the list and output the name and weight parameter
     */
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

    /***
     *Sorting the list of arrays using the comparator
     * @param comparator compares two objects.
     */
    public void sortWeight(WeightComparator comparator) {
       Collections.sort(ingredients,comparator);
        System.out.println("Sort products by weight.......");
    }

    /***
     *we go through the list of vegetables counting calories in it.
     *  Until the list ends, we continue to count calories
     * @return the sum of all calories in the list of ingredients
     */
    public int countingCalories() {
        int calories = 0;
        Vegetable vegetable;
        for (Iterator<Vegetable> var4 = this.ingredients.iterator();
             var4.hasNext();
             calories += vegetable.getTotalCalories())
            vegetable = var4.next();
        return calories;
    }

    /***
     * creating limits by which we can see which ingredient in the list has the number of calories
     * @param lowerCalories lower calorie limit
     * @param upperCalories upper calorie limit
     */
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



