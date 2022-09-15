package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Adriana", 34, 3);

        System.out.println(newStudent.getName());

        newStudent.setName("hubs");
        System.out.println(newStudent.getName());

        Course english = new Course("English", "Mx Blah Blag");

        english.addStudent(newStudent);
        ArrayList<Student> roster = english.getClassRoster;
    }
}
