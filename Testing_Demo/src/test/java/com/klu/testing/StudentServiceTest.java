package com.klu.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentServiceTest {

    @Test
    void calculateGradeTest() {
        StudentService service = new StudentService();

        String res = service.calculateGrade(85);

        assertEquals("B", res);
    }
    
    
    @Test
    void GradeBtest() {
        StudentService service = new StudentService();

        String res = service.calculateGrade(85);

        assertEquals("B", res);
    }
    
    @Test
    void GradeCTest() {
        StudentService service = new StudentService();

        String res = service.calculateGrade(65);

        assertEquals("C", res);
    }
}