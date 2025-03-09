package com.boopathi.student_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boopathi.student_management_system.model.Department;
import com.boopathi.student_management_system.repo.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();        
    }

    public Optional<Department> getDepartmentById(int id){
        return departmentRepository.findById(id);
    }

    public Department saveDepartment(Department department){
       
        return departmentRepository.save(department);
    }
    public void deleteDepartment(int id){
        departmentRepository.deleteById(id);
    }



}
