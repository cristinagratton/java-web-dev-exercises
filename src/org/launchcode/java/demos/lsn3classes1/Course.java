package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String subject;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course () {}

    public Course(String subject, Teacher teacher, ArrayList<Student> students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
