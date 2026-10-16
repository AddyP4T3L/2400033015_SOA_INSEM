package com.klu.testing;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

    List<Student> findByMarksGreaterThan(int marks);

}