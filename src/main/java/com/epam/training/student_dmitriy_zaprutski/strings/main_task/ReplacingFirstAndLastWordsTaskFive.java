package com.epam.training.student_dmitriy_zaprutski.strings.main_task;

import com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils.ReadFileToString;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacingFirstAndLastWordsTaskFive {

    // В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения

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
            if (!words.isEmpty()) {
                String firstWord = words.get(0);
                String lastWord = words.get(words.size() - 1);
                String lastWordWithFirstUpperLetter = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);
                words.set(0, lastWordWithFirstUpperLetter);
                words.set(words.size() - 1, firstWord);

                StringBuilder builder = new StringBuilder();
                for (String string : words) {
                    builder.append(string).append(" ");
                }

                System.out.println(builder);
                System.out.println("=======================================");
            }
        }
    }
}
