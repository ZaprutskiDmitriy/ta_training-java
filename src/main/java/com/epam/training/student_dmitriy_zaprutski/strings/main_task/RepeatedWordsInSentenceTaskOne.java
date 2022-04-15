package com.epam.training.student_dmitriy_zaprutski.strings.main_task;

import com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils.ReadFileToString;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RepeatedWordsInSentenceTaskOne {

    //    Найти наибольшее количество предложений текста, в которых есть одинаковые слова (одинаковые слова в одном предложении)

    private static final String DATA_FILE_PATH = "strings_data.txt";

    public static void main(String[] args) throws IOException {
        String text = ReadFileToString.readUsingBufferedReader(DATA_FILE_PATH);

        String[] sentences = text.split("[/.!?]");

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        for (String sentence : sentences) {
            Matcher matcher = pattern.matcher(sentence);
            List<String> words = new ArrayList<>();

            while (matcher.find()) {
                words.add(matcher.group().toLowerCase());
            }

            Set<String> stringSet = new HashSet<>();
            Set<String> setOfDuplicates = words.stream().filter(e -> !stringSet.add(e)).collect(Collectors.toSet());
            if (!setOfDuplicates.isEmpty()) {
                System.out.println(sentence.trim());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                setOfDuplicates.forEach(System.out::println);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }

            boolean isExistDuplicateWords = false;
            for (int i = 0; i < words.size() - 1; i++) {
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equalsIgnoreCase(words.get(j))) {
                        isExistDuplicateWords = true;
                        break;
                    }
                }
                if (isExistDuplicateWords) {
                    System.out.println(sentence.trim());
                    System.out.println("================================================================");
                    System.out.println();
                    break;
                }
            }
        }
    }
}

