package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.model;

import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions.MissingSubjectsException;
import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.utils.RoundUtils;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Subject> subjects;

    public Student(String firstName, String lastName, List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getStudentAverageGradeByAllSubjects() {
        if (!isSubjectExist()) {
            throw new MissingSubjectsException("Student has no subjects");
        }
        double sum = 0;
        for (Subject subject : subjects) {
            sum += subject.getAverageGradeBySubject();
        }
        double averageGrade = sum / subjects.size();
        return RoundUtils.roundNumber(2, averageGrade);
    }

    public double getStudentAverageGradeBySubject(String subjectName) {
        if (!isSubjectExist()) {
            throw new MissingSubjectsException("Student has no subjects");
        }
        double averageGrade = 0;
        for (Subject subject : subjects) {
            if (subject.getSubjectName().toString().equalsIgnoreCase(subjectName))
            averageGrade = subject.getAverageGradeBySubject();
        }
        return RoundUtils.roundNumber(2, averageGrade);
    }

    private boolean isSubjectExist() {
        if (subjects == null ||subjects.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
