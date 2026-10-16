package com.klu.testing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;

    @Test
    void saveStudentTest() {

        Student student = new Student("Ravi", "ravi@gmail.com", 90);

        Student saved = studentRepo.save(student);

        assertThat(saved.getId()).isNotNull();
        assertThat(saved.getName()).isEqualTo("Ravi");
        assertThat(saved.getMarks()).isEqualTo(90);
    }

    @Test
    void findStudentTest() {

        Student student = new Student(
                "Priya",
                "priya@gmail.com",
                90
        );

        Student saved = studentRepo.save(student);

        Student found = studentRepo.findById(saved.getId())
                .orElse(null);

        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("Priya");
        assertThat(found.getMarks()).isEqualTo(90);
    }

    @Test
    void findStudentsWithHighMarksTest() {

        Student s1 = new Student(
                "Ravi",
                "ravi@gmail.com",
                85
        );

        Student s2 = new Student(
                "Priya",
                "priya@gmail.com",
                95
        );

        Student s3 = new Student(
                "Rahul",
                "rahul@gmail.com",
                55
        );

        studentRepo.save(s1);
        studentRepo.save(s2);
        studentRepo.save(s3);

        List<Student> students =
                studentRepo.findByMarksGreaterThan(80);

        assertThat(students).hasSize(2);
    }

    @Test
    void deleteStudentTest() {

        Student student = new Student(
                "Arjun",
                "arjun@gmail.com",
                70
        );

        Student saved = studentRepo.save(student);

        Long id = saved.getId();

        studentRepo.deleteById(id);

        boolean exists = studentRepo.existsById(id);

        assertThat(exists).isFalse();
    }
}