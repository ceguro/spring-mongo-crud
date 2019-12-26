package com.example.springmongocrud.repository;

import com.example.springmongocrud.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

    List findDepartmentByName(String name);
}