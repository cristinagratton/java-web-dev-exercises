package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Cristina", 621, 1, 4.0);

        System.out.println("name:" + newStudent.getName());
        System.out.println("studentId:" + newStudent.getStudentId());
        System.out.println("Number Of Credits:" + newStudent.getNumberOfCredits());
        System.out.println("GPA:" + newStudent.getGpa());
    }
}
