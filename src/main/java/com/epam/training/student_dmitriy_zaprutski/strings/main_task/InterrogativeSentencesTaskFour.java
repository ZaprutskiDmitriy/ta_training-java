package com.epam.training.student_dmitriy_zaprutski.strings.main_task;

import com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils.ReadFileToString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterrogativeSentencesTaskFour {

    //    Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины

    private static final int SEARCH_WORDS_LENGTH = 3;
    private static final String DATA_FILE_PATH = "strings_data.txt";

    public static void main(String[] args) throws IOException {
        String text = ReadFileToString.readUsingBufferedReader(DATA_FILE_PATH);

        Pattern pattern = Pattern.compile("([A-ZА-Я][^.!?]*)\\?", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);
        List<String> interrogativeSentences = new ArrayList<>();
        HashSet<String> wordsWithCertainLength = new HashSet<>();

        while (matcher.find()) {
            interrogativeSentences.add(matcher.group());
        }

        System.out.println("Interrogative sentences:");
        for (String string : interrogativeSentences) {
            System.out.println("=======================================");
            System.out.println(string);
        }

        for (String sentence : interrogativeSentences) {
            Pattern pattern1 = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                    | Pattern.CASE_INSENSITIVE);
            Matcher matcher1 = pattern1.matcher(sentence);
            List<String> words = new ArrayList<>();

            while (matcher1.find()) {
                words.add(matcher1.group().toLowerCase());
            }

            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).length() == SEARCH_WORDS_LENGTH) {
                    wordsWithCertainLength.add(words.get(i));
                }
            }
        }

        System.out.println();
        System.out.println("Number of words with certain length: " + wordsWithCertainLength.size());
        System.out.println("Length of words: " + SEARCH_WORDS_LENGTH);
        for (String string : wordsWithCertainLength) {
            System.out.println("=======================================");
            System.out.println(string);
        }
    }
}
