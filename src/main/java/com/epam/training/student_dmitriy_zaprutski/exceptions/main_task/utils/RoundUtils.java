package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundUtils {
    public static double roundNumber(int numberOfSymbolsAfterComma, double number) {
        BigDecimal roundedResult = new BigDecimal(Double.toString(number));
        roundedResult = roundedResult.setScale(numberOfSymbolsAfterComma, RoundingMode.HALF_UP);
        return roundedResult.doubleValue();
    }
}
