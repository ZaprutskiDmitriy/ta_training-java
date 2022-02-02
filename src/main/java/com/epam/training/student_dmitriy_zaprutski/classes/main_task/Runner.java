package com.epam.training.student_dmitriy_zaprutski.classes.main_task;

import java.util.Arrays;
import java.util.List;

public class Runner {

    static List<Car> cars = Arrays.asList(
            new Car(1, "BMW", "X6", 2015, Color.WHITE, 45000, "7227 AA-7"),
            new Car(2, "BMW", "X5", 2010, Color.BLACK, 20000, "2243 TA-5"),
            new Car(3, "BMW", "X5", 2020, Color.BLACK, 33000, "3422 TT-6"),
            new Car(4, "BMW", "M5", 2018, Color.BLUE, 90000, "7777 TT-7"),
            new Car(5, "Skoda", "Rapid", 2017, Color.WHITE, 13000, "3232 AB-3"),
            new Car(6, "Skoda", "Superb", 2015, Color.BLACK, 20000, "4654 TP-7"),
            new Car(7, "Skoda", "Octavia", 2021, Color.GREY, 30000, "8436 AE-7"),
            new Car(8, "Audi", "A8", 2015, Color.BLACK, 40000, "3743 ME-5"),
            new Car(9, "Audi", "Q7", 2009, Color.RED, 25000, "2123 AM-4"),
            new Car(10, "Kia", "Sportage", 2012, Color.BLACK, 13000, "5765 AE-7"),
            new Car(11, "Kia", "Optima", 2015, Color.GREY, 16000, "3352 EB-2"),
            new Car(12, "Volkswagen", "Tiguan", 2011, Color.WHITE, 12000, "1243 KI-3"),
            new Car(13, "Volkswagen", "Polo", 2021, Color.BLACK, 18000, "5564 AO-7"),
            new Car(14, "Toyota", "Camry", 2009, Color.BLACK, 12500, "7464 TE-7"),
            new Car(15, "Toyota", "RAV4", 2015, Color.BLACK, 23500, "7555 BI-7"),
            new Car(16, "Toyota", "Tundra", 2011, Color.WHITE, 24500, "5454 EB-1"),
            new Car(17, "Renault", "Talisman", 2017, Color.GREY, 17500, "4679 EA-2")
    );

    public static void main(String[] args) {
        VehicleFleet vehicleFleet = new VehicleFleet(cars);
        System.out.println("List of all cars in vehicle fleet:");
        vehicleFleet.print(cars);
        System.out.println("\nList of cars of a certain brand:");
        List<Car> listOfCarsByBrand = vehicleFleet.getCarsByBrand("bmw");
        vehicleFleet.print(listOfCarsByBrand);
        System.out.println("\nList of cars of a certain model which operated more than certain number of years:");
        List<Car> listOfCarsByModelAndOperatedTime = vehicleFleet.getCarsByModelWhichOperatedMoreThanCertainNumberOfYears("x5", 3);
        vehicleFleet.print(listOfCarsByModelAndOperatedTime);
        System.out.println("\nList of cars of a certain year of issue which cost more than certain price:");
        List<Car> listOfCarsByYearOfIssueAndPrice = vehicleFleet.getCarsByYearOfIssueAndWhichCostMoreThanCertainPrice(2015, 20000);
        vehicleFleet.print(listOfCarsByYearOfIssueAndPrice);
    }
}
