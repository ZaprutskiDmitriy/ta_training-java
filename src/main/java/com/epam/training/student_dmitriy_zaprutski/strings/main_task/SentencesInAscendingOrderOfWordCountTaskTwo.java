package com.epam.training.student_dmitriy_zaprutski.strings.main_task;

import com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils.ReadFileToString;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentencesInAscendingOrderOfWordCountTaskTwo {

//    Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них

    private static final String DATA_FILE_PATH = "strings_data.txt";

    public static void main(String[] args) throws IOException {
        String text = ReadFileToString.readUsingBufferedReader(DATA_FILE_PATH);

        String[] sentences = text.split("[\\.!?]");

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        Map<String, Integer> sentencesMap = new HashMap<>();
        for (String sentence : sentences) {
            Matcher matcher = pattern.matcher(sentence);
            List<String> words = new ArrayList<>();

            while (matcher.find()) {
                words.add(matcher.group().toLowerCase());
            }

            sentencesMap.put(sentence.trim(), words.size());
        }
        sentencesMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(System.out::println);
    }
}
