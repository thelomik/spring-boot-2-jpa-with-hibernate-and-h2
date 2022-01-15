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

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Task> tasks;

    public Employee() {
    }

    public Employee(Long id,String name,List<Task> tasks) {
        super();
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }

    public Employee(int i){super();}

    public Employee(String name) {
        super();
        this.name = name;

    }
    public Employee(Long id,String name) {
        super();
        this.name = name;
        this.id = id;

    }

    @Override
    public String toString(){
        return String.format("Employee [id=%s]",id);
    }

}
