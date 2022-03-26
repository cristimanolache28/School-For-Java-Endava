package com.endava.amigoscode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @AfterEach
    void tearDown() {
        studentRepository.deleteAll();
    }

    @Test
    void itShouldCheckIfStudentEmailExists() {
        // give
        String email = "jamila@gmail.com";
        Student student = new Student(
                "Jamila",
                email,
                Gender.FEMALE
        );
        studentRepository.save(student);

        // when
        Boolean exists = studentRepository.selectExistsEmail(email);

        // then
        assertThat(exists).isTrue();
    }

    @Test
    void itShouldCheckIfStudentEmailDoesNotExists() {
        // give
        String email = "jamila@gmail.com";

        // when
        Boolean exists = studentRepository.selectExistsEmail(email);

        // then
        assertThat(exists).isFalse();
    }

}