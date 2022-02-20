package com.epam.task_1.logic.validator;

public class Validator {
    /***
     * checking for the number of calories that cannot be less than zero
     * @param calories
     */
    public static void validatecalories(int calories) {
        if (calories < 0) {
            throw new RuntimeException("Can't create vegetables with calories" + calories);

        }
    }
    /***
     * checking for the number of weight that cannot be less than zero
     * @param calories
     */
    public static void validateweight(int weight){
        if (weight < 0) {
            throw new IllegalArgumentException("invalid number entered");
        }
    }

}