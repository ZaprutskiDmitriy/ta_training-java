package com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileToString {

    public static void main(String[] args) throws IOException {
        String fileName = "strings_data.txt";

        String contents1 = readUsingScanner(fileName).trim();
        String contents2 = readUsingFiles(fileName).trim();
        String contents3 = readUsingBufferedReader(fileName).trim();
        System.out.println(contents1);
        System.out.println(contents1.length());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(contents2);
        System.out.println(contents2.length());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(contents3);
        System.out.println(contents3.length());
    }

    public static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    private static String readUsingScanner(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }

}
