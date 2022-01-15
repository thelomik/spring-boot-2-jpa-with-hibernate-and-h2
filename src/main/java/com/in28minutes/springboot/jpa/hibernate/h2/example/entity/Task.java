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


    public Task(Long id, String topic, List<Employee> employees) {
        this.id = id;
        this.topic = topic;
        this.employees = employees;
    }

    public Task() {
    }

    public Task(int i){super();}
    public Task(Long id,String topic) {
        this.topic = topic;
        this.id = id;
    }




}
