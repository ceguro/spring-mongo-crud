package com.example.springmongocrud.controller;

import com.example.springmongocrud.model.Department;
import com.example.springmongocrud.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    DepartmentRepository departmentRepository;
    Department department;

    public DepartmentController() {
    }

    public DepartmentController(DepartmentRepository departmentRepository, Department department) {
        this.departmentRepository = departmentRepository;
        this.department = department;
    }

    @PostMapping
    public Department createDept(@RequestBody Department department) {
        departmentRepository.save(department);
        return department;
    }

    @GetMapping
    public List listDepts() {
        return departmentRepository.findAll();
    }

    @PutMapping("/{deptId}")
    public Department updateDept(@RequestBody Department department, @PathVariable String deptId) {

        departmentRepository.save(department);
        return department;
    }

    @DeleteMapping("/{deptId}")
    public String deleteDept(@PathVariable String deptId) {
        departmentRepository.deleteById(deptId);
        return deptId;
    }


    @GetMapping("/{deptName}")
    public List findDeptByName(@PathVariable String deptName) {
        return departmentRepository.findDepartmentByName(deptName);
    }
}
