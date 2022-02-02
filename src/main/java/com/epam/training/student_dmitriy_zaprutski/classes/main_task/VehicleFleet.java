package com.epam.training.student_dmitriy_zaprutski.classes.main_task;

import java.util.*;

public class VehicleFleet {
    private List<Car> cars;

    public VehicleFleet(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsByBrand(String carBrand) {
        List<Car> listOfCarsByBrand = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCarBrand().equalsIgnoreCase(carBrand)) {
                listOfCarsByBrand.add(car);
            }
        }
        return listOfCarsByBrand;
    }

    public List<Car> getCarsByModelWhichOperatedMoreThanCertainNumberOfYears(String model, int numberOfYearsOfOperation) {
        List<Car> listOfCarsByModelAndTimeOfOperation = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) &&
                    Calendar.getInstance().get(Calendar.YEAR) - car.getYearOfIssue() > numberOfYearsOfOperation) {
                listOfCarsByModelAndTimeOfOperation.add(car);
            }
        }
        return listOfCarsByModelAndTimeOfOperation;
    }

    public List<Car> getCarsByYearOfIssueAndWhichCostMoreThanCertainPrice(int yearOfIssue, int price) {
        List<Car> listOfCarsByYearOfIssueAndWhichCostMoreThanCertainPrice = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfIssue() == yearOfIssue && car.getPrice() > price) {
                listOfCarsByYearOfIssueAndWhichCostMoreThanCertainPrice.add(car);
            }
        }
        return listOfCarsByYearOfIssueAndWhichCostMoreThanCertainPrice;
    }

    public void print(Collection<Car> collection) {
        for (Car car : collection) {
            System.out.println(car);
        }
    }
}
