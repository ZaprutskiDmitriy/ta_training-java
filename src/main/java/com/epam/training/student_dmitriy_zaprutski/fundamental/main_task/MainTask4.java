package com.epam.training.student_dmitriy_zaprutski.fundamental.main_task;

public class MainTask4 {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            mult *= Integer.parseInt(args[i]);
        }
        System.out.println("Sum of numbers = " + sum);
        System.out.println("Multiplication result: " + mult);
    }
}
