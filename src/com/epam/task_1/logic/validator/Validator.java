package com.epam.task_1.logic.validator;

public class Validator {

    public static void validatecalories(int calories) {
        if (calories < 0) {
            throw new RuntimeException("Can't create vegetables with calories" + calories);

        }
    }

    public static void validateweight(int weight){
        if (weight < 0) {
            throw new IllegalArgumentException("invalid number entered");
        }
    }

}