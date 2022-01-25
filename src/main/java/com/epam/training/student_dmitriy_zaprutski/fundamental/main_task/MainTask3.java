package com.epam.training.student_dmitriy_zaprutski.fundamental.main_task;

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of numbers:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        System.out.println("Print numbers with a newline:");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("\nPrint numbers without newline:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
