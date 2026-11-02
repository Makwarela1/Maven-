package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<>();

    public List <Student> getAllStudents(){
        return this.students;
    }


    public void addStudent(Student student){this.students.add(student);}
}
