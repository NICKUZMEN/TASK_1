package com.epam.task_1.reader;

import java.util.Scanner;

public class ConsoleReader {
    /***
     * entering the limit of calories from the keyboard
     * @param lvl
     * @return the number of the user entered from the keyboard
     */
    public static int inputCaloriesLimit(String lvl) {

        Scanner q = new Scanner(System.in);
        System.out.println("enter " + lvl + " calorie limit");
        return q.nextInt();
    }

    /***
     * entering the weight from the keyboard
     * @param name Vegetable
     * @return the number of the user entered from the keyboard
     */
    public static int inputWeight(String name) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of grams for " + name + " :");
        return s.nextInt();
    }

    /***
     * entering the method of cooking the product from the keyboard
     * @param name
     * @return the user string entered from the keyboard
     */
    public static String inputMethod(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cooking method "+ name);
        String phrase1 = sc.nextLine();
        System.out.println("Method of cooking "+ name + " " + phrase1);
        return phrase1;
    }
}

