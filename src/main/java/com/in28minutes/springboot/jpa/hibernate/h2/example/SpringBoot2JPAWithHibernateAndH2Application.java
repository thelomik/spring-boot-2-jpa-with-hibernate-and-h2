package com.in28minutes.springboot.jpa.hibernate.h2.example;

import com.in28minutes.springboot.jpa.hibernate.h2.example.entity.Employee;
import com.in28minutes.springboot.jpa.hibernate.h2.example.entity.Task;
import com.in28minutes.springboot.jpa.hibernate.h2.example.repository.EmploteeRepository;
import com.in28minutes.springboot.jpa.hibernate.h2.example.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@Slf4j
public class SpringBoot2JPAWithHibernateAndH2Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired

    EmploteeRepository emploteeRepository;
    TaskRepository taskRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2JPAWithHibernateAndH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



//        logger.info("Student id 10001 -> {}", repository.findById(10001L));
//
//        logger.info("Inserting -> {}", repository.save(new Student("John", "A1234657")));
//
//        logger.info("Update 10003 -> {}", repository.save(new Student(10001L, "Name-Updated", "New-Passport")));
//
//
//
//        repository.deleteById(10002L);
//
//        logger.info("All users -> {}", repository.findAll());


        emploteeRepository.save(new Employee(1L,"Tomek"));
        emploteeRepository.deleteById(2L);
        logger.info("All users -> {}", emploteeRepository.findAll());

    }
}
