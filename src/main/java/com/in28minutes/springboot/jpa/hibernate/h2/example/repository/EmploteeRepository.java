package com.in28minutes.springboot.jpa.hibernate.h2.example.repository;

import com.in28minutes.springboot.jpa.hibernate.h2.example.entity.Employee;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmploteeRepository extends JpaRepository<Employee, Long> {

    Employee findByName(String name);



}
