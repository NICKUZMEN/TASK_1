package com.epam.task_1.logic.comparator;

import com.epam.task_1.entity.Vegetable;

import java.util.Comparator;

public class WeightComparator implements Comparator <Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}
