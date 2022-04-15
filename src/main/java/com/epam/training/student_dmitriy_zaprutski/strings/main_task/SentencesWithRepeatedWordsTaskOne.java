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

        String[] sentences = text.split("[\\.!?]");

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        Map<String, Integer> countsMap = new HashMap<>();
        for (String sentence : sentences) {
            Matcher matcher = pattern.matcher(sentence);
            List<String> wordsInCurrentSentence = new ArrayList<>();

            while (matcher.find()) {
                wordsInCurrentSentence.add(matcher.group().toLowerCase());
            }

            for (int i = 0; i < wordsInCurrentSentence.size(); i++) {
                int countOfSentencesWithSuchWord = 0;
                for (int j = 0; j < sentences.length; j++) {
                    Matcher matcher1 = pattern.matcher(sentences[j]);
                    List<String> words = new ArrayList<>();
                    while (matcher1.find()) {
                        words.add(matcher1.group().toLowerCase());
                    }
                    for (int k = 0; k < words.size(); k++) {
                        if (words.get(k).equalsIgnoreCase(wordsInCurrentSentence.get(i))) {
                            countOfSentencesWithSuchWord++;
                            break;
                        }
                    }
                }
                System.out.println("---------------------------------------");
                System.out.println("word : " + wordsInCurrentSentence.get(i));
                System.out.println("number of repetitions : " + countOfSentencesWithSuchWord);
                countsMap.put(wordsInCurrentSentence.get(i), countOfSentencesWithSuchWord);
            }
        }
        System.out.println(countsMap);
        Optional<Map.Entry<String, Integer>> max = countsMap.entrySet().stream().max(Map.Entry.<String, Integer>comparingByValue());
        System.out.println("Maximum number of sentecses " + max.get().getValue() + " with word: '" + max.get().getKey() + "'");
    }
}
