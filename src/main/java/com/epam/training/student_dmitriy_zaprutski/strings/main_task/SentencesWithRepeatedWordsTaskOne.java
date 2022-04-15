package com.epam.training.student_dmitriy_zaprutski.strings.main_task;

import com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils.ReadFileToString;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentencesWithRepeatedWordsTaskOne {

    //    Найти наибольшее количество предложений текста, в которых есть одинаковые слова (одинаковые слова в разных предложениях)

    private static final String DATA_FILE_PATH = "strings_data.txt";

    public static void main(String[] args) throws IOException {
        String text = ReadFileToString.readUsingBufferedReader(DATA_FILE_PATH);

        String[] sentences = text.split("[/.!?]");

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        Map<String, Integer> countsMap = new HashMap<>();
        for (String sentence : sentences) {
            Matcher matcher = pattern.matcher(sentence);
            List<String> wordsInCurrentSentence = new ArrayList<>();

            while (matcher.find()) {
                wordsInCurrentSentence.add(matcher.group().toLowerCase());
            }

            for (String wordInCurrentSentence : wordsInCurrentSentence) {
                int countOfSentencesWithSuchWord = 0;
                for (String otherSentence : sentences) {
                    Matcher matcher1 = pattern.matcher(otherSentence);
                    List<String> words = new ArrayList<>();
                    while (matcher1.find()) {
                        words.add(matcher1.group().toLowerCase());
                    }
                    for (String word : words) {
                        if (word.equalsIgnoreCase(wordInCurrentSentence)) {
                            countOfSentencesWithSuchWord++;
                            break;
                        }
                    }
                }
                System.out.println("---------------------------------------");
                System.out.println("word : " + wordInCurrentSentence);
                System.out.println("number of repetitions : " + countOfSentencesWithSuchWord);
                countsMap.put(wordInCurrentSentence, countOfSentencesWithSuchWord);
            }
        }
        System.out.println(countsMap);
        Optional<Map.Entry<String, Integer>> max = countsMap.entrySet().stream().max(Map.Entry.comparingByValue());
        max.ifPresent(stringIntegerEntry -> System.out.println("Maximum number of sentences " + stringIntegerEntry.getValue() + " with word: '" + stringIntegerEntry.getKey() + "'"));
    }
}
