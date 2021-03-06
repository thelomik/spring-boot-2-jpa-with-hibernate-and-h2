package com.in28minutes.springboot.jpa.hibernate.h2.example.repository;


import com.in28minutes.springboot.jpa.hibernate.h2.example.entity.Employee;
import com.in28minutes.springboot.jpa.hibernate.h2.example.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{



}
