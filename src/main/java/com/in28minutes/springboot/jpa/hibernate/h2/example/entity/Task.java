package com.in28minutes.springboot.jpa.hibernate.h2.example.entity;


import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;


@Entity
public class Task {


    @Id
    @GeneratedValue
    private Long id;
    private String topic;
    @ManyToMany(mappedBy = "tasks")
    private List<Employee> employees;


    public Task(int i) {
        this.id = (long) i;
    }

    public Task(int i, String name) {
        this.id = (long) i;
        this.topic = name;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


}
