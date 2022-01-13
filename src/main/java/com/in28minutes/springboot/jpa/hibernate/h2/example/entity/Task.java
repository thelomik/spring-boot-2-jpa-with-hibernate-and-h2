package com.in28minutes.springboot.jpa.hibernate.h2.example.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Task {

    public Task() {
    }

    public Task(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(mappedBy = "tasks")
    private List<Employee> employees;


    public Task(int i){super();}


}
