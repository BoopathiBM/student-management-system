package com.boopathi.student_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String dept;

    public Student(int number,String name,String email,String dept){
        this.id = number;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public int getnumber(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getdept(){
        return dept;
    }

    public void setnumber(int number){
        this.id = number;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setdept(String dept){
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student [number=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + "]";
    }
    
    

}
