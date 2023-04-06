package com.example.luigivampa.jpa.jpa.course.springData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.luigivampa.jpa.jpa.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
}
