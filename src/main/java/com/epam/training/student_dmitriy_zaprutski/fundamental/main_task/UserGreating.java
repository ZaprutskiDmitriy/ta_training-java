package com.epam.training.student_dmitriy_zaprutski.fundamental.main_task;

import java.util.Scanner;

public class UserGreating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
    }
}
