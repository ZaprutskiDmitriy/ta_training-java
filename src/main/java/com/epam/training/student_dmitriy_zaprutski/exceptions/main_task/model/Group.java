package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.model;

import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.exceptions.MissingStudentsException;
import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.utils.RoundUtils;

import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getGroupAverageGradeBySubject(String subjectName) {
        if (students == null || students.isEmpty()) {
            throw new MissingStudentsException("Group has no students");
        }
        double sum = 0;
        int countStudentsWithCertainSubject = 0;
        for (Student student : students) {
            double averageGrade = student.getStudentAverageGradeBySubject(subjectName);
            if (averageGrade != 0)
                sum += student.getStudentAverageGradeBySubject(subjectName);
                countStudentsWithCertainSubject++;
        }
        double averageGradeByGroup = sum / countStudentsWithCertainSubject;
        return RoundUtils.roundNumber(2, averageGradeByGroup);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + students +
                '}';
    }
}
