package com.example.springmongocrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Department")
public class Department {

    @Id
    private String id;

    @Indexed(name = "deptName")
    private String name;
    private String description;
    private List employees;

    public Department() {
    }

    public Department(String id) {
        this.id = id;
    }

    public Department(String name, String description, List employees) {
        this.name = name;
        this.description = description;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List getEmployees() {
        return employees;
    }
}