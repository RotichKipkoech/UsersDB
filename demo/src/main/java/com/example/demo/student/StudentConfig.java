package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Nash = new Student(
                    "Naomi Cherono",
                    "nashnonnie12@gmail.com",
                    LocalDate.of(2001, Month.APRIL,21)
            );
            Student Kenedy = new Student(
                    "Kenedy Rotich",
                    "kennrottich@gmail.com",
                    LocalDate.of(1994, Month.JANUARY,28)
            );
            Student Ayub = new Student(
                    "Ayub Bett",
                    "bettayub19@gmail.com",
                    LocalDate.of(1998, Month.DECEMBER,21)
            );

            repository.saveAll(
                    List.of(Nash, Kenedy, Ayub)
            );
        };
    }
}
