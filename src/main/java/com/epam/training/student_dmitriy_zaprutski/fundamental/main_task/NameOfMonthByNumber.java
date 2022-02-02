package com.epam.training.student_dmitriy_zaprutski.fundamental.main_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NameOfMonthByNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = 0;
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Enter number from 1 to 12:");
                numberOfMonth = scanner.nextInt();
                continueLoop = false;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                scanner.nextLine();
                System.out.println("Only integer values allowed");
            }
        } while (continueLoop);
        switch (numberOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You enter invalid value (value must be in the range between 1 and 12)");
                break;
        }
    }
}
