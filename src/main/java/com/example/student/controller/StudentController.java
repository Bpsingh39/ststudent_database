package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.repository.StudentJpaRepository;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentJpaRepository studentJpaRepository;
    @RequestMapping("/add_student")
    public String add_std(@RequestBody Student student){
        studentJpaRepository.save(student);
        return "std added sucessfully";
    }
    @RequestMapping("/get_student")
    public List<Student> get_std(){
        return studentJpaRepository.findAll();
    }
    @RequestMapping("/update_student")
    public String update_std(@RequestParam String name,@RequestParam Long id){
       Student student= studentJpaRepository.getById(id);
        student.setName(name);
        studentJpaRepository.save(student);
        return "update student sucessfully";
    }
    @RequestMapping("/delet_student")
    public String delet_std(@RequestParam Long id){
        studentJpaRepository.deleteById(id);
        return "delet student sucessfully";
    }
}
