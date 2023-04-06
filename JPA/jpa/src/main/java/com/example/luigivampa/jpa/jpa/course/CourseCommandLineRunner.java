package com.example.luigivampa.jpa.jpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.example.luigivampa.jpa.jpa.course.jdbc.CourseJdbcRepository;
// import com.example.luigivampa.jpa.jpa.course.jpa.CourseJpaRepository;
import com.example.luigivampa.jpa.jpa.course.springData.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Monte Cristo 1", "Dumas JPA"));
        repository.save(new Course(2, "Monte Cristo 2", "Dumas JPA1"));
        repository.save(new Course(3, "Monte Cristo 3", "Dumas JPA"));

        repository.deleteById(2l);

        // repository.findById(1);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Dumas JPA1"));
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
