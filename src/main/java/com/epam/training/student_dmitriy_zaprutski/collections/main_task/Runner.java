package com.epam.training.student_dmitriy_zaprutski.collections.main_task;

import com.epam.training.student_dmitriy_zaprutski.collections.main_task.sweets.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static Scanner scanner = new Scanner(System.in);
    static List<Sweet> sweets = Arrays.asList(
            new Candy(0, "Pulmoll", "Kalfany Suesse Werbung GmbH & Co KG", 45, 2, 0, CandyType.LOLLIPOP),
            new Candy(1, "Roks", "Roshen", 20, 15, 1, CandyType.CARAMEL),
            new Candy(2, "Fizzy Boom", "Roshen", 20, 0.7, 16, CandyType.LOLLIPOP),
            new Candy(3, "Chupa-Chups", "Perfetti Van Melle", 12, 0.3, 8, CandyType.LOLLIPOP),
            new Candy(4, "Snickers", "Mars Incorporated", 95, 1.2, 50, CandyType.CHOCOLATE),
            new Candy(5, "Mars", "Mars Incorporated", 50, 0.9, 34, CandyType.CHOCOLATE),
            new Chocolate(6, "Alpen Gold Oreo", "Kraft Foods", 90, 1, 47, ChocolateType.MILK),
            new Chocolate(7, "Alpen Gold Milk", "Kraft Foods", 90, 1, 56, ChocolateType.MILK),
            new Chocolate(8, "Ritter Sport Extra Cocoa", "Alfred Ritter GmbH & Co", 100, 2, 24, ChocolateType.DARK),
            new Chocolate(9, "Ritter Sport Milk", "Alfred Ritter GmbH & Co", 100, 2, 44, ChocolateType.MILK),
            new Chocolate(10, "Nestle Decoration", "Nestle", 85, 0.8, 55, ChocolateType.WHITE),
            new Chocolate(11, "Nestle Hazelnut", "Nestle", 85, 1, 49, ChocolateType.MILK)
    );

    public static void main(String[] args) {
        ChristmasGift giftList = new ChristmasGift();
        printInformation();
        int param = inputValue();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Please enter a sweet ID");
                    System.out.println(sweets);
                    scanner.nextLine();
                    int candyId = inputValue();
                    giftList.addToList(sweets.get(candyId));
                    printInformation();
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Please enter a sweet ID");
                    System.out.println(sweets);
                    scanner.nextLine();
                    int candyIdForDelete = inputValue();
                    giftList.removeFromList(sweets.get(candyIdForDelete));
                    printInformation();
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("List of sweets in gift box:");
                    giftList.printList();
                    printInformation();
                    param = inputValue();
                    break;
                case 4:
                    System.out.println("Weight of all sweets in gift:");
                    System.out.println(giftList.countWeight());
                    printInformation();
                    param = inputValue();
                    break;
                case 5:
                    System.out.println("Sorted list of sweets in gift box by name:");
                    giftList.sortListByName();
                    giftList.printList();
                    printInformation();
                    param = inputValue();
                    break;
                case 6:
                    System.out.println("Please enter a lower value of sugar amount");
                    scanner.nextLine();
                    int fromSugarAmount = inputValue();
                    System.out.println("Please enter a higher value of sugar amount");
                    scanner.nextLine();
                    int toSugarAmount = inputValue();
                    System.out.println("Sweets that contain a given amount of sugar:");
                    giftList.findSweetsWithCertainSugarAmount(fromSugarAmount, toSugarAmount);
                    printInformation();
                    param = inputValue();
                    break;
                default:
                    System.out.println("Please enter correct number in range from information list:");
                    printInformation();
                    scanner.nextLine();
                    param = inputValue();
            }
        }
    }

    private static void printInformation() {
        System.out.println("\nPlease choose an action: \n" +
                "1 - Add candy to gift box \n" +
                "2 - Delete candy from gift box \n" +
                "3 - View Christmas gift list \n" +
                "4 - Count Christmas gift weight \n" +
                "5 - Sort Christmas gift by name \n" +
                "6 - Find sweets with certain sugar amount \n" +
                "0 - Finish collecting gift");
    }

    private static int inputValue() {
        boolean isCorrectValue = false;
        int param = 0;
        do {
            try {
                param = scanner.nextInt();
                isCorrectValue = true;
            } catch (InputMismatchException e) {
                System.err.println("You entered wrong value. Please enter a number:");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("You entered wrong value. Please enter a number in range from sweets list:");
                scanner.nextLine();
            }
        } while (!isCorrectValue);
        return param;
    }
}
