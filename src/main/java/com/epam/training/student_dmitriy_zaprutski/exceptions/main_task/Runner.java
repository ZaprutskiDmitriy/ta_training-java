package com.epam.training.student_dmitriy_zaprutski.exceptions.main_task;

import com.epam.training.student_dmitriy_zaprutski.exceptions.main_task.model.*;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Subject math1 = new Subject(SubjectType.MATH, new int[]{7, 9, 5, 4});
        Subject physics1 = new Subject(SubjectType.PHYSICS, new int[]{8, 8, 5, 5});
        Subject math2 = new Subject(SubjectType.MATH, new int[]{9, 6, 4, 9});
        Subject physics2 = new Subject(SubjectType.PHYSICS, new int[]{7, 5, 3});
        Subject math3 = new Subject(SubjectType.MATH, new int[]{10, 8, 5, 9});
        Subject physics3 = new Subject(SubjectType.PHYSICS, new int[]{8, 9, 9});
        Subject math4 = new Subject(SubjectType.MATH, new int[]{4, 3, 3, 5, 8});
        Subject physics4 = new Subject(SubjectType.PHYSICS, new int[]{4, 9, 4, 8});
        Subject math5 = new Subject(SubjectType.MATH, new int[]{7, 8, 7, 2, 9});
        Subject physics5 = new Subject(SubjectType.PHYSICS, new int[]{6, 3, 8, 6});
        Subject math6 = new Subject(SubjectType.MATH, new int[]{6, 5, 6, 8, 8});
        Subject physics6 = new Subject(SubjectType.PHYSICS, new int[]{8, 8, 7, 8});
        Student student1 = new Student("Alex", "Brown", Arrays.asList(math1, physics1));
        Student student2 = new Student("Dan", "Black", Arrays.asList(math2, physics2));
        Student student3 = new Student("John", "White", Arrays.asList(math3, physics3));
        Student student4 = new Student("Jack", "Blue", Arrays.asList(math4, physics4));
        Student student5 = new Student("Rachel", "Green", Arrays.asList(math5, physics5));
        Student student6 = new Student("Andrew", "Grey", Arrays.asList(math6, physics6));
        Group group1 = new Group("Group1", Arrays.asList(student1, student2));
        Group group2 = new Group("Group2", Arrays.asList(student3, student4));
        Group group3 = new Group("Group3", Arrays.asList(student5, student6));
        Faculty faculty1 = new Faculty("Faculty1", Arrays.asList(group1, group2));
        Faculty faculty2 = new Faculty("Faculty2", List.of(group3));
        University university = new University("University1", Arrays.asList(faculty1, faculty2));


        System.out.println(student1.getFirstName() + " " + student1.getLastName() +
                " list of subjects: " + student1.getSubjects());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() +
                " average grade by all subjects: " + student1.getStudentAverageGradeByAllSubjects());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() +
                " average grade by Math: " + student1.getStudentAverageGradeBySubject("Math"));
        System.out.println(student1.getFirstName() + " " + student1.getLastName() +
                " average grade by Physics: " + student1.getStudentAverageGradeBySubject("Physics"));
        System.out.println("==================================================================================");
        System.out.println(student2.getFirstName() + " " + student2.getLastName() +
                " list of subjects: " + student2.getSubjects());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() +
                " average grade by all subjects: " + student2.getStudentAverageGradeByAllSubjects());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() +
                " average grade by Math: " + student2.getStudentAverageGradeBySubject("Math"));
        System.out.println(student2.getFirstName() + " " + student2.getLastName() +
                " average grade by Physics: " + student2.getStudentAverageGradeBySubject("Physics"));
        System.out.println("==================================================================================");
        System.out.println("Students in group " + group1.getGroupName() + " : " + group1.getStudents());
        System.out.println(group1.getGroupName() +
                " average grade by Math: " + group1.getGroupAverageGradeBySubject("Math"));
        System.out.println(group1.getGroupName() +
                " average grade by Physics: " + group1.getGroupAverageGradeBySubject("Physics"));
        System.out.println("==================================================================================");
        System.out.println("Students in group " + group2.getGroupName() + " : " + group2.getStudents());
        System.out.println(group2.getGroupName() +
                " average grade by Math: " + group2.getGroupAverageGradeBySubject("Math"));
        System.out.println(group2.getGroupName() +
                " average grade by Physics: " + group2.getGroupAverageGradeBySubject("Physics"));
        System.out.println("==================================================================================");
        System.out.println(faculty1.getFacultyName() + " groups: " + faculty1.getGroups());
        System.out.println(faculty1.getFacultyName() + " average grade in Group1 by Math: " +
                faculty1.getFacultyAverageGradeBySubjectInCertainGroup("Group1", "Math"));
        System.out.println(faculty1.getFacultyName() + " average grade in Group2 by Math: " +
                faculty1.getFacultyAverageGradeBySubjectInCertainGroup("Group2", "Math"));
        System.out.println("==================================================================================");
        System.out.println("Students in group " + group3.getGroupName() + " : " + group3.getStudents());
        System.out.println(group3.getGroupName() +
                " average grade by Math: " + group3.getGroupAverageGradeBySubject("Math"));
        System.out.println(group3.getGroupName() +
                " average grade by Physics: " + group3.getGroupAverageGradeBySubject("Physics"));
        System.out.println("==================================================================================");
        System.out.println(faculty2.getFacultyName() + " groups: " + faculty2.getGroups());
        System.out.println(faculty2.getFacultyName() + " average grade in Group3 by Math: " +
                faculty2.getFacultyAverageGradeBySubjectInCertainGroup("Group3", "Math"));
        System.out.println("==================================================================================");
        System.out.println(university.getUniversityName() + " " + university.getFaculties());
        System.out.println(university.getUniversityName() + " average grade by Math: " +
                university.getUniversityAverageGradeBySubject("Math"));
        System.out.println(university.getUniversityName() + " average grade by Physics: " +
                university.getUniversityAverageGradeBySubject("Physics"));
        System.out.println("==================================================================================");
        System.out.println("==================================================================================");
        System.out.println("==================================================================================");
        System.out.println(student1.getFirstName() + " " + student1.getLastName() +
                " average grade by Math: " + student1.getStudentAverageGradeBySubject("Math"));
        System.out.println(student2.getFirstName() + " " + student2.getLastName() +
                " average grade by Math: " + student2.getStudentAverageGradeBySubject("Math"));
        System.out.println(student3.getFirstName() + " " + student3.getLastName() +
                " average grade by Math: " + student3.getStudentAverageGradeBySubject("Math"));
        System.out.println(student4.getFirstName() + " " + student4.getLastName() +
                " average grade by Math: " + student4.getStudentAverageGradeBySubject("Math"));
        System.out.println(student5.getFirstName() + " " + student5.getLastName() +
                " average grade by Math: " + student5.getStudentAverageGradeBySubject("Math"));
        System.out.println(student6.getFirstName() + " " + student6.getLastName() +
                " average grade by Math: " + student6.getStudentAverageGradeBySubject("Math"));
        System.out.println(group1.getGroupName() +
                " average grade by Math: " + group1.getGroupAverageGradeBySubject("Math"));
        System.out.println(group2.getGroupName() +
                " average grade by Math: " + group2.getGroupAverageGradeBySubject("Math"));
        System.out.println(group3.getGroupName() +
                " average grade by Math: " + group3.getGroupAverageGradeBySubject("Math"));
        System.out.println(faculty1.getFacultyName() + " average grade in Group1 by Math: " +
                faculty1.getFacultyAverageGradeBySubjectInCertainGroup("Group1", "Math"));
        System.out.println(faculty1.getFacultyName() + " average grade in Group2 by Math: " +
                faculty1.getFacultyAverageGradeBySubjectInCertainGroup("Group2", "Math"));
        System.out.println(faculty2.getFacultyName() + " average grade in Group3 by Math: " +
                faculty2.getFacultyAverageGradeBySubjectInCertainGroup("Group3", "Math"));
        System.out.println(university.getUniversityName() + " average grade by Math: " +
                university.getUniversityAverageGradeBySubject("Math"));
    }
}
