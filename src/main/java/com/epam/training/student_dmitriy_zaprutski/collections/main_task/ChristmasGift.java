package com.epam.training.student_dmitriy_zaprutski.collections.main_task;

import com.epam.training.student_dmitriy_zaprutski.collections.main_task.sweets.Sweet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChristmasGift {
    private List<Sweet> list = new ArrayList<>();

    public void addToList(Sweet candy) {
        list.add(candy);
    }

    public void printList() {
        for (Sweet sweet : list) {
            System.out.println(sweet.getName());
        }
    }

    public void removeFromList(Sweet candy) {
        list.remove(candy);
    }

    public int countWeight() {
        int weight = 0;
        for (Sweet sweet : list) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    public void sortListByName() {
        list.sort(Comparator.comparing(Sweet::getName));
    }

    public void findSweetsWithCertainSugarAmount(int lowerBoundSugarAmount, int higherBoundSugarAmount) {
        if (lowerBoundSugarAmount > higherBoundSugarAmount) {
            System.err.println("You entered wrong values");
        } else {
            for (Sweet sweet : list) {
                if (sweet.getSugarAmount() >= lowerBoundSugarAmount && sweet.getSugarAmount() <= higherBoundSugarAmount) {
                    System.out.println(sweet.getName());
                }
            }
        }
    }
}
