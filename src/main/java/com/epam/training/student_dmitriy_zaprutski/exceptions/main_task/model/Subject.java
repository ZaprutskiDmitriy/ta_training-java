package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.model;

import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions.GradeOutOfRangeException;
import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.utils.RoundUtils;

import java.util.Arrays;

public class Subject {
//    private String subjectName;
    private SubjectType subjectName;
    private int[] grades;

    public Subject(SubjectType subjectName, int[] grades) {
        this.subjectName = subjectName;
        this.grades = grades;
    }

    public SubjectType getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(SubjectType subjectName) {
        this.subjectName = subjectName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double getAverageGradeBySubject() {
        double sum = 0;
        for(int grade : grades) {
            if (grade < 0 || grade > 10) {
                throw new GradeOutOfRangeException("Grade must be in range between 0 and 10, but was: " + grade);
            }
            sum += grade;
        }
        double averageGrade = sum / grades.length;
        return RoundUtils.roundNumber(2, averageGrade);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
