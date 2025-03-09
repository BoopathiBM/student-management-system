package com.boopathi.student_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boopathi.student_management_system.model.Staff;
import com.boopathi.student_management_system.repo.StaffRepository;

@Service
public class StaffService {

    @Autowired
    private  StaffRepository staffRepository;


    public List<Staff> getAllStaff(){
        return staffRepository.findAll();        
    }

    public Optional<Staff> getStaffById(int id){
        return staffRepository.findById(id);
    }
    public Staff saveStaff(Staff staff){
        return staffRepository.save(staff);
    }
    public void deleteStaff(int id){
        staffRepository.deleteById(id);
    }

}
