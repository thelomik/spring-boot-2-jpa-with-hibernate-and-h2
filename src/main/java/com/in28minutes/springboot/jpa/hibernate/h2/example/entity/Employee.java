package com.in28minutes.springboot.jpa.hibernate.h2.example.entity;


import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.REMOVE)
    private List<Task> tasks;

    public Employee() {
    }


    public Employee(Long id,String name) {
        super();
        this.name = name;
        this.id = id;

    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ")";
    }
}
