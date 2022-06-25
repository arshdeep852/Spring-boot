package com.arshdeep.demo.Controller;

import com.arshdeep.demo.Models.Person;
import com.arshdeep.demo.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.Map;

@RestController()
public class Student {

    @Autowired
    private Person person;

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/student")
    public Map createStudent(@RequestBody Person person){
       return studentServices.createStudent(person);
    }

    @GetMapping("/student/{studentId}")
    public Map<String, Object> getStudent(@PathVariable("studentId") String studentId){
        return studentServices.getStudent(studentId);
    }
}
