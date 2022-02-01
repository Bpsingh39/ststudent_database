package com.example.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="STD_TABLE")
public class Student {
    @Id
            @GeneratedValue
    Long id;
    String name;
    int rool_no;
    char section;

    public Student() {
    }

    public Student(String name, int rool_no, char section) {
        this.name = name;
        this.rool_no = rool_no;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRool_no() {
        return rool_no;
    }

    public void setRool_no(int rool_no) {
        this.rool_no = rool_no;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
