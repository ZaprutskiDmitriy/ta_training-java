package com.epam.training.student_dmitriy_zaprutski.strings.main_task;

import com.epam.training.student_dmitriy_zaprutski.strings.main_task.utils.ReadFileToString;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUniqueWordInTheFirstSentenceTaskThree {

//    Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.

    private static final String DATA_FILE_PATH = "strings_data.txt";

    public static void main(String[] args) throws IOException {
        String text = ReadFileToString.readUsingBufferedReader(DATA_FILE_PATH);

        String[] sentences = text.split("[/.!?]");

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);

            Matcher matcher = pattern.matcher(sentences[0]);
            List<String> wordsInFirstSentence = new ArrayList<>();

            while (matcher.find()) {
                wordsInFirstSentence.add(matcher.group().toLowerCase());
            }

        for (String wordInFirstSentence : wordsInFirstSentence) {
            int countOfSentencesWithSuchWord = 0;
            for (int j = 1; j < sentences.length; j++) {
                Matcher matcher1 = pattern.matcher(sentences[j]);
                List<String> words = new ArrayList<>();
                while (matcher1.find()) {
                    words.add(matcher1.group().toLowerCase());
                }
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordInFirstSentence)) {
                        countOfSentencesWithSuchWord++;
                        break;
                    }
                }
                if (countOfSentencesWithSuchWord > 0) {
                    break;
                }
            }
            if (countOfSentencesWithSuchWord == 0) {
                System.out.println("Unique word from first sentence : " + wordInFirstSentence);
                System.out.println("number of repetitions : " + countOfSentencesWithSuchWord);
            }
        }
    }
}
