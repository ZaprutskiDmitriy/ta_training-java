package com.epam.training.student_dmitriy_zaprutski.collections.main_task.sweets;

import java.util.Objects;

public class Candy extends Sweet {
    private CandyType candyType;

    public Candy(int id, String name, String manufacturer, int weight, double price, int sugarAmount, CandyType candyType) {
        super(id, name, manufacturer, weight, price, sugarAmount);
        this.candyType = candyType;
    }

    public CandyType getCandyType() {
        return candyType;
    }

    public void setCandyType(CandyType candyType) {
        this.candyType = candyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candy candy = (Candy) o;
        return candyType == candy.candyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), candyType);
    }

    @Override
    public String toString() {
        return "\nid = " + getId() + " name = " + getName();
    }
}
