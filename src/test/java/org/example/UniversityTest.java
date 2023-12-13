package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {

    @Test
    public void getAllStudents() {
        Student student1 = new Student("Евгений", 40, true);
        Student student2 = new Student("Марина", 33, false);
        Student student3 = new Student("Алина", 35, false);

        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        List<Student> expected = university.getAllStudents();

        List<Student> actual = new ArrayList<Student>();

        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        assertEquals(expected, actual);
    }
}
