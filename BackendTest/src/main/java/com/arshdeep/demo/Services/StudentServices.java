package com.arshdeep.demo.Services;


import com.arshdeep.demo.Dao.StudentRespository;
import com.arshdeep.demo.Models.Person;
import com.arshdeep.demo.Models.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StudentServices {

    @Autowired
    private Person person;

    @Autowired
    private StudentRespository studentRespository;




    public Map<String, Object> createStudent(Person person){

        Map<String,Object> resp =new HashMap<>();

        studentRespository.save(person);

        resp.put("details",person);
        return resp;
    }


    public Map<String, Object> getStudent(String studentId){

      Integer stdId =  Integer.valueOf(studentId);


        Map<String,Object> resp =new HashMap<>();
        resp.put("result",studentRespository.findById(Integer.valueOf(studentId)));

        return resp;
    }

}
