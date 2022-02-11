package com.epam.training.student_dmitriy_zaprutski.collections.main_task.sweets;

import java.util.Objects;

public class Chocolate extends Sweet {
    private ChocolateType chocolateType;

    public Chocolate(int id, String name, String manufacturer, int weight, double price, int sugarAmount, ChocolateType chocolateType) {
        super(id, name, manufacturer, weight, price, sugarAmount);
        this.chocolateType = chocolateType;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chocolate chocolate = (Chocolate) o;
        return chocolateType == chocolate.chocolateType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chocolateType);
    }

    @Override
    public String toString() {
        return "\nid = " + getId() + " name = " + getName();
    }
}
