package com.epam.task_1.main;

import com.epam.task_1.logic.Salat;
import com.epam.task_1.logic.comparator.WeightComparator;
import com.epam.task_1.logic.cook.impl.CookImpl;
import com.epam.task_1.entity.vegetable.Broccoli;
import com.epam.task_1.entity.vegetable.Carrot;
import com.epam.task_1.entity.vegetable.Cucumber;
import com.epam.task_1.entity.vegetable.Potato;
import com.epam.task_1.reader.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        Salat salat = new Salat();
        CookImpl cook = new CookImpl();
        salat.setName("My Favorite Salat");
        salat.addIngredient(new Potato(ConsoleReader.inputWeight("Potato")));
        cook.cook(ConsoleReader.inputMethod("Potato"));
        salat.addIngredient(new Broccoli(ConsoleReader.inputWeight("Broccoli")));
        cook.cook(ConsoleReader.inputMethod("Broccoli"));
        salat.addIngredient(new Carrot(ConsoleReader.inputWeight("Carrot")));
        cook.cook(ConsoleReader.inputMethod("Carrot"));
        salat.addIngredient(new Cucumber(ConsoleReader.inputWeight("Cucumber")));
        cook.cook(ConsoleReader.inputMethod("Cucumber"));
        salat.sortWeight(new WeightComparator());
        salat.showRecipe();
        int lower = ConsoleReader.inputCaloriesLimit("lower");
        int upper = ConsoleReader.inputCaloriesLimit("upper");
        salat.showIngredientsByCalories(lower, upper);
    }
}
