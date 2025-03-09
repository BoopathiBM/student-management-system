package com.boopathi.student_management_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boopathi.student_management_system.model.Staff;
import com.boopathi.student_management_system.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @GetMapping
    public List<Staff> getAllStaff(){
        return staffService.getAllStaff();
    }

    @GetMapping("/{id}")
    public Optional<Staff> getStaffById(@PathVariable int id){
        return staffService.getStaffById(id);
    }

    @PostMapping
    public Staff addStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);
    }

    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable int id, @RequestBody Staff staff){
        staff.setSid(id);
        return staffService.saveStaff(staff);
    }
    @DeleteMapping("/{id}")
    public void deleteStaffById(@PathVariable int id){
        staffService.deleteStaff(id);
    }


}
