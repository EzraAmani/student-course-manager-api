package com.studentmanager.student_course_manager_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories; 

@SpringBootApplication
@ComponentScan(basePackages = "com.studentmanager")
@EntityScan(basePackages = "com.studentmanager.entity")
@EnableJpaRepositories(basePackages = "com.studentmanager.repository") 
public class StudentCourseManagerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentCourseManagerApiApplication.class, args);
    }

}