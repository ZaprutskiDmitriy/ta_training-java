package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.model;

import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions.MissingFacultiesException;
import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.utils.RoundUtils;

import java.util.List;

public class University {
    private String universityName;
    private List<Faculty> faculties;

    public University(String universityName, List<Faculty> faculties) {
        this.universityName = universityName;
        this.faculties = faculties;
    }

    public University(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public double getUniversityAverageGradeBySubject(String subjectName) {
        if (faculties == null || faculties.isEmpty()) {
            throw new MissingFacultiesException("University has no faculties");
        }
        double sum = 0;
        int count = 0;
        double averageGrade = 0;
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroups()) {
                averageGrade = faculty.getFacultyAverageGradeBySubjectInCertainGroup(group.getGroupName(), subjectName);
                if (averageGrade != 0) {
                    sum += averageGrade;
                    count++;
                }
            }
        }
        double averageGradeByUniversity = sum / count;
        return Math.round(averageGradeByUniversity * 10.0) / 10.0;
    }

    @Override
    public String toString() {
        return "University{" +
                "faculties=" + faculties +
                '}';
    }
}
