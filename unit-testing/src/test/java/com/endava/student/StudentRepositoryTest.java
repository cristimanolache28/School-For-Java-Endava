package com.endava.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void itShouldCheckIfStudentExistsEmail() {
        // give
        Student student = new Student(
                "Jamila",
                "jamila@gmail.com",
                Gender.FEMALE
        );
        studentRepository.save(student);
        // when
        Boolean exists = studentRepository.selectExistsEmail(student.getEmail());
        // then
        assertThat(exists).isTrue();
    }
}