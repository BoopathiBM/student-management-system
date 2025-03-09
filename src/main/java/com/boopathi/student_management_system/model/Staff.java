package com.boopathi.student_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String dept;

    public int getSid() {
        return id;
    }

    public void setSid(int id) {
        this.id = id;
    }

    public String getSname() {
        return name;
    }

    public void setSname(String name) {
        this.name = name;
    }

    public String getSemail() {
        return email;
    }

    public void setSemail(String email) {
        this.email = email;
    }

    public String getSdept() {
        return dept;
    }

    public void setSdept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Staff [sid=" + id + ", sname=" + name + ", semail=" + email + ", sdept=" + dept + "]";
    }



}
