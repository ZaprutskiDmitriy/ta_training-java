package com.epam.training.student_dmitriy_zaprutski.fundamental.main_task;

public class ArgumentsInReverseOrder {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Argument #" + i + " " + args[i]);
        }
    }
}
