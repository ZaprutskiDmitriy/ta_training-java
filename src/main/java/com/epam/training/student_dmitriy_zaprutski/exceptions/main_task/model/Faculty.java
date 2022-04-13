package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.model;

import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions.MissingGroupsException;
import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.utils.RoundUtils;

import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public double getFacultyAverageGradeBySubjectInCertainGroup(String groupName, String subjectName) {
        if (groups == null || groups.isEmpty()) {
            throw new MissingGroupsException("Faculty has no groups");
        }
        double averageGrade = 0;
        for (Group group : groups) {
            if (group.getGroupName().equalsIgnoreCase(groupName)) {
                averageGrade = group.getGroupAverageGradeBySubject(subjectName);
            }
        }
        return RoundUtils.roundNumber(2, averageGrade);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", groups=" + groups +
                '}';
    }
}
