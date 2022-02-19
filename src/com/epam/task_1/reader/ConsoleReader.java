package com.epam.task_1.reader;

import java.util.Scanner;

public class ConsoleReader {

    public static int inputCaloriesLimit(String lvl) {

        Scanner q = new Scanner(System.in);
        System.out.println("enter " + lvl + " calorie limit");
        return q.nextInt();
    }

    public static int inputWeight(String name) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of grams for " + name + " :");
        return s.nextInt();
    }

    public static String inputMethod(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cooking method "+ name);
        String phrase1 = sc.nextLine();
        System.out.println("Method of cooking "+ name + " " + phrase1);
        return phrase1;
    }
}

