package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceTest extends TestCase {
//    Student student1 = new Student(1234567, "Makwarela");
//    Student student2 = new Student(1234567, "Makwarela");
//    Student student3 = new Student(1234567, "Makwarela");

//    private List<Student> students = new ArrayList<>();

    StudentService service = new StudentService();

    @Test
    public void testGetAllStudents() {
//        assertEquals("Makwarela", student1.name);
        List<Student> listOfStudents = service.getAllStudents();
        boolean actualResults = listOfStudents.isEmpty();
        assertEquals(true, actualResults); // OR assertTrue(actualResults); -- PRODUCE SUCCESSFUL. SINCE ARRAYLIST IS EMPTY
    }

//    @Test
//    public void setStudents(){
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//    }

    public void testAddStudent() {
    }
}