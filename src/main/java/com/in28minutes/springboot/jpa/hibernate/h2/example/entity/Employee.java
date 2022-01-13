package com.in28minutes.springboot.jpa.hibernate.h2.example.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<Task> tasks;

    public Employee() {
    }

    public Employee(Long id) {
        this.id = id;
    }

    public Employee(int i){super();}

}
