package com.epam.training.student_dmitriy_zaprutski.collections.main_task.sweets;

import java.util.Objects;

public class Sweet {
    private int id;
    private String name;
    private String manufacturer;
    private int weight;
    private double price;
    private int sugarAmount;

    public Sweet(int id, String name, String manufacturer, int weight, double price, int sugarAmount) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.price = price;
        this.sugarAmount = sugarAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return id == sweet.id && weight == sweet.weight && price == sweet.price && sugarAmount == sweet.sugarAmount && Objects.equals(name, sweet.name) && Objects.equals(manufacturer, sweet.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, weight, price, sugarAmount);
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sugarAmount=" + sugarAmount +
                '}';
    }
}
