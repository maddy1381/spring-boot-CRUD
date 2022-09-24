package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

 public	Department saveDepartment(Department department);

 public List<Department> fetchDepartmentList();

 public Department fetchDepartmentById(Long departmentId);

 public void deleteDepartmentbyId(Long departmentId);

 public Department updateDepartment(Long departmentId, Department department);

}
